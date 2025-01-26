package cl.iplacex.sistema_cev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "zona_termica", uniqueConstraints = { @UniqueConstraint(columnNames = { "tipo_zona_termica" }) })

public class zona_termica {

    // Atributos
    private int id_zona_termica;
    private String tipo_zona_termica;
    private Double temperatura;

    @Id
    private int id;

    // Constructores
    public zona_termica(int id_zona_termica, String tipo_zona_termica, Double temperatura) {
        super();
        this.id_zona_termica = id_zona_termica;
        this.tipo_zona_termica = tipo_zona_termica;
        this.temperatura = temperatura;
    }

    /* Getter and Setter, accesadores y modificadores de una clase */
    public int getid_zona_termica() {
        return id_zona_termica;
    }

    public void setid_zona_termica(int id_zona_termica) {
        this.id_zona_termica = id_zona_termica;
    }

    public String gettipo_zona_termica() {
        return tipo_zona_termica;
    }

    public void settipo_zona_termica(String tipo_zona_termica) {
        this.tipo_zona_termica = tipo_zona_termica;
    }

    public Double temperatura() {
        return temperatura;
    }

    public void settemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "aqui va sentencia sql";
    }
}