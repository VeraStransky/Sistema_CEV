package cl.iplacex.sistema_cev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "region", uniqueConstraints = { @UniqueConstraint(columnNames = { "nombre_region" }) })

public class region {
    private int id_region;
    private String nombre_region;

     @Id
    private int id;

    public region(int id_region, String nombre_region) {
        super();
        this.id_region = id_region;
        this.nombre_region = nombre_region;
    }

    /* Getter and Setter, accesadores y modificadores de una clase */
    public int getid_region() {
        return id_region;
    }

    public void setid_region(int id_region) {
        this.id_region = id_region;
    }

    public String getnombre_region() {
        return nombre_region;
    }

    @Override
    public String toString() {
        return "aqui va sentencia sql";
    }
}
