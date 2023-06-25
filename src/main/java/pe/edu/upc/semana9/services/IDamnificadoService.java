package pe.edu.upc.semana9.services;

import pe.edu.upc.semana9.entities.Damnificado;

import java.util.List;

public interface IDamnificadoService {
    public void insert(Damnificado damnificado);
    List<Damnificado> list();
    public void delete(int idDamnificado);
    public Damnificado listId(int idDamnificado);
}
