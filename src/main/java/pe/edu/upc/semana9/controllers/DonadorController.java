package pe.edu.upc.semana9.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.semana9.dtos.DonadorDTO;
import pe.edu.upc.semana9.entities.Donador;
import pe.edu.upc.semana9.services.IDonadorService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Donadores")
public class DonadorController {

    @Autowired
    private IDonadorService dS;

    @PostMapping
    public void insert(@RequestBody DonadorDTO dto){
        ModelMapper m=new ModelMapper();
        Donador d= m.map(dto, Donador.class);
        dS.insert(d);
    }

    @GetMapping
    public List<DonadorDTO> list(){
        return dS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x, DonadorDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        dS.delete(id);
    }

    @GetMapping("/{id}")
    public DonadorDTO listId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        DonadorDTO dto=m.map(dS.listId(id), DonadorDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody DonadorDTO dto){
        ModelMapper m = new ModelMapper();
        Donador d= m.map(dto, Donador.class);
        dS.insert(d);
    }

    @PostMapping("/buscar")
    public List<DonadorDTO> search(@RequestBody int id){
        return dS.find(id).stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x, DonadorDTO.class);
        }).collect(Collectors.toList());
    }
}