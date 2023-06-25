package pe.edu.upc.semana9.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.semana9.entities.Book;
import pe.edu.upc.semana9.entities.Mensaje;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IMensajeRepository extends JpaRepository<Mensaje,Integer> {

    @Query("from Mensaje b where b.usuario1.idUsuario=:id")
    List<Mensaje> buscarMensajePorIdDamnificado(@Param("id") Integer id);
}
