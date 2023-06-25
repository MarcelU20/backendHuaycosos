package pe.edu.upc.semana9.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.semana9.dtos.CuentabancariaDTO;
import pe.edu.upc.semana9.dtos.UsuarioCuentaDTO;
import pe.edu.upc.semana9.entities.Cuentabancaria;
import pe.edu.upc.semana9.services.ICuentabancariaService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/cuentabancarias")
public class CuentabancariaController {
    @Autowired
    private ICuentabancariaService bS;
    @PostMapping
    public void insert(@RequestBody CuentabancariaDTO dto){
        ModelMapper m=new ModelMapper();
        Cuentabancaria b=m.map(dto,Cuentabancaria.class);
        bS.insert(b);
    }
    @GetMapping
    public List<CuentabancariaDTO> list(){
        return bS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, CuentabancariaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        bS.delete(id);
    }
    @GetMapping("/{id}")
    public CuentabancariaDTO listId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        CuentabancariaDTO dto=m.map(bS.listId(id),CuentabancariaDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody CuentabancariaDTO dto){
        ModelMapper m =new ModelMapper();
        Cuentabancaria b=m.map(dto,Cuentabancaria.class);
        bS.insert(b);
    }

    @GetMapping("/cuenta-count")
    public List<UsuarioCuentaDTO> getCuentaCountByUsuario() {
        List<UsuarioCuentaDTO> cuentaUsuarioDTOs = bS.reportec1();
        return cuentaUsuarioDTOs;
    }

    @GetMapping("/cuenta-max")
    public List<UsuarioCuentaDTO> getCuentaMaxByUsuario() {
        List<UsuarioCuentaDTO> cuentaUsuarioDTOs = bS.reportec2();
        return cuentaUsuarioDTOs;
    }

}
