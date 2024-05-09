package com.example.ShoeSport2.Interfaces;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ShoeSport2.models.Ventas;

@Repository
public interface IVentas extends CrudRepository<Ventas, String> {
/* 
   
    * id clientes
    * fecha venta

    "SELECT p FROM producto p "+
    "JOIN p.marca ma "+
    "JOIN p.categoria c "+
    "WHERE p.nombreProducto LIKE %?1% OR ma.nombreMarca LIKE %?2% OR c.nombreCategoria LIKE %?3%"""
*/
     @Query("SELECT v FROM Ventas v "+
     " JOIN v.Clientes c "+
     " WHERE v.FechaVenta LIKE %?1% OR c.idClientes LIKE %?2% ")
    List<Ventas> VentasExist(String idClientes, Date FechaVenta);
    
    
}
