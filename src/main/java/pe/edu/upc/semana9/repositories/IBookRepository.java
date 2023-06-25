package pe.edu.upc.semana9.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.semana9.entities.Book;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface IBookRepository extends JpaRepository<Book,Integer> {
    @Query("from Book b where b.publicationDateBook=:fecha")
    List<Book> buscarLibro(@Param("fecha")LocalDate fecha);
}
