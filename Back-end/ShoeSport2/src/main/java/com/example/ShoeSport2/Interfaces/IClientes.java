package com.example.ShoeSport2.Interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ShoeSport2.models.Clientes;

@Repository
public interface IClientes extends CrudRepository<Clientes, String> {

    /*
     * nombre cliente
     * ciudad
     * estado
     */

    @Query("SELECT c FROM Clientes c WHERE c.PrimerNombre = ?1 OR c.Ciudad = ?1 OR c.Estado = ?1")
    List<Clientes> ClientesExist(String PrimerNombre, String Ciudad, String Estado);
    
}
