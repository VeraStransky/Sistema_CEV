package cl.iplacex.sistema_cev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "estado", uniqueConstraints = { @UniqueConstraint(columnNames = { "id_estado" }) })

// Atributos
/* tipo=calificacion o Precalificacion */
public class estado {
    private int id_estado;
    private String nombre_estado;
    private String descripcion;
    private String color;
    private String activo;

    @Id
    private int id;

    /*
     * @OneToOne
     * private
     */
    /* De emergencia 1 a 1 */

    // Constructores
    public estado(int id_estado, String nombre_estado, String descripcion,
            String color, String activo) {
        super();
        this.id_estado = id_estado;
        this.nombre_estado = nombre_estado;
        this.descripcion = descripcion;
        this.color = color;
        this.activo = activo;
    }

    /* Getter and Setter, accesadores y modificadores de una clase */
    public int getid_estado() {
        return id_estado;
    }

    public void setid_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public String getnombre_estado() {
        return nombre_estado;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    public String getactivo() {
        return activo;
    }

    public void setactivo(String activo) {
        this.activo = activo;
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
