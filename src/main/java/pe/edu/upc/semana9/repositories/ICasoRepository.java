package pe.edu.upc.semana9.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.semana9.entities.Caso;

@Repository
public interface ICasoRepository extends JpaRepository<Caso,Integer> {
}
