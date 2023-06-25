package pe.edu.upc.semana9.dtos;

public class UsuarioEventoDTO {

    private String nombreUsuario;
    private int eventoCount;

    public UsuarioEventoDTO(String nombreUsuario, int eventoCount) {
        this.nombreUsuario = nombreUsuario;
        this.eventoCount = eventoCount;
    }

    public UsuarioEventoDTO() {
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getEventoCount() {
        return eventoCount;
    }

    public void setEventoCount(int eventoCount) {
        this.eventoCount = eventoCount;
    }
}
