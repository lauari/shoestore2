package com.example.ShoeSport2.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.example.ShoeSport2.models.Clientes;

public interface IClienteService {

     public String save(Clientes Clientes);

    public List<Clientes> findAll();

    public List<Clientes> ClientesExist(String PrimerNombre, String Ciudad, String Estado);

    public Optional<Clientes> findOne(String id);

    // cambiar el int
    public int delete(String id);
    
}
