package pe.edu.upc.semana9.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.semana9.dtos.TipoDeCasoDTO;
import pe.edu.upc.semana9.entities.TipoDeCaso;
import pe.edu.upc.semana9.services.ITipoDeCasoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipodecaso")
public class TipoDeCasoController {
    @Autowired
    private ITipoDeCasoService tcS;

    @PostMapping
    public void insert(@RequestBody TipoDeCasoDTO dto) {
        ModelMapper m = new ModelMapper();
        TipoDeCaso tc = m.map(dto, TipoDeCaso.class);
        tcS.insert(tc);
    }

    @GetMapping
    public List<TipoDeCasoDTO> list() {
        return tcS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TipoDeCasoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        tcS.delete(id);
    }

    @GetMapping("/{id}")
    public TipoDeCasoDTO lisId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        TipoDeCasoDTO dto = m.map(tcS.listId(id), TipoDeCasoDTO.class);
        return dto;
    }
    @PutMapping
    public void goupdate(@RequestBody TipoDeCasoDTO dto){
        ModelMapper m = new ModelMapper();
        TipoDeCaso tc = m.map(dto, TipoDeCaso.class);
        tcS.insert(tc);
    }
}
