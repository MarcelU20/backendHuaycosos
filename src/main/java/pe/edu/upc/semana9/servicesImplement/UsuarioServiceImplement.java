package pe.edu.upc.semana9.servicesImplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.semana9.entities.Usuario;
import pe.edu.upc.semana9.repositories.IUsuarioRepository;
import pe.edu.upc.semana9.services.IUsuarioService;

import java.util.List;

@Service
public class    UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;
    @Override
    public Integer insert(Usuario usuario) {
        int rpta = uR.buscarUsername(usuario.getUsername());
        if (rpta == 0) {
            uR.save(usuario);
        }
        return rpta;
    }

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int idUsuario) {
        uR.deleteById(idUsuario);
    }

    @Override
    public Usuario listId(int idUsuario) {
        return uR.findById(idUsuario).orElse(new Usuario());
    }
}
