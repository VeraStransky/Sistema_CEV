package cl.iplacex.sistema_cev.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "evaluador", uniqueConstraints = { @UniqueConstraint(columnNames = { "email" }) })

/*
 * Al separar los roles de Evaluador con cliente se busca diferenciar
 * configuraciones de permisos en el sistema según los modelos.
 * En el futuro los roles de Cliente y Evaluador requeriran funcionalidades
 * independientes, por lo que al separarlos
 * sera más fácil escalar y gestionar sus modelos en forma separada.
 */

public class evaluador {
    /* El evaluador es una persona natural */
    private int rut_evaluador;
    private String nombre_evaluador;
    private String apellidos;
    private String direccion_evaluador;
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

    public evaluador(int rut_evaluador, String nombre_evaluador, String apellidos,
            String direccion_evaluador, String telefono, String email, String user_password) {
        super();
        this.rut_evaluador = rut_evaluador;
        this.nombre_evaluador = nombre_evaluador;
        this.apellidos = apellidos;
        this.direccion_evaluador = direccion_evaluador;
        this.telefono = telefono;
        this.email = email;
        this.user_password = user_password;

    }

    /* Getter and Setter, accesadores y modificadores de una clase */
    public int getrut_evaluador() {
        return rut_evaluador;
    }

    public void setrut_evaluador(int rut_evaluador) {
        this.rut_evaluador = rut_evaluador;
    }

    public String getnombre_evaluador() {
        return nombre_evaluador;
    }

    public void setnombre_evaluador(String nombre_evaluador) {
        this.nombre_evaluador = nombre_evaluador;
    }

    public String getapellidos() {
        return apellidos;
    }

    public void setapellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getdireccion_evaluador() {
        return direccion_evaluador;
    }

    public void setdireccion_evaluador(String direccion_evaluador) {
        this.direccion_evaluador = direccion_evaluador;
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
