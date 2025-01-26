package cl.iplacex.sistema_cev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "comuna", uniqueConstraints = { @UniqueConstraint(columnNames = { "nombre_comuna" }) })

public class comuna {

    // Atributos
    private int id_comuna;
    private String nombre_comuna;

    @Id
    private int id;

    // Constructores
    public comuna(int id_comuna, String nombre_comuna) {
        super();
        this.id_comuna = id_comuna;
        this.nombre_comuna = nombre_comuna;
    }

    /* Getter and Setter, accesadores y modificadores de una clase */
    public int getid_comuna() {
        return id_comuna;
    }

    public void setid_comuna(int id_comuna) {
        this.id_comuna = id_comuna;
    }

    public String getnombre_comuna() {
        return nombre_comuna;
    }

    @Override
    public String toString() {
        return "aqui va sentencia sql";
    }
}
