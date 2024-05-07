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

import com.example.ShoeSport2.InterfaceService.IProductoService;
import com.example.ShoeSport2.models.Productos;

import lombok.var;

@RestController
@RequestMapping("/api/v1/Productos")
public class ProductosController {

    
    @Autowired
    private IProductoService ProductoService;

    @PostMapping("/")
    public ResponseEntity<Object> save(@ModelAttribute("Productos") Productos Productos) {

        if (Productos.getNombreProducto().equals("")) {

            return new ResponseEntity<>("El nombre del producto es un campo obligatorio", HttpStatus.BAD_REQUEST);
        }

        if (Productos.getDescripcionProducto().equals("")) {

            return new ResponseEntity<>("La descripcion del producto es un campo obligatorio", HttpStatus.BAD_REQUEST);
        }

        if (Productos.getCantidadProducto().equals("")) {

            return new ResponseEntity<>("La cantidad del producto es un campo obligatorio", HttpStatus.BAD_REQUEST);
        }

        if (Productos.getPrecioProducto().equals("")) {

            return new ResponseEntity<>("El precio del producto es un campo obligatorio",
                    HttpStatus.BAD_REQUEST);
        }

        if (Productos.getIvaProducto().equals("")) {

            return new ResponseEntity<>("El IVA del producto es un campo obligatorio",
                    HttpStatus.BAD_REQUEST);
        }

        if (Productos.getDescuentoProducto().equals("")) {

            return new ResponseEntity<>("El descuento del producto es un campo obligatorio",
                    HttpStatus.BAD_REQUEST);
        }

        ProductoService.save(Productos);
        return new ResponseEntity<>(Productos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findOne(@PathVariable String id) {
        var Productos = ProductoService.findOne(id);
        return new ResponseEntity<>(Productos, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable String id) {
        ProductoService.delete(id);
        return new ResponseEntity<>("Registro eliminado", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable String id, @ModelAttribute("Productos") Productos ProductosUpdate){
        var Productos= ProductoService.findOne(id).get();

        if (Productos != null) {
            

            Productos.setNombreProducto(ProductosUpdate.getNombreProducto());
            Productos.setDescripcionProducto(ProductosUpdate.getDescripcionProducto());
            Productos.setCantidadProducto(ProductosUpdate.getCantidadProducto());
            Productos.setPrecioProducto(ProductosUpdate.getPrecioProducto());
            Productos.setIvaProducto(ProductosUpdate.getIvaProducto());
            Productos.setDescuentoProducto(ProductosUpdate.getDescuentoProducto());

            ProductoService.save(Productos);

            return new ResponseEntity<>(Productos, HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Error producto No encontrado", HttpStatus.BAD_REQUEST);
        }
    }
    
}
