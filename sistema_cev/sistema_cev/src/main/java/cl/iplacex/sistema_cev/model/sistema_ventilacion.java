package cl.iplacex.sistema_cev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;



@Entity
@Table(name = "sistema_calefaccion", uniqueConstraints = { 
        @UniqueConstraint(columnNames = { "id_sistema_calefaccion" }) })


//Atributos
public class sistema_ventilacion {
    private int id_sistema_ventilacion;
    private String tipo_sistema_ventilacion;
    private Float potencia_ventilador;
    private Float potencia_recuperador;
    private Float consumo_energia;
    private String marca;
    private String modelo;
    private Float potencia_nominal_SV;

    @Id
    private int id;

    /*
     * @OneToOne
     * private
     */
    /* De emergencia 1 a 1 */

    //Constructores
    public sistema_ventilacion(int id_sistema_ventilacion, String tipo_sistema_ventilacion, Float potencia_ventilador,
            Float potencia_recuperador, Float consumo_energia, String marca, String modelo,
            Float potencia_nominal_SV) {
        super();
        this.id_sistema_ventilacion = id_sistema_ventilacion;
        this.tipo_sistema_ventilacion = tipo_sistema_ventilacion;
        this.potencia_ventilador = potencia_ventilador;
        this.potencia_recuperador = potencia_recuperador;
        this.consumo_energia = consumo_energia;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia_nominal_SV = potencia_nominal_SV;

    }

    /* Getter and Setter, accesadores y modificadores de una clase */
    public int getid_sistema_ventilacion() {
        return id_sistema_ventilacion;
    }

    public void setid_sistema_ventilacion(int id_sistema_ventilacion) {
        this.id_sistema_ventilacion = id_sistema_ventilacion;
    }

    public String gettipo_sistema_ventilacion() {
        return tipo_sistema_ventilacion;
    }

    public void settipo_sistema_ventilacion(String tipo_sistema_ventilacion) {
        this.tipo_sistema_ventilacion = tipo_sistema_ventilacion;
    }

    public Float getpotencia_ventilador() {
        return potencia_ventilador;
    }

    public void setpotencia_ventilador(Float potencia_ventilador) {
        this.potencia_ventilador = potencia_ventilador;
    }

    public Float getpotencia_recuperador() {
        return potencia_recuperador;
    }

    public void setpotencia_recuperador(Float potencia_recuperador) {
        this.potencia_recuperador = potencia_recuperador;
    }

    public Float getconsumo_energia() {
        return consumo_energia;
    }

    public void setconsumo_energia(Float consumo_energia) {
        this.consumo_energia = consumo_energia;
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
        return potencia_nominal_SV;
    }

    public void setpotencia_nominal_SC(Float potencia_nominal_SC) {
        this.potencia_nominal_SV = potencia_nominal_SC;
    }

    public Float getpotencia_nominal_SV() {
        return potencia_nominal_SV;
    }

    public void setpotencia_nominal_SV(Float potencia_nominal_SV) {
        this.potencia_nominal_SV = potencia_nominal_SV;
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
