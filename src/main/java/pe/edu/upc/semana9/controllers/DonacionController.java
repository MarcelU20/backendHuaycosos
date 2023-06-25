package pe.edu.upc.semana9.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.semana9.dtos.DonacionDTO;
import pe.edu.upc.semana9.dtos.UbicacionDTO;
import pe.edu.upc.semana9.entities.Donacion;
import pe.edu.upc.semana9.entities.Ubicacion;
import pe.edu.upc.semana9.services.IDonacionService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/donaciones")
public class DonacionController {
    @Autowired
    private IDonacionService donacionS;

    @PostMapping
    public void insert(@RequestBody DonacionDTO dto){
        ModelMapper m=new ModelMapper();
        Donacion d= m.map(dto, Donacion.class);
        donacionS.insert(d);
    }

    @GetMapping
    public List<DonacionDTO> list(){
        return donacionS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x, DonacionDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        donacionS.delete(id);
    }

    @GetMapping("/{id}")
    public DonacionDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        DonacionDTO dto=m.map(donacionS.listId(id),DonacionDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody DonacionDTO dto){
        ModelMapper m=new ModelMapper();
        Donacion a=m.map(dto,Donacion.class);
        donacionS.insert(a);
    }
}
