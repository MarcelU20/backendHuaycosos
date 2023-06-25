package pe.edu.upc.semana9.servicesImplement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.semana9.entities.Author;
import pe.edu.upc.semana9.entities.Mensaje;
import pe.edu.upc.semana9.repositories.IMensajeRepository;
import pe.edu.upc.semana9.services.IMensajeService;

import java.time.LocalDate;
import java.util.List;

@Service
public class MensajeServiceImplement implements IMensajeService {
    @Autowired
    private IMensajeRepository mR;

    @Override
    public void insert(Mensaje mensaje) {
        mR.save(mensaje);
    }

    @Override
    public List<Mensaje> list() {
        return mR.findAll();
    }

    @Override
    public void delete(int idMensaje) {

            mR.deleteById(idMensaje);

    }

    @Override
    public Mensaje listId(int idMensaje) {
        return mR.findById(idMensaje).orElse(new Mensaje());
    }

    @Override
    public List<Mensaje> find(Integer id) {
        return mR.buscarMensajePorIdDamnificado(id);
    }

}
