package pe.edu.upc.semana9.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.semana9.entities.Donacion;
import pe.edu.upc.semana9.entities.TipoDeCaso;
import pe.edu.upc.semana9.entities.Ubicacion;
import pe.edu.upc.semana9.repositories.IDonacionRepository;
import pe.edu.upc.semana9.services.IDonacionService;

import java.util.List;

@Service
public class DonacionServiceImplement implements IDonacionService {

    @Autowired
    private IDonacionRepository donacionR;

    @Override
    public void insert(Donacion donacion) {
        donacionR.save(donacion);
    }

    @Override
    public List<Donacion> list() {
        return donacionR.findAll();
    }

    @Override
    public void delete(int idDonacion) {
        donacionR.deleteById(idDonacion);
    }

    @Override
    public Donacion listId(int idDonacion) {
        return donacionR.findById(idDonacion).orElse(new Donacion());
    }
}
