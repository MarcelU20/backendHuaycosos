package pe.edu.upc.semana9.entities;

import javax.persistence.*;

@Entity
@Table(name="tipodecaso")
public class TipoDeCaso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipodecaso;
    @Column(name = "nombre", length = 100, nullable = false)
    private String nombre;
    @Column(name="descripcion", length = 200, nullable = false)
    private String descripcion;

    public TipoDeCaso() {
    }

    public TipoDeCaso(int idTipoDeCaso, String nombre, String descripcion) {
        this.idTipodecaso = idTipoDeCaso;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdTipoDeCaso() {
        return idTipodecaso;
    }

    public void setIdTipoDeCaso(int idTipoDeCaso) {
        this.idTipodecaso = idTipoDeCaso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
