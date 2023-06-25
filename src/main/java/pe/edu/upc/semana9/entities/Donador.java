package pe.edu.upc.semana9.entities;

import javax.persistence.*;

@Entity
@Table(name="donadores")
public class Donador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDonador;
    @Column(name = "dni",length = 8, nullable = false)
    private int dni;
    @Column(name = "nombres",length = 50, nullable = false)
    private String nombres;
    @Column(name = "apellidos",length = 50, nullable = false)
    private String apellidos;
    @Column(name = "edad",length = 3, nullable = false)
    private int edad;
    @Column(name = "telefono",length = 15, nullable = false)
    private int telefono;
    @Column(name = "contrasena",length = 20, nullable = false)
    private String contrasena;
    @Column(name = "correo",length = 50, nullable = false)
    private String correo;
    @Column(name = "ong",length = 50, nullable = false)
    private String ong;

    public Donador() {
    }

    public Donador(int idDonador, int dni, String nombres, String apellidos, int edad, int telefono, String contrasena, String correo, String ong) {
        this.idDonador = idDonador;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.correo = correo;
        this.ong = ong;
    }

    public int getIdDonador() {
        return idDonador;
    }

    public void setIdDonador(int idDonador) {
        this.idDonador = idDonador;
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

    public String getOng() {
        return ong;
    }

    public void setOng(String ong) {
        this.ong = ong;
    }
}