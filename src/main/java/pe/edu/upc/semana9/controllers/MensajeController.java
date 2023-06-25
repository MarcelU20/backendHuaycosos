package pe.edu.upc.semana9.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.semana9.dtos.AuthorDTO;
import pe.edu.upc.semana9.dtos.MensajeDTO;
import pe.edu.upc.semana9.entities.Mensaje;
import pe.edu.upc.semana9.services.IMensajeService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/mensajes")
public class MensajeController {
    @Autowired
    private IMensajeService mS;
    @PostMapping
    public void insert(@RequestBody MensajeDTO dto) {
        ModelMapper m = new ModelMapper();
        Mensaje b = m.map(dto, Mensaje.class);
        mS.insert(b);
    }
    @GetMapping
    public List<MensajeDTO> list() {
        return mS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MensajeDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        mS.delete(id);
    }

    @GetMapping("/{id}")
    public MensajeDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        MensajeDTO dto=m.map(mS.listId(id),MensajeDTO.class);
        return dto;
    }

    @PostMapping("/BuscarPorIdDamnificado")
    public List<MensajeDTO> search(@RequestBody Integer id){
        return mS.find(id).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MensajeDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void goUpdate(@RequestBody MensajeDTO dto){
        ModelMapper m=new ModelMapper();
        Mensaje a=m.map(dto,Mensaje.class);
        mS.insert(a);
    }
}
