package pe.edu.upc.semana9.dtos;

import pe.edu.upc.semana9.entities.Damnificado;
import pe.edu.upc.semana9.entities.Donador;
import pe.edu.upc.semana9.entities.Usuario;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class MensajeDTO {
    private int idMensaje;

    private String descripcion;

    private Usuario usuario1;

    private Usuario usuario2;
    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(Usuario usuario1) {
        this.usuario1 = usuario1;
    }

    public Usuario getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(Usuario usuario2) {
        this.usuario2 = usuario2;
    }
}
