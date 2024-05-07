package com.example.ShoeSport2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity(name = "Productos")
public class Productos {
    /*
     * nombre producto
     * descripcion producto
     * cantidad producto
     * precio producto
     * iva producto
     * descuento producto
     * estado producto
     */
     @Id
     @GeneratedValue(strategy = GenerationType.UUID)
     @Column(name = "idProductos" , nullable = false, length = 36)
     private String idProductos;

     @Column(name = "NombreProducto" , nullable = false, length = 36)
     private String nombreProducto;

     @Column(name = "DescripcionProducto" , nullable = false, length = 36)
     private String DescripcionProducto;

     @Column(name = "CantidadProducto" , nullable = false, length = 36)
     private String CantidadProducto;

     @Column(name = "PrecioProducto" , nullable = false, length = 36)
     private String PrecioProducto;

     @Column(name = "IvaProducto" , nullable = false, length = 36)
     private String IvaProducto;

     @Column(name = "DescuentoProducto" , nullable = false, length = 36)
     private String DescuentoProducto;

     @Column(name = "EstadoProducto" , nullable = false, length = 36)
     private String EstadoProducto;

    public Productos() {
    }

    public Productos(String idProductos, String nombreProducto, String descripcionProducto, String cantidadProducto,
            String precioProducto, String ivaProducto, String descuentoProducto, String estadoProducto) {
        this.idProductos = idProductos;
        this.nombreProducto = nombreProducto;
        DescripcionProducto = descripcionProducto;
        CantidadProducto = cantidadProducto;
        PrecioProducto = precioProducto;
        IvaProducto = ivaProducto;
        DescuentoProducto = descuentoProducto;
        EstadoProducto = estadoProducto;
    }

    public String getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(String idProductos) {
        this.idProductos = idProductos;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return DescripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        DescripcionProducto = descripcionProducto;
    }

    public String getCantidadProducto() {
        return CantidadProducto;
    }

    public void setCantidadProducto(String cantidadProducto) {
        CantidadProducto = cantidadProducto;
    }

    public String getPrecioProducto() {
        return PrecioProducto;
    }

    public void setPrecioProducto(String precioProducto) {
        PrecioProducto = precioProducto;
    }

    public String getIvaProducto() {
        return IvaProducto;
    }

    public void setIvaProducto(String ivaProducto) {
        IvaProducto = ivaProducto;
    }

    public String getDescuentoProducto() {
        return DescuentoProducto;
    }

    public void setDescuentoProducto(String descuentoProducto) {
        DescuentoProducto = descuentoProducto;
    }

    public String getEstadoProducto() {
        return EstadoProducto;
    }

    public void setEstadoProducto(String estadoProducto) {
        EstadoProducto = estadoProducto;
    }

   
     
}
