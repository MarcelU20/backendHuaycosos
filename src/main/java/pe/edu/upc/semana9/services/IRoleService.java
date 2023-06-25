package pe.edu.upc.semana9.services;

import pe.edu.upc.semana9.entities.Role;
import pe.edu.upc.semana9.entities.TipoDeCaso;

import java.util.List;

public interface IRoleService {
    public void insert(Role role);
    public void delete(Long idRole);
    List<Role> list();
    public Role listId(Long id);
}
