package pe.edu.upc.semana9.services;

import pe.edu.upc.semana9.entities.Book;

import java.time.LocalDate;
import java.util.List;

public interface IBookService {
    public void insert(Book book);
    List<Book> list();
    List<Book> find(LocalDate fecha);

}
