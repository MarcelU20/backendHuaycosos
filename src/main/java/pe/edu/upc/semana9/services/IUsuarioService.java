package pe.edu.upc.semana9.services;


import pe.edu.upc.semana9.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public Integer insert(Usuario usuario);
    List<Usuario> list();
    public void delete(int idUsuario);
    public Usuario listId(int idUsuario);
}
