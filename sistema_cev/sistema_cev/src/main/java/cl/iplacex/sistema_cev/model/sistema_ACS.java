package cl.iplacex.sistema_cev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "sistema_calefaccion", uniqueConstraints = {
        @UniqueConstraint(columnNames = { "id_sistema_calefaccion" }) })

// Atributos Sistema Agua caliente sanitaria
public class sistema_ACS {
    private int id_sistema_ACS;
    private String tipo_distribucion;
    private String sistema_encendido;
    private String correccion_distribucion;
    private String marca;
    private String modelo;
    private Float potencia_nominal_ACS;

    @Id
    private int id;

    /*
     * @OneToOne
     * private
     */
    /* De emergencia 1 a 1 */

    // Constructores
    public sistema_ACS(int id_sistema_ACS, String tipo_distribucion, String sistema_encendido,
            String correccion_distribucion, String marca, String modelo, Float potencia_nominal_ACS) {
        super();
        this.id_sistema_ACS = id_sistema_ACS;
        this.tipo_distribucion = tipo_distribucion;
        this.sistema_encendido = sistema_encendido;
        this.correccion_distribucion = correccion_distribucion;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia_nominal_ACS = potencia_nominal_ACS;

    }

    /* Getter and Setter, accesadores y modificadores de una clase */
    public int getid_sistema_ACS() {
        return id_sistema_ACS;
    }

    public void setid_sistema_ACS(int id_sistema_ACS) {
        this.id_sistema_ACS = id_sistema_ACS;
    }

    public String gettipo_distribucion() {
        return tipo_distribucion;
    }

    public void settipo_distribucion(String tipo_distribucion) {
        this.tipo_distribucion = tipo_distribucion;
    }

    public String getsistema_encendido() {
        return sistema_encendido;
    }

    public void setsistema_encendido(String sistema_encendido) {
        this.sistema_encendido = sistema_encendido;
    }

    public String getcorreccion_distribucion() {
        return correccion_distribucion;
    }

    public void setcorreccion_distribucion(String correccion_distribucion) {
        this.correccion_distribucion = correccion_distribucion;
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

    public Float getpotencia_nominal_ACS() {
        return potencia_nominal_ACS;
    }

    public void setpotencia_nominal_ACS(Float potencia_nominal_ACS) {
        this.potencia_nominal_ACS = potencia_nominal_ACS;
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
