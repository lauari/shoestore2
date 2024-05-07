package com.example.ShoeSport2.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.example.ShoeSport2.models.Productos;

public interface IProductoService {

    public String save(Productos Productos);

    public List<Productos> findAll();

    public List<Productos> ProductosExist(String NombreProducto, String EstadoProducto);

    public Optional<Productos> findOne(String id);

    // cambiar el int
    public int delete(String id);
    
}
