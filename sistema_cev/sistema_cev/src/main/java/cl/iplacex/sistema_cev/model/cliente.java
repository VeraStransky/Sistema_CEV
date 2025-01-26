package cl.iplacex.sistema_cev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
/*import jakarta.persistence.OneToOne;*/
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "cliente", uniqueConstraints = { @UniqueConstraint(columnNames = { "email" }) })
/*
 * uniqueConstraints es una restricción en JPA (Jakarta Persistence API) que se
 * utiliza para garantizar que una combinación de columnas sea única en una
 * tabla de base de datos.
 * Beneficios: Garantiza la integridad de datos, Previene duplicados en la base
 * de datos,
 * Mejora la consistencia de datos, Facilita la búsqueda y recuperación de
 * registros
 */

public class cliente {
    /*
     * El cliente siempre sera una personalidad juridica Empresa constructora o Egis
     */
    private int rut_cliente;
    private String razon_social;
    private String direccion_cliente;
    private String telefono;
    private String email;
    private String user_password;

    @Id
    private int id;

    /*
     * @OneToOne
     * private
     */
    /* De emergencia 1 a 1 */

    public cliente() {
        super();

    }

    public cliente(int rut_cliente, String razon_social, String direccion_cliente,
            String telefono, String email, String user_password) {
        super();
        this.rut_cliente = rut_cliente;
        this.razon_social = razon_social;
        this.direccion_cliente = direccion_cliente;
        this.telefono = telefono;
        this.email = email;
        this.user_password = user_password;

    }

    /* Getter and Setter, accesadores y modificadores de una clase */
    public int getrut_cliente() {
        return rut_cliente;
    }

    public void setrut_cliente(int rut_cliente) {
        this.rut_cliente = rut_cliente;
    }

    public String getrazon_social() {
        return razon_social;
    }

    public void setrazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getdireccion_cliente() {
        return direccion_cliente;
    }

    public void setdireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public String gettelefono() {
        return telefono;
    }

    public void settelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getuser_password() {
        return user_password;
    }

    public void setuser_password(String user_password) {
        this.user_password = user_password;
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
