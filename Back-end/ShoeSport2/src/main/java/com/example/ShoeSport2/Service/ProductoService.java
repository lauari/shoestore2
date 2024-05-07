package com.example.ShoeSport2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ShoeSport2.InterfaceService.IProductoService;
import com.example.ShoeSport2.Interfaces.IProductos;
import com.example.ShoeSport2.models.Productos;

@Service
public class ProductoService implements IProductoService {

    
    @Autowired
    private IProductos data;

    
    @Override
    public String save(Productos Productos) {
        data.save(Productos);
        return Productos.getIdProductos();
    }

    @Override
    public List<Productos> findAll() {
        List<Productos> listaProductos = (List<Productos>) data.findAll();
        return listaProductos;
    }

    @Override
    public Optional<Productos> findOne(String id) {
        Optional<Productos> Productos = data.findById(id);
        return Productos;
    }

    //filtro por nombre y estado

    @Override
    public List<Productos> ProductosExist(String NombreProducto, String EstadoProducto){
        List<Productos> listaProductos = data.ProductosExist(NombreProducto, EstadoProducto);
        return listaProductos;
    }

    // Corregir tipo de dato int
    @Override
    public int delete(String id) {
        data.deleteById(id);
        return 1;
    }
    
}
