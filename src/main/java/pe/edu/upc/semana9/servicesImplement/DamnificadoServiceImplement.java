package pe.edu.upc.semana9.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.semana9.entities.Damnificado;
import pe.edu.upc.semana9.repositories.IAuthorRepository;
import pe.edu.upc.semana9.repositories.IDamnificadoRepository;
import pe.edu.upc.semana9.services.IDamnificadoService;

import java.util.List;

@Service
public class DamnificadoServiceImplement implements IDamnificadoService {

    @Autowired //enlazamos la capa repository y el service uwu
    private IDamnificadoRepository dR;
    @Override
    public void insert(Damnificado damnificado) {
        dR.save(damnificado);
    }

    @Override
    public List<Damnificado> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idDamnificado) {
        dR.deleteById(idDamnificado);
    }

    @Override
    public Damnificado listId(int idDamnificado) {
        return dR.findById(idDamnificado).orElse(new Damnificado());
    }
}
