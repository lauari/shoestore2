package com.example.ShoeSport2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ShoeSport2.InterfaceService.IClienteService;
import com.example.ShoeSport2.Interfaces.IClientes;
import com.example.ShoeSport2.models.Clientes;


@RestController
@RequestMapping("/api/v1/Clientes")
public class ClienteService implements IClienteService {

     
    @Autowired
    private IClientes data;

    
    @Override
    public String save(Clientes Clientes) {
        data.save(Clientes);
        return Clientes.getIdClientes();
    }

    @Override
    public List<Clientes> findAll() {
        List<Clientes> listaClientes = (List<Clientes>) data.findAll();
        return listaClientes;
    }

    @Override
    public Optional<Clientes> findOne(String id) {
        Optional<Clientes> Clientes = data.findById(id);
        return Clientes;
    }

    //filtro por nombre, ciudad y estado

    @Override
    public List<Clientes> ClientesExist(String PrimerNombre, String Ciudad, String Estado){
        List<Clientes> listaClientes = data.ClientesExist(PrimerNombre, Ciudad, Estado);
        return listaClientes;
    }

    // Corregir tipo de dato int
    @Override
    public int delete(String id) {
        data.deleteById(id);
        return 1;
    }
    
}
