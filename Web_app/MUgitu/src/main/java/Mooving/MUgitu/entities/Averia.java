package Mooving.MUgitu.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "averia")
public class Averia {
    @Id
    @GenericGenerator(name="averia" , strategy="increment")
    @GeneratedValue(generator="averia")
    @Column(name = "averia_id", nullable = false)
    private Long averiaId;

    @ManyToOne
    @JoinColumn(name = "bici_id")
    private Bici bici;

    @ManyToOne
    @JoinColumn(name = "tipo_averia")
    private Usuario tipoAveria;

    @Column(name = "fecha_inicio")
    private Date fechaInicio;

    @Column(name = "fecha_fin")
    private Date fechaFin;

    public Averia(){}

    public Averia(Long averiaId, Bici bici, Usuario tipoAveria, Date fechaInicio, Date fechaFin) {
        this.averiaId = averiaId;
        this.bici = bici;
        this.tipoAveria = tipoAveria;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Long getAveriaId() {
        return averiaId;
    }

    public void setAveriaId(Long averiaId) {
        this.averiaId = averiaId;
    }

    public Bici getBici() {
        return bici;
    }

    public void setBici(Bici bici) {
        this.bici = bici;
    }

    public Usuario getTipoAveria() {
        return tipoAveria;
    }

    public void setTipoAveria(Usuario tipoAveria) {
        this.tipoAveria = tipoAveria;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
