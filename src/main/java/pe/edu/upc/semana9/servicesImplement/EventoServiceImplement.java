package pe.edu.upc.semana9.servicesImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.semana9.dtos.UsuarioCuentaDTO;
import pe.edu.upc.semana9.dtos.UsuarioEventoDTO;
import pe.edu.upc.semana9.entities.Evento;
import pe.edu.upc.semana9.repositories.IEventoRepository;
import pe.edu.upc.semana9.services.IEventoService;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventoServiceImplement implements IEventoService {
    @Autowired
    private IEventoRepository eR;
    @Override
    public void insert(Evento evento){
        eR.save(evento);
    }
    @Override
    public List<Evento>list(){
        return  eR.findAll();
    }
    @Override
    public Evento listId(int idEvento){
        return eR.findById(idEvento).orElse(new Evento());
    }
    @Override
    public void delete(int idEvento) {

        eR.deleteById(idEvento);

    }

    @Override
    public List<UsuarioEventoDTO> reporteu1() {
        List<String[]> countEventoByUsuario = eR.getCountEventoByUsuario();
        List<UsuarioEventoDTO> eventoUsuarioDTOs = new ArrayList<>();

        for (String[] data : countEventoByUsuario) {
            UsuarioEventoDTO dto = new UsuarioEventoDTO();
            dto.setNombreUsuario(data[0]);
            dto.setEventoCount(Integer.parseInt(data[1]));
            eventoUsuarioDTOs.add(dto);
        }

        return eventoUsuarioDTOs;
    }
}

