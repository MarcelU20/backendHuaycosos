package pe.edu.upc.semana9.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.semana9.entities.Donador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.time.LocalDate;
import java.util.List;
@Repository
public interface IDonadorRepository extends JpaRepository<Donador, Integer> {
    @Query("from Donador d where d.idDonador=:id")
    List<Donador> buscarDonador(@Param("id")int id);
}