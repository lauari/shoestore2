package com.example.ShoeSport2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name = "Clientes")
public class Clientes {
    /*
     * tipo documento
     * numero documento
     * nombre cliente
     * apellido cliente
     * numero documento del cliente
     * telefono del cliente
     * direccion de cliente
     * ciudad
     * estado
     */
    
     @Id
     @GeneratedValue(strategy = GenerationType.UUID)
     @Column(name = "idClientes", nullable = false, length = 36)
     private String idClientes;

     @Column(name = "TipoDocumento", nullable = false, length = 36)
     private String TipoDocumento;

     @Column(name = "NumeroDocumento", nullable = false, length = 36)
     private String NumeroDocumento;

     @Column(name = "Nombre", nullable = false, length = 36)
     private String PrimerNombre;

     @Column(name = "Apellido", nullable = false, length = 36)
     private String PrimerApellido;

     @Column(name = "Telefono", nullable = false, length = 36)
     private String Telefono;

     @Column(name = "Direccion", nullable = false, length = 36)
     private String Direccion;

     @Column(name = "Ciudad", nullable = false, length = 36)
     private String Ciudad;

     @Column(name = "Estado", nullable = false, length = 36)
     private String Estado;

     @Column(name = "Correo", nullable = false, length = 36)
     private String Correo;

    // @ManyToMany
    // @JoinColumn(name = "idProductos")
    // private Productos Productos;

    public Clientes() {
    }

    public Clientes(String idClientes, String tipoDocumento, String numeroDocumento, String primerNombre,
            String primerApellido, String telefono, String direccion, String ciudad, String estado, String correo) {
        this.idClientes = idClientes;
        TipoDocumento = tipoDocumento;
        NumeroDocumento = numeroDocumento;
        PrimerNombre = primerNombre;
        PrimerApellido = primerApellido;
        Telefono = telefono;
        Direccion = direccion;
        Ciudad = ciudad;
        Estado = estado;
        Correo = correo;
    }

    public String getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(String idClientes) {
        this.idClientes = idClientes;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        TipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return NumeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        NumeroDocumento = numeroDocumento;
    }

    public String getPrimerNombre() {
        return PrimerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        PrimerNombre = primerNombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        PrimerApellido = primerApellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }  

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Estado = correo;
    } 
}
