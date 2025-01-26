package cl.iplacex.sistema_cev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "sistema_solar_iluminacion", uniqueConstraints = {
        @UniqueConstraint(columnNames = { "id_sistema_solar_iluminacion" }) })

// Atributos
public class sistema_solar_iluminacion {
    private int id_sistema_solar_iluminacion;
    private String tipo_distribucion_iluminacion;
    private int numero_paneles;
    private String marca;
    private String modelo;
    private Float superficie_total_SSI;

    @Id
    private int id;

    /*
     * @OneToOne
     * private
     */
    /* De emergencia 1 a 1 */

    // Constructores
    public sistema_solar_iluminacion(int id_sistema_solar_iluminacion, String tipo_distribucion_iluminacion,
            int numero_paneles, String marca, String modelo, Float superficie_total_SSI) {
        super();
        this.id_sistema_solar_iluminacion = id_sistema_solar_iluminacion;
        this.tipo_distribucion_iluminacion = tipo_distribucion_iluminacion;
        this.numero_paneles = numero_paneles;
        this.marca = marca;
        this.modelo = modelo;
        this.superficie_total_SSI = superficie_total_SSI;

    }

    /* Getter and Setter, accesadores y modificadores de una clase */
    public int getid_sistema_solar_iluminacion() {
        return id_sistema_solar_iluminacion;
    }

    public void setid_sistema_solar_iluminacion(int id_sistema_solar_iluminacion) {
        this.id_sistema_solar_iluminacion = id_sistema_solar_iluminacion;
    }

    public String gettipo_distribucion_iluminacion() {
        return tipo_distribucion_iluminacion;
    }

    public void settipo_distribucion_iluminacion(String tipo_distribucion_iluminacion) {
        this.tipo_distribucion_iluminacion = tipo_distribucion_iluminacion;
    }

    public int getnumero_paneles() {
        return numero_paneles;
    }

    public void setnumero_paneles(int numero_paneles) {
        this.numero_paneles = numero_paneles;
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public Float getsuperficie_total_SSI() {
        return superficie_total_SSI;
    }

    public void setsuperficie_total_SSI(Float superficie_total_SSI) {
        this.superficie_total_SSI = superficie_total_SSI;
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
