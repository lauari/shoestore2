package com.example.ShoeSport2.Interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ShoeSport2.models.Productos;

@Repository
public interface IProductos extends CrudRepository<Productos, String> {

    /*
     * nombre producto
     * estado producto
     */

     @Query("SELECT p FROM Productos p WHERE p.nombreProducto = ?1 OR p.EstadoProducto = ?1")
    List<Productos> ProductosExist(String nombreProducto, String EstadoProducto);
    
}
