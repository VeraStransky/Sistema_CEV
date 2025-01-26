package cl.iplacex.sistema_cev.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "solicitud", uniqueConstraints = { @UniqueConstraint(columnNames = { "id_solicitud" }) })

// Atributos
public class evaluacion {
    private int id_evaluacion;
    private Date fecha_evaluacion;

    @Id
    private int id;

    /*
     * @OneToOne
     * private
     */
    /* De emergencia 1 a 1 */

    public evaluacion() {
        super();

    }

    public evaluacion(int id_evaluacion, Date fecha_evaluacion) {
        super();
        this.id_evaluacion = id_evaluacion;
        this.fecha_evaluacion = fecha_evaluacion;

    }

    /* Getter and Setter, accesadores y modificadores de una clase */
    public int getid_evaluacion() {
        return id_evaluacion;
    }

    public void setid_evaluacion(int id_evaluacion) {
        this.id_evaluacion = id_evaluacion;
    }

    public Date getfecha_evaluacion() {
        return fecha_evaluacion;
    }

    public void setfecha_evaluacion(Date fecha_evaluacion) {
        this.fecha_evaluacion = fecha_evaluacion;
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
