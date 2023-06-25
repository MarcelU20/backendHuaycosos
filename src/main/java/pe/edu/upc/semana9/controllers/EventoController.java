package pe.edu.upc.semana9.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.semana9.dtos.EventoDTO;
import pe.edu.upc.semana9.dtos.UsuarioCuentaDTO;
import pe.edu.upc.semana9.dtos.UsuarioEventoDTO;
import pe.edu.upc.semana9.entities.Evento;
import pe.edu.upc.semana9.services.IEventoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/eventos")
public class EventoController {
    @Autowired
    private IEventoService eS;

    @PostMapping
    public void insert(@RequestBody EventoDTO dto) {

        ModelMapper m = new ModelMapper();
        Evento e = m.map(dto, Evento.class);
        eS.insert(e);
    }

    @GetMapping
    public List<EventoDTO> list() {
        return eS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, EventoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        eS.delete(id);
    }
    @GetMapping("/{id}")
    public EventoDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        EventoDTO dto = m.map(eS.listId(id), EventoDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody EventoDTO dto) {
        ModelMapper m=new ModelMapper();
        Evento e=m.map(dto,Evento.class);
        eS.insert(e);
    }

    @GetMapping("/evento-count")
    public List<UsuarioEventoDTO> getEventoCountByUsuario() {
        List<UsuarioEventoDTO> eventoUsuarioDTOs = eS.reporteu1();
        return eventoUsuarioDTOs;
    }
}
