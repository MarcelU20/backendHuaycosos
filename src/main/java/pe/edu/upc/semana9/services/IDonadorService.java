package pe.edu.upc.semana9.services;

import pe.edu.upc.semana9.entities.Donador;

import java.util.List;

public interface IDonadorService {
    public void insert(Donador donador);
    List<Donador> list();

    public void delete(int idDonador);
    public Donador listId(int idDonador);
    List<Donador> find(int id);
}