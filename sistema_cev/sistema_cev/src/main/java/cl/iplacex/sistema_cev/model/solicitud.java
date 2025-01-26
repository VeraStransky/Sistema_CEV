package cl.iplacex.sistema_cev.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "solicitud", uniqueConstraints = { @UniqueConstraint(columnNames = { "id_solicitud" }) })

public class solicitud {

    // Atributos
    /* tipo=calificacion o Precalificacion */

    private int id_solicitud;
    private Date fecha_ingreso;
    private String tipo;
    private String permiso_edificacion;
    private String recepcion_final;

    @Id
    private int id;

    // Constructores
    public solicitud(int id_solicitud, Date fecha_ingreso, String tipo, String estado,
            String permiso_edificacion, String recepcion_final) {
        super();
        this.id_solicitud = id_solicitud;
        this.fecha_ingreso = fecha_ingreso;
        this.tipo = tipo;
        this.permiso_edificacion = permiso_edificacion;
        this.recepcion_final = recepcion_final;

    }

    /* Getter and Setter, accesadores y modificadores de una clase */

    public int getid_solicitud() {
        return id_solicitud;
    }

    public void setid_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public Date getfecha_ingreso() {
        return fecha_ingreso;
    }

    public void setfecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String gettipo() {
        return tipo;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    public String getpermiso_edificacion() {
        return permiso_edificacion;
    }

    public void setpermiso_edificacion(String permiso_edificacion) {
        this.permiso_edificacion = permiso_edificacion;
    }

    public String getrecepcion_final() {
        return recepcion_final;
    }

    public void setrecepcion_final(String recepcion_final) {
        this.recepcion_final = recepcion_final;
    }

    @Override
    public String toString() {
        return "aqui va sentencia sql";
    }

}
