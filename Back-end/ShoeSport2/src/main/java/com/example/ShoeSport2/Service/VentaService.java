package com.example.ShoeSport2.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ShoeSport2.Interfaces.IVentas;
import com.example.ShoeSport2.models.Ventas;
import com.example.ShoeSport2.InterfaceService.IVentaService;

@Service
public class VentaService implements IVentaService{

     @Autowired
    private IVentas data;

    
    @Override
    public String save(Ventas Ventas) {
        data.save(Ventas);
        return Ventas.getIdVentas();
    }

    @Override
    public List<Ventas> findAll() {
        List<Ventas> listaVentas = (List<Ventas>) data.findAll();
        return listaVentas;
    }

    @Override
    public Optional<Ventas> findOne(String id) {
        Optional<Ventas> Ventas = data.findById(id);
        return Ventas;
    }

  //Filtro por cliente
  //fecha de venta desde
  //fecha de venta hasta

    @Override
    public List<Ventas> VentasExist(String idClientes, Date FechaVenta){
        List<Ventas> listaVentas = data.VentasExist(idClientes, FechaVenta);
        return listaVentas;
    }

    // Corregir tipo de dato int
    @Override
    public int delete(String id) {
        data.deleteById(id);
        return 1;
    }
}
