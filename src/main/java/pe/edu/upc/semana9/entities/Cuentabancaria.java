package pe.edu.upc.semana9.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "cuentabancarias")
public class Cuentabancaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCuentabancaria;
    @Column(name = "numero",length = 50,nullable = false)
    private int numero;
    @Column(name = "cvv",length = 50,nullable = false)
    private int cvv;
    @Column(name = "vencimiento",nullable = false)
    private LocalDate vencimiento;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;

    public Cuentabancaria() {
    }

    public Cuentabancaria(int idCuentabancaria, int numero, int cvv, LocalDate vencimiento, Usuario usuario) {
        this.idCuentabancaria = idCuentabancaria;
        this.numero = numero;
        this.cvv = cvv;
        this.vencimiento = vencimiento;
        this.usuario = usuario;
    }

    public int getIdCuentabancaria() {
        return idCuentabancaria;
    }

    public void setIdCuentabancaria(int idCuentabancaria) {
        this.idCuentabancaria = idCuentabancaria;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public LocalDate getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(LocalDate vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
