package pe.edu.upc.semana9.servicesImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.semana9.entities.TipoDeCaso;
import pe.edu.upc.semana9.repositories.ITipoDeCasoRepository;
import pe.edu.upc.semana9.services.ITipoDeCasoService;

import java.util.List;

@Service
public class TipoDeCasoServiceImplement implements ITipoDeCasoService {
    @Autowired
    private ITipoDeCasoRepository tcR;

    @Override
    public void insert(TipoDeCaso tipoDeCaso) {
        tcR.save(tipoDeCaso);
    }

    @Override
    public List<TipoDeCaso> list() {
        return tcR.findAll();
    }

    @Override
    public void delete(int idTipoDeCaso) {
        tcR.deleteById(idTipoDeCaso);
    }

    @Override
    public TipoDeCaso listId(int idTipoDeCaso) {
        return tcR.findById(idTipoDeCaso).orElse(new TipoDeCaso());
    }
}
