package com.example.ShoeSport2.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "Ventas")
public class Ventas {

    /*
     * id ventas
     * id clientes
     * total 
     * fecha venta
     * estado
     */

    @Id
     @GeneratedValue(strategy = GenerationType.UUID)
     @Column(name = "idVentas" , nullable = false, length = 36)
     private String idVentas;

    @ManyToOne
    @JoinColumn(name = "idClientes")
    private  Clientes Clientes;

     @Column(name = "TotalVenta" , nullable = false, length = 36)
     private String TotalVenta;

     @Column(name = "FechaVenta" , nullable = false, length = 36)
     private String FechaVenta;

     @Column(name = "EstadoVenta" , nullable = false, length = 36)
     private String EstadoVenta;

    public Ventas() {
    }

    public Ventas(String idVentas, com.example.ShoeSport2.models.Clientes clientes, String totalVenta,
            String fechaVenta, String estadoVenta) {
        this.idVentas = idVentas;
        Clientes = clientes;
        TotalVenta = totalVenta;
        FechaVenta = fechaVenta;
        EstadoVenta = estadoVenta;
    }

    public String getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(String idVentas) {
        this.idVentas = idVentas;
    }

    public Clientes getClientes() {
        return Clientes;
    }

    public void setClientes(Clientes clientes) {
        Clientes = clientes;
    }

    public String getTotalVenta() {
        return TotalVenta;
    }

    public void setTotalVenta(String totalVenta) {
        TotalVenta = totalVenta;
    }

    public String getFechaVenta() {
        return FechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        FechaVenta = fechaVenta;
    }

    public String getEstadoVenta() {
        return EstadoVenta;
    }

    public void setEstadoVenta(String estadoVenta) {
        EstadoVenta = estadoVenta;
    }

    
     

}
