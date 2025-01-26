package cl.iplacex.sistema_cev.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "informe", uniqueConstraints = {
        @UniqueConstraint(columnNames = { "id_informe" }) })

// Atributos
public class informe {

    private int id_informe;
    private Date fecha_generacion;
    private Float potencia_nominal_SC;
    private Float potencia_nominal_SV;
    private Float potencia_nominal_ACS;
    private Float superficie_total_SSC;
    private Float superficie_total_SSI;

    @Id
    private int id;

    /*
     * @OneToOne
     * private
     */
    /* De emergencia 1 a 1 */

    // Constructores
    public informe(int id_informe, Date fecha_generacion, Float potencia_nominal_SC,
            Float potencia_nominal_SV, Float potencia_nominal_ACS, Float superficie_total_SSC,
            Float superficie_total_SSI) {
        super();
        this.id_informe = id_informe;
        this.fecha_generacion = fecha_generacion;
        this.potencia_nominal_SC = potencia_nominal_SC;
        this.potencia_nominal_SV = potencia_nominal_SV;
        this.potencia_nominal_ACS = potencia_nominal_ACS;
        this.superficie_total_SSC = superficie_total_SSC;
        this.superficie_total_SSI = superficie_total_SSI;

    }

    /* Getter and Setter, accesadores y modificadores de una clase */
    public int getid_informe() {
        return id_informe;
    }

    public void setid_informe(int id_informe) {
        this.id_informe = id_informe;
    }

    public Date getfecha_generacion() {
        return fecha_generacion;
    }

    public void fecha_generacion(Date fecha_generacion) {
        this.fecha_generacion = fecha_generacion;
    }

    public Float getpotencia_nominal_SC() {
        return potencia_nominal_SC;
    }

    public void setpotencia_nominal_SC(Float potencia_nominal_SC) {
        this.potencia_nominal_SC = potencia_nominal_SC;
    }

    public Float getpotencia_nominal_SV() {
        return potencia_nominal_SV;
    }

    public void setpotencia_nominal_SV(Float potencia_nominal_SV) {
        this.potencia_nominal_SV = potencia_nominal_SV;
    }

    public Float getpotencia_nominal_ACS() {
        return potencia_nominal_ACS;
    }

    public void spotencia_nominal_ACS(Float potencia_nominal_ACS) {
        this.potencia_nominal_ACS = potencia_nominal_ACS;
    }

    public Float superficie_total_SSC() {
        return superficie_total_SSC;
    }

    public void setsuperficie_total_SSC(Float superficie_total_SSC) {
        this.superficie_total_SSC = superficie_total_SSC;
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
