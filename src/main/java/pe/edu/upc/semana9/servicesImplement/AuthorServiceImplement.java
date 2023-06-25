package pe.edu.upc.semana9.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.semana9.entities.Author;
import pe.edu.upc.semana9.repositories.IAuthorRepository;
import pe.edu.upc.semana9.services.IAuthorService;

import java.util.List;

@Service
public class AuthorServiceImplement implements IAuthorService {

@Autowired //enlazamos la capa repository y el service uwu
    private IAuthorRepository aR;

    @Override
    public void insert(Author author) {
        aR.save(author);
    }

    @Override
    public List<Author> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int idAuthor) {
        aR.deleteById(idAuthor);
    }

    @Override
    public Author listId(int idAuthor) {
        return aR.findById(idAuthor).orElse(new Author());
    }
}
