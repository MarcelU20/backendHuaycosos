package pe.edu.upc.semana9.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.semana9.entities.Cuentabancaria;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface ICuentabancariaRepository extends JpaRepository<Cuentabancaria,Integer>{
    @Query(value = "SELECT u.nombres,count(c.id_cuentabancaria) from cuentabancarias c \n" +
            "join usuarios u on  c.id_usuario = u.id_usuario \n" +
            "group by u.nombres ORDER BY COUNT(u.nombres) DESC", nativeQuery = true)
    List<String[]> getCountCuentaByUsuario();

    @Query(value = "SELECT u.nombres,count(c.id_cuentabancaria) from cuentabancarias c \n" +
            "join usuarios u on  c.id_usuario = u.id_usuario \n" +
            "group by u.nombres ORDER BY COUNT(u.nombres) DESC LIMIT 1", nativeQuery = true)
    List<String[]> getMaxCuentaByUsuario();
}
