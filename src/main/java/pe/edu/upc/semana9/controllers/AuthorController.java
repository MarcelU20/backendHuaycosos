package pe.edu.upc.semana9.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.semana9.dtos.AuthorDTO;
import pe.edu.upc.semana9.entities.Author;
import pe.edu.upc.semana9.services.IAuthorService;

import java.util.List;
import java.util.stream.Collectors;

@RestController // esta clase va a servir como controlador de tipo rest
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    private IAuthorService aS;

    @PostMapping
    public void insert(@RequestBody AuthorDTO dto){
        ModelMapper m=new ModelMapper();//nos permite transferir
        Author a=m.map(dto,Author.class);
        aS.insert(a);
    }

    @GetMapping
    public List<AuthorDTO> list(){
       return aS.list().stream().map(x->{
          ModelMapper m=new ModelMapper();
          return m.map(x,AuthorDTO.class);
       }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        aS.delete(id);
    }

    @GetMapping("/{id}")
    public AuthorDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        AuthorDTO dto=m.map(aS.listId(id),AuthorDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody AuthorDTO dto){
        ModelMapper m=new ModelMapper();
        Author a=m.map(dto,Author.class);
        aS.insert(a);
    }
}
