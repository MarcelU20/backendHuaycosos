package pe.edu.upc.semana9.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.semana9.entities.Ubicacion;

import java.util.List;

@Repository
public interface IUbicacionRepository extends JpaRepository<Ubicacion,Integer>{
    @Query(value = "SELECT departamento,count(id_ubicacion) from ubicaciones \n" +
            "group by departamento ORDER BY COUNT(departamento) DESC", nativeQuery = true)
    List<String[]> getCountUbicacion();
}