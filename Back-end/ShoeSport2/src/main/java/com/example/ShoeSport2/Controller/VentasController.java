package com.example.ShoeSport2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ShoeSport2.InterfaceService.IVentaService;
import com.example.ShoeSport2.models.Ventas;

import lombok.var;

@RestController
@RequestMapping("/api/v1/Ventas")
public class VentasController {

     @Autowired
    private IVentaService VentaService;

    @PostMapping("/")
    public ResponseEntity<Object> save(@ModelAttribute("Ventas") Ventas Ventas) {

        if (Ventas.getTotalVenta().equals("")) {

            return new ResponseEntity<>("El Total es un campo obligatorio", HttpStatus.BAD_REQUEST);
        }

        if (Ventas.getEstadoVenta().equals("")) {

            return new ResponseEntity<>("El estado es un campo obligatorio", HttpStatus.BAD_REQUEST);
        }

        if (Ventas.getFechaVenta().equals("")) {

            return new ResponseEntity<>("La fecha es un campo obligatorio", HttpStatus.BAD_REQUEST);
        }

        VentaService.save(Ventas);
        return new ResponseEntity<>(Ventas, HttpStatus.OK);
        }

        
    @GetMapping("/{id}")
    public ResponseEntity<Object> findOne(@PathVariable String id) {
        var Ventas = VentaService.findOne(id);
        return new ResponseEntity<>(Ventas, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable String id) {
        VentaService.delete(id);
        return new ResponseEntity<>("Registro eliminado", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable String id, @ModelAttribute("Ventas") Ventas VentasUpdate) {
        var Ventas = VentaService.findOne(id).get();

        if (Ventas != null) {

            Ventas.setTotalVenta(VentasUpdate.getTotalVenta());
            Ventas.setEstadoVenta(VentasUpdate.getEstadoVenta());
            Ventas.setFechaVenta(VentasUpdate.getFechaVenta());
            

            VentaService.save(Ventas);

            return new ResponseEntity<>(Ventas, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Error usuario NO encontrado", HttpStatus.BAD_REQUEST);
        }
    }
    

    
    
}
