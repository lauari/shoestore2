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
*/
     @Query("SELECT v FROM Ventas v" +
                "JOIN c.Clientes c"+
                "WHERE c.idClientes LIKE %?1% OR v.FechaVenta")
    List<Ventas> VentasExist(String idClientes, Date FechaVenta);
    
    
}
