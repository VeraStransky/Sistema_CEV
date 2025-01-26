package cl.iplacex.sistema_cev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "sistema_calefaccion", uniqueConstraints = {
        @UniqueConstraint(columnNames = { "id_sistema_calefaccion" }) })

// Atributos
public class sistema_calefaccion {
    private int id_sistema_calefaccion;
    private String tipo_distribucion;
    private String sistema_control;
    private String marca;
    private String modelo;
    private Float potencia_nominal_SC;

    @Id
    private int id;

    /*
     * @OneToOne
     * private
     */
    /* De emergencia 1 a 1 */

    // Constructores
    public sistema_calefaccion(int id_sistema_calefaccion, String tipo_distribucion, String sistema_control,
            String marca, String modelo, Float potencia_nominal_SC) {
        super();
        this.id_sistema_calefaccion = id_sistema_calefaccion;
        this.tipo_distribucion = tipo_distribucion;
        this.sistema_control = sistema_control;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia_nominal_SC = potencia_nominal_SC;

    }

    /* Getter and Setter, accesadores y modificadores de una clase */
    public int getid_sistema_calefaccion() {
        return id_sistema_calefaccion;
    }

    public void setid_sistema_calefaccion(int id_sistema_calefaccion) {
        this.id_sistema_calefaccion = id_sistema_calefaccion;
    }

    public String gettipo_distribucion() {
        return tipo_distribucion;
    }

    public void settipo_distribucion(String tipo_distribucion) {
        this.tipo_distribucion = tipo_distribucion;
    }

    public String getsistema_control() {
        return sistema_control;
    }

    public void setsistema_control(String sistema_control) {
        this.sistema_control = sistema_control;
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

    public Float getpotencia_nominal_SC() {
        return potencia_nominal_SC;
    }

    public void setpotencia_nominal_SC(Float potencia_nominal_SC) {
        this.potencia_nominal_SC = potencia_nominal_SC;
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
