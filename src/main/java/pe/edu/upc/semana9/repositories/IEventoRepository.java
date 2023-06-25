package pe.edu.upc.semana9.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.semana9.entities.Evento;

import java.util.List;

@Repository
public interface IEventoRepository extends JpaRepository<Evento,Integer> {

    @Query(value = "SELECT u.nombres,count(e.id_evento) from eventos e \n" +
            "join usuarios u on  e.id_evento = u.id_usuario \n" +
            "group by u.nombres ORDER BY COUNT(u.nombres) DESC", nativeQuery = true)
    List<String[]> getCountEventoByUsuario();
}
