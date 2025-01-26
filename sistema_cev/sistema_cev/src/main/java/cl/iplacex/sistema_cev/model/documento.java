package cl.iplacex.sistema_cev.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "documento", uniqueConstraints = { @UniqueConstraint(columnNames = { "id_documento" }) })

// Atributos
/* tipo=plano, certificado, EETT */
public class documento {
    private int id_documento;
    private String tipo;
    private Date fecha_ingreso;

    @Id
    private int id;

    /*
     * @OneToOne
     * private
     */
    /* De emergencia 1 a 1 */

    public documento() {
        super();

    }

    // Constructores
    public documento(int id_documento, String tipo, Date fecha_ingreso) {
        super();
        this.id_documento = id_documento;
        this.tipo = tipo;
        this.fecha_ingreso = fecha_ingreso;

    }

    /* Getter and Setter, accesadores y modificadores de una clase */
    public int getid_documento() {
        return id_documento;
    }

    public void setid_documento(int id_documento) {
        this.id_documento = id_documento;
    }

    public String gettipo() {
        return tipo;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getfecha_ingreso() {
        return fecha_ingreso;
    }

    public void setfecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
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
