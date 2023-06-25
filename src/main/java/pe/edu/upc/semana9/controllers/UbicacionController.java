package pe.edu.upc.semana9.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.semana9.dtos.UbicacionCountDTO;
import pe.edu.upc.semana9.dtos.UbicacionDTO;
import pe.edu.upc.semana9.dtos.UsuarioEventoDTO;
import pe.edu.upc.semana9.entities.Ubicacion;
import pe.edu.upc.semana9.services.IUbicacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ubicaciones")
public class UbicacionController {
    @Autowired
    private IUbicacionService uS;

    @PostMapping
    public void insert(@RequestBody UbicacionDTO dto) {

        ModelMapper m = new ModelMapper();
        Ubicacion u = m.map(dto, Ubicacion.class);
        uS.insert(u);
    }

    @GetMapping
    public List<UbicacionDTO> list() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UbicacionDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        uS.delete(id);
    }

    @GetMapping("/{id}")
    public UbicacionDTO listId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        UbicacionDTO dto = m.map(uS.listId(id), UbicacionDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody UbicacionDTO dto) {
        ModelMapper m=new ModelMapper();
        Ubicacion u=m.map(dto,Ubicacion.class);
        uS.insert(u);
    }

    @GetMapping("/ubicacion-count")
    public List<UbicacionCountDTO> getUbicacionCount() {
        List<UbicacionCountDTO> ubicacionCountDTOS = uS.reporteu2();
        return ubicacionCountDTOS;
    }
}
