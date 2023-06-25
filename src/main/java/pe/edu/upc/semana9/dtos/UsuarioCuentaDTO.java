package pe.edu.upc.semana9.dtos;

public class UsuarioCuentaDTO {

    private String nombreUsuario;
    private int cuentaCount;

    public UsuarioCuentaDTO() {
    }

    public UsuarioCuentaDTO(String nombreUsuario, int cuentaCount) {
        this.nombreUsuario = nombreUsuario;
        this.cuentaCount = cuentaCount;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getCuentaCount() {
        return cuentaCount;
    }

    public void setCuentaCount(int cuentaCount) {
        this.cuentaCount = cuentaCount;
    }
}
