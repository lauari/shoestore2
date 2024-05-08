package com.example.ShoeSport2.InterfaceService;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import com.example.ShoeSport2.models.Ventas;

public interface IVentaService {

     public String save(Ventas Ventas);

    public List<Ventas> findAll();

    public List<Ventas> VentasExist(String idClientes, Date FechaVenta);

    public Optional<Ventas> findOne(String id);

    // cambiar el int
    public int delete(String id);
    
}
