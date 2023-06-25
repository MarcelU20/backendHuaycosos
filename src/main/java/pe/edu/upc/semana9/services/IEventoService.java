package pe.edu.upc.semana9.services;
import pe.edu.upc.semana9.dtos.UsuarioCuentaDTO;
import pe.edu.upc.semana9.dtos.UsuarioEventoDTO;
import pe.edu.upc.semana9.entities.Evento;

import java.util.List;

public interface IEventoService {
    public void insert(Evento evento);
    List<Evento> list();
    public Evento listId(int idEvento);

    public void delete(int idEvento);

    public List<UsuarioEventoDTO> reporteu1();

}
