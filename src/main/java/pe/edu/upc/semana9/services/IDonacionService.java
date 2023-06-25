package pe.edu.upc.semana9.services;

import pe.edu.upc.semana9.entities.Donacion;
import pe.edu.upc.semana9.entities.Ubicacion;

import java.util.List;

public interface IDonacionService {
    public void insert(Donacion donacion);
    List<Donacion> list();

    public void delete(int idDonacion);

    public Donacion listId(int idDonacion);
}
