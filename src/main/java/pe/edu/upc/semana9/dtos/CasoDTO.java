package pe.edu.upc.semana9.dtos;

import pe.edu.upc.semana9.entities.Usuario;
import pe.edu.upc.semana9.entities.TipoDeCaso;
import pe.edu.upc.semana9.entities.Ubicacion;
import pe.edu.upc.semana9.entities.Usuario;

public class CasoDTO {
    private int idCaso;
    private String titulo;
    private String argumento;
    private Usuario usuario;
    private TipoDeCaso tipoDeCaso;
    private Ubicacion ubicacion;

    public int getIdCaso() {
        return idCaso;
    }

    public void setIdCaso(int idCaso) {
        this.idCaso = idCaso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArgumento() {
        return argumento;
    }

    public void setArgumento(String argumento) {
        this.argumento = argumento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoDeCaso getTipoDeCaso() {
        return tipoDeCaso;
    }

    public void setTipoDeCaso(TipoDeCaso tipoDeCaso) {
        this.tipoDeCaso = tipoDeCaso;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
}
