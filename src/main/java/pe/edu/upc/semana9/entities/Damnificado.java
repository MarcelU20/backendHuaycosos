package pe.edu.upc.semana9.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "damnificados")

public class Damnificado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDamnificado;
    @Column(name = "dni",length = 60,nullable = false)
    private int dni;

    @Column(name = "nombres",length = 60,nullable = false)
    private String nombres;

    @Column(name = "apellidos",length = 60,nullable = false)
    private String apellidos;

    @Column(name = "edad",length = 60,nullable = false)
    private int edad;

    @Column(name = "peso",length = 60,nullable = false)
    private int peso;

    @Column(name = "telefono",length = 60,nullable = false)
    private int telefono;

    @Column(name = "contrasena",length = 60,nullable = false)
    private String contrasena;

    @Column(name = "correo",length = 60,nullable = false)
    private String correo;

    public Damnificado() {
    }

    public Damnificado(int idDamnificado, int dni, String nombres, String apellidos, int edad, int peso, int telefono, String contrasena, String correo) {
        this.idDamnificado = idDamnificado;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.peso = peso;
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.correo = correo;
    }

    public int getIdDamnificado() {
        return idDamnificado;
    }

    public void setIdDamnificado(int idDamnificado) {
        this.idDamnificado = idDamnificado;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
