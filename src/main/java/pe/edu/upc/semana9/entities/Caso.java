package pe.edu.upc.semana9.entities;

import javax.persistence.*;

@Entity
@Table(name = "caso")
public class Caso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCaso;
    @Column(name = "titulo", length = 30, nullable = false)
    private String titulo;
    @Column(name = "argumento", length = 200, nullable = false)
    private String argumento;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario idUsuario;
    @ManyToOne
    @JoinColumn(name = "idTipoDeCaso")
    private TipoDeCaso idTipoDeCaso;
    @ManyToOne
    @JoinColumn(name = "idUbicacion")
    private Ubicacion idUbicacion;

    public Caso() {

    }

    public Caso(int idCaso, String titulo, String argumento, Usuario idUsuario, TipoDeCaso idTipoDeCaso, Ubicacion idUbicacion) {
        this.idCaso = idCaso;
        this.titulo = titulo;
        this.argumento = argumento;
        this.idUsuario = idUsuario;
        this.idTipoDeCaso = idTipoDeCaso;
        this.idUbicacion = idUbicacion;
    }

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

    public Usuario getIdUsuario() {return idUsuario;}

    public void setIdUsuario(Usuario idUsuario) {this.idUsuario = idUsuario;}

    public TipoDeCaso getIdTipoDeCaso() {
        return idTipoDeCaso;
    }

    public void setIdTipoDeCaso(TipoDeCaso idTipoDeCaso) {
        this.idTipoDeCaso = idTipoDeCaso;
    }

    public Ubicacion getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(Ubicacion idUbicacion) {
        this.idUbicacion = idUbicacion;
    }
}
