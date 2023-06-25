package pe.edu.upc.semana9.dtos;

public class UbicacionCountDTO {

    private String nombreDepartamento;
    private int ubicacionCount;

    public UbicacionCountDTO() {
    }

    public UbicacionCountDTO(String nombreDepartamento, int ubicacionCount) {
        this.nombreDepartamento = nombreDepartamento;
        this.ubicacionCount = ubicacionCount;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public int getUbicacionCount() {
        return ubicacionCount;
    }

    public void setUbicacionCount(int ubicacionCount) {
        this.ubicacionCount = ubicacionCount;
    }
}
