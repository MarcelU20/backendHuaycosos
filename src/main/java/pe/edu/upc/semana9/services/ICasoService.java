package pe.edu.upc.semana9.services;

import pe.edu.upc.semana9.entities.Caso;

import java.util.List;

public interface ICasoService {
    public void insert(Caso caso);
    List<Caso> list();
    public void delete(int idCaso);
    public Caso listId(int idCaso);
}