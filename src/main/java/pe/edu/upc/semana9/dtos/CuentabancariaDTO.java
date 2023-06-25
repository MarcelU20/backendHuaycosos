package pe.edu.upc.semana9.dtos;

import java.time.LocalDate;
import pe.edu.upc.semana9.entities.Usuario;

public class CuentabancariaDTO {
    private int idCuentabancaria;
    private int numero;
    private int cvv;
    private LocalDate vencimiento;
    private Usuario usuario;

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
