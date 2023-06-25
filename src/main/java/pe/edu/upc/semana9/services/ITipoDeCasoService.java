package pe.edu.upc.semana9.services;

import pe.edu.upc.semana9.entities.TipoDeCaso;

import java.util.List;

public interface ITipoDeCasoService {
    public void insert(TipoDeCaso tipoDeCaso);

    List<TipoDeCaso> list();

    public void delete(int idTipoDeCaso);

    public TipoDeCaso listId(int idTipoDeCaso);
}