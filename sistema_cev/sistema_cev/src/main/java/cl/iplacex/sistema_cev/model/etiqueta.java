package cl.iplacex.sistema_cev.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "etiqueta", uniqueConstraints = { @UniqueConstraint(columnNames = { "id_etiqueta" }) })

// Atributos
public class etiqueta {
    private int id_etiqueta;
    private String calificacion;
    private Date fecha_emision;

    @Id
    private int id;

    /*
     * @OneToOne
     * private
     */
    /* De emergencia 1 a 1 */

    public etiqueta() {
        super();

    }

    // Constructores
    public etiqueta(int id_etiqueta, String calificacion, Date fecha_emision) {
        super();
        this.id_etiqueta = id_etiqueta;
        this.calificacion = calificacion;
        this.fecha_emision = fecha_emision;

    }

    /* Getter and Setter, accesadores y modificadores de una clase */
    public int getid_etiqueta() {
        return id_etiqueta;
    }

    public void setid_etiqueta(int id_etiqueta) {
        this.id_etiqueta = id_etiqueta;
    }

    public String calificacion() {
        return calificacion;
    }

    public void setcalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public Date getfecha_emision() {
        return fecha_emision;
    }

    public void setfecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    /*
     * Como los clientes van a ser varios vamos a ocupar una
     * sobreescritura @override
     */
    @Override
    public String toString() {
        return "aqui va sentencia sql";
    }

}
