package cl.iplacex.sistema_cev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "proyecto", uniqueConstraints = { @UniqueConstraint(columnNames = { "rol_matriz" }) })

public class proyecto {

    // Atributos

    private int id_proyecto;
    private int rol_matriz;
    private String nombre_proyecto;
    private String direccion;
    private int numero_viviendas;

    @Id
    private int id;

    // Constructores
    public proyecto(int id_proyecto, int rol_matriz, String nombre_proyecto, String direccion, int numero_viviendas) {
        super();
        this.id_proyecto = id_proyecto;
        this.rol_matriz = rol_matriz;
        this.nombre_proyecto = nombre_proyecto;
        this.direccion = direccion;
        this.numero_viviendas = numero_viviendas;

    }

    /* Getter and Setter, accesadores y modificadores de una clase */
    public int getid_proyecto() {
        return id_proyecto;
    }

    public void setid_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public int getrol_matriz() {
        return rol_matriz;
    }

    public void setrol_matriz(int rol_matriz) {
        this.rol_matriz = rol_matriz;
    }

    public String getnombre_proyecto() {
        return nombre_proyecto;
    }

    public void setnombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getnumero_viviendas() {
        return numero_viviendas;
    }

    public void setnumero_viviendas(int numero_viviendas) {
        this.numero_viviendas = numero_viviendas;
    }

    @Override
    public String toString() {
        return "aqui va sentencia sql";
    }
}
