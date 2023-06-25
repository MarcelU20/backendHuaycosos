package pe.edu.upc.semana9.services;

import pe.edu.upc.semana9.entities.Author;

import java.util.List;

public interface IAuthorService {
    public void insert(Author author);
    List<Author> list();
    public void delete(int idAuthor);
    public Author listId(int idAuthor);
}
