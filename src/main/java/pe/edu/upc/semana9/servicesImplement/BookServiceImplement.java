package pe.edu.upc.semana9.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.semana9.entities.Book;
import pe.edu.upc.semana9.repositories.IBookRepository;
import pe.edu.upc.semana9.services.IBookService;

import java.time.LocalDate;
import java.util.List;

@Service
public class BookServiceImplement implements IBookService {
@Autowired
    private IBookRepository bR;

    @Override
    public void insert(Book book) {
      bR.save(book);
    }

    @Override
    public List<Book> list() {
        return bR.findAll();
    }

    @Override
    public List<Book> find(LocalDate fecha) {
        return bR.buscarLibro(fecha);
    }
}
