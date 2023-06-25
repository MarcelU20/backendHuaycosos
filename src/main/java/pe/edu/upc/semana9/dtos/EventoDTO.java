package pe.edu.upc.semana9.dtos;
import pe.edu.upc.semana9.entities.Donador;
import pe.edu.upc.semana9.entities.Usuario;

import java.time.LocalDate;

public class EventoDTO {
    private int idEvento;
    private String descripcion;
    private String ubicacion;
    private LocalDate inicio;
    private LocalDate fin;
    private Usuario user;

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
