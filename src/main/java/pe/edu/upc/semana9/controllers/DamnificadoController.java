package pe.edu.upc.semana9.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.semana9.dtos.DamnificadoDTO;
import pe.edu.upc.semana9.entities.Damnificado;
import pe.edu.upc.semana9.services.IDamnificadoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController // esta clase va a servir como controlador de tipo rest
@RequestMapping("/Damnificados")
public class DamnificadoController {
    @Autowired
    private IDamnificadoService dS;

    @PostMapping
    public void insert(@RequestBody DamnificadoDTO dto){
        ModelMapper m=new ModelMapper();//nos permite transferir
        Damnificado a=m.map(dto,Damnificado.class);
        dS.insert(a);
    }

    @GetMapping
    public List<DamnificadoDTO> list(){
        return dS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DamnificadoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        dS.delete(id);
    }

    @GetMapping("/{id}")
    public DamnificadoDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        DamnificadoDTO dto=m.map(dS.listId(id),DamnificadoDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody DamnificadoDTO dto){
        ModelMapper m=new ModelMapper();
        Damnificado a=m.map(dto,Damnificado.class);
        dS.insert(a);
    }
}
