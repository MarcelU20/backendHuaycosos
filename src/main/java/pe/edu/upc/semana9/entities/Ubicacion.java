package pe.edu.upc.semana9.entities;

import javax.persistence.*;
@Entity
@Table(name="ubicaciones")
public class Ubicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUbicacion;
    @Column(name = "departamento", length = 60, nullable = false)
    private String departamento;
    @Column(name = "distrito",length = 40,nullable = false)
    private String distrito;
    @Column(name = "direccion",length = 35, nullable = false)
    private String direccion;

    public Ubicacion() {
    }

    public Ubicacion(int idUbicacion, String departamento, String distrito, String direccion) {
        this.idUbicacion = idUbicacion;
        this.departamento = departamento;
        this.distrito = distrito;
        this.direccion = direccion;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
