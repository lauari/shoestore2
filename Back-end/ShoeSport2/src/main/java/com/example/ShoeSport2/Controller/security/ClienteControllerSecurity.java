package com.example.ShoeSport2.Controller.security;

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

import com.example.ShoeSport2.InterfaceService.IClienteService;
import com.example.ShoeSport2.models.Clientes;

@RestController
@RequestMapping("/api/v1/Clientes/security")
public class ClienteControllerSecurity {

    @Autowired
    private IClienteService ClienteService;
    @PostMapping("path")
    public ResponseEntity <Object> save(@ModelAttribute("Clientes") Clientes Clientes) {

        if (Clientes.getTipoDocumento().equals("")) {

            return new ResponseEntity<>("El tipo es un campo obligatorio", HttpStatus.BAD_REQUEST);
        }

        if (Clientes.getNumeroDocumento().equals("")) {

            return new ResponseEntity<>("El numero es un campo obligatorio", HttpStatus.BAD_REQUEST);
        }

        if (Clientes.getPrimerNombre().equals("")) {

            return new ResponseEntity<>("El nombre de telefono es un campo obligatorio", HttpStatus.BAD_REQUEST);
        }

        if (Clientes.getPrimerApellido().equals("")) {

            return new ResponseEntity<>("El apellido es un campo obligatorio", HttpStatus.BAD_REQUEST);
        }

        if (Clientes.getTelefono().equals("")) {

            return new ResponseEntity<>("El telefono es un campo obligatorio", HttpStatus.BAD_REQUEST);
        }

        if (Clientes.getDireccion().equals("")) {

            return new ResponseEntity<>("La direccion es un campo obligatorio", HttpStatus.BAD_REQUEST);
        }

        if (Clientes.getCiudad().equals("")) {

            return new ResponseEntity<>("La ciudad es un campo obligatorio", HttpStatus.BAD_REQUEST);
        }
        
        if (Clientes.getEstado().equals("")) {

            return new ResponseEntity<>("El estado es un campo obligatorio", HttpStatus.BAD_REQUEST);
        }

        if (Clientes.getCorreo().equals("")) {

            return new ResponseEntity<>("El correo es un campo obligatorio", HttpStatus.BAD_REQUEST);
        }

        // todo bien
        ClienteService.save(Clientes);
        return new ResponseEntity<>(Clientes, HttpStatus.OK);
    }
    
     @GetMapping("/{id}")
    public ResponseEntity<Object> findOne(@PathVariable String id) {
        var Clientes = ClienteService.findOne(id);
        return new ResponseEntity<>(Clientes, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable String id) {
        ClienteService.delete(id);
        return new ResponseEntity<>("Registro eliminado", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable String id, @ModelAttribute("Clientes") Clientes ClientesUpdate) {
        var Clientes = ClienteService.findOne(id).get();

        if (Clientes != null) {

            Clientes.setTipoDocumento(ClientesUpdate.getTipoDocumento());
            Clientes.setNumeroDocumento(ClientesUpdate.getNumeroDocumento());
            Clientes.setPrimerNombre(ClientesUpdate.getPrimerNombre());
            Clientes.setPrimerApellido(ClientesUpdate.getPrimerApellido());
            Clientes.setTelefono(ClientesUpdate.getTelefono());
            Clientes.setDireccion(ClientesUpdate.getDireccion());
            Clientes.setCiudad(ClientesUpdate.getCiudad());
            Clientes.setEstado(ClientesUpdate.getEstado());
            Clientes.setCorreo(ClientesUpdate.getCorreo());

            ClienteService.save(Clientes);

            return new ResponseEntity<>("Guardado", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Error usuario NO encontrado", HttpStatus.BAD_REQUEST);
        }
    }
    
}
