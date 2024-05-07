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
     * descripcion producto
     * cantidad producto
     * precio producto
     * iva producto
     * descuento producto
     * estado producto
     */

     @Query("SELECT pro FROM Productos pro WHERE pro.NombreProducto LIKE %?1% OR pro.EstadoProducto LIKE %?2%")
    List<Productos> ProductosExist(String NombreProducto, String EstadoProducto);
    
}
