package pe.edu.upc.semana9.dtos;

public class TipoDeCasoDTO {
    private int idTipoDeCaso;
    private String nombre;
    private String descripcion;

    public int getidTipoDeCaso() {
        return idTipoDeCaso;
    }

    public void setidTipoDeCaso(int idTipoDeCaso) {
        this.idTipoDeCaso = idTipoDeCaso;
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
