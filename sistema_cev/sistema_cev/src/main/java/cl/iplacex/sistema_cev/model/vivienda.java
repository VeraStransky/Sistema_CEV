package cl.iplacex.sistema_cev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "vivienda", uniqueConstraints = { @UniqueConstraint(columnNames = { "rol_vivienda" }) })

public class vivienda {

    // Atributos
    /*tipo=casa o departamento, estado=nueva o usada*/

    private int rol_vivienda;
    private String direccion;
    private String tipo;
    private String estado;
    private String lote;
    private String manzana;
    private String edificio;
    private String piso;
    private String unidad;
    private String orientacion;
    private String materialidad;

    @Id
    private int id;

    // Constructores
    public vivienda(int rol_vivienda, String direccion, String tipo, String estado, String lote, String manzana,
            String edificio, String piso, String unidad, String orientacion, String materialidad) {
        super();
        this.rol_vivienda = rol_vivienda;
        this.direccion = direccion;
        this.tipo = tipo;
        this.estado = estado;
        this.lote = lote;
        this.manzana = manzana;
        this.edificio = edificio;
        this.piso = piso;
        this.unidad = unidad;
        this.orientacion = orientacion;
        this.materialidad = materialidad;

    }

    /* Getter and Setter, accesadores y modificadores de una clase */
    public int getrol_vivienda() {
        return rol_vivienda;
    }

    public void setrol_vivienda(int rol_vivienda) {
        this.rol_vivienda = rol_vivienda;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    public String gettipo() {
        return tipo;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    public String getestado() {
        return estado;
    }

    public void setestado(String estado) {
        this.estado = estado;
    }

    public String getlote() {
        return lote;
    }

    public void setlote(String lote) {
        this.lote = lote;
    }

    public String getmanzana() {
        return manzana;
    }

    public void setmanzana(String manzana) {
        this.manzana = manzana;
    }

    public String getedificio() {
        return edificio;
    }

    public void setedificio(String edificio) {
        this.edificio = edificio;
    }

    public String getpiso() {
        return piso;
    }

    public void setpiso(String piso) {
        this.piso = piso;
    }

    public String getunidad() {
        return unidad;
    }

    public void setunidad(String unidad) {
        this.unidad = unidad;
    }

    public String getorientacion() {
        return orientacion;
    }

    public void setorientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public String getmaterialidad() {
        return materialidad;
    }

    public void setmaterialidad(String materialdiad) {
        this.materialidad = materialdiad;
    }

    @Override
    public String toString() {
        return "aqui va sentencia sql";
    }
}
