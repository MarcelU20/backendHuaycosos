package pe.edu.upc.semana9.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.semana9.dtos.BookDTO;
import pe.edu.upc.semana9.entities.Book;
import pe.edu.upc.semana9.services.IBookService;
import pe.edu.upc.semana9.services.IBookService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bS;
    @PostMapping
    public void insert(@RequestBody BookDTO dto) {
        ModelMapper m = new ModelMapper();
        Book b = m.map(dto, Book.class);
        bS.insert(b);
    }
    @GetMapping
    public List<BookDTO> list() {
        return bS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, BookDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/buscar")
    public List<BookDTO> search(@RequestBody LocalDate fecha){
        return bS.find(fecha).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, BookDTO.class);
        }).collect(Collectors.toList());
    }
}
