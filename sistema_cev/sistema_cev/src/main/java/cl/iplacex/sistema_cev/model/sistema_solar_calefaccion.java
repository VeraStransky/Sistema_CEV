package cl.iplacex.sistema_cev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "sistema_solar_calefaccion", uniqueConstraints = {
        @UniqueConstraint(columnNames = { "id_sistema_solar_calefaccion" }) })

// Atributos
public class sistema_solar_calefaccion {
    private int id_sistema_solar_calefaccion;
    private String tipo_distribucion_solar;
    private String sistema_aporte;
    private String tipo_colector;
    private String marca;
    private String modelo;
    private Float superficie_total_SSC;

    @Id
    private int id;

    /*
     * @OneToOne
     * private
     */
    /* De emergencia 1 a 1 */

    // Constructores
    public sistema_solar_calefaccion(int id_sistema_solar_calefaccion, String tipo_distribucion_solar,
            String sistema_aporte, String tipo_colector, String marca, String modelo, Float superficie_total_SSC) {
        super();
        this.id_sistema_solar_calefaccion = id_sistema_solar_calefaccion;
        this.tipo_distribucion_solar = tipo_distribucion_solar;
        this.sistema_aporte = sistema_aporte;
        this.tipo_colector = tipo_colector;
        this.marca = marca;
        this.modelo = modelo;
        this.superficie_total_SSC = superficie_total_SSC;

    }

    /* Getter and Setter, accesadores y modificadores de una clase */
    public int getid_sistema_solar_calefaccion() {
        return id_sistema_solar_calefaccion;
    }

    public void setid_sistema_solar_calefaccion(int id_sistema_solar_calefaccion) {
        this.id_sistema_solar_calefaccion = id_sistema_solar_calefaccion;
    }

    public String gettipo_distribucion_solar() {
        return tipo_distribucion_solar;
    }

    public void settipo_distribucion_solar(String tipo_distribucion_solar) {
        this.tipo_distribucion_solar = tipo_distribucion_solar;
    }

    public String getsistema_aporte() {
        return sistema_aporte;
    }

    public void setsistema_aporte(String sistema_aporte) {
        this.sistema_aporte = sistema_aporte;
    }

    public String gettipo_colector() {
        return tipo_colector;
    }

    public void settipo_colector(String tipo_colector) {
        this.tipo_colector = tipo_colector;
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

    public Float getsuperficie_total_SSC() {
        return superficie_total_SSC;
    }

    public void setsuperficie_total_SSC(Float superficie_total_SSC) {
        this.superficie_total_SSC = superficie_total_SSC;
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
