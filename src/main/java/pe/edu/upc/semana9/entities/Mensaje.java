package pe.edu.upc.semana9.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity

@Table(name = "mensajes")

public class Mensaje {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMensaje;

    @Column(name = "descripcion",length = 200, nullable = false)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name="idUsuario1")
    private Usuario usuario1;

    @ManyToOne
    @JoinColumn(name="idUsuario2")
    private Usuario usuario2;

    public Mensaje() {
    }

    public Mensaje(int idMensaje, String descripcion, Usuario usuario1, Usuario usuario2) {
        this.idMensaje = idMensaje;
        this.descripcion = descripcion;
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
    }

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
