package pe.edu.upc.semana9.entities;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "eventos")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idEvento;
    @Column(name = "descripcion",length = 60,nullable = false)
    private String descripcion;
    @Column(name = "ubicacion",length = 40,nullable = false)
    private String ubicacion;
    @Column(name = "inicio", nullable = false)
    private LocalDate inicio;
    @Column(name = "fin", nullable = false)
    private LocalDate fin;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private Usuario user;

    public Evento() {
    }

    public Evento(int idEvento, String descripcion, String ubicacion, LocalDate inicio, LocalDate fin, Donador donador) {
        this.idEvento = idEvento;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.inicio = inicio;
        this.fin = fin;
        this.user = user;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
