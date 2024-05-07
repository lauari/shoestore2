package com.example.ShoeSport2.Interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ShoeSport2.models.Clientes;

@Repository
public interface IClientes extends CrudRepository<Clientes, String> {

    /*
     * tipo documento
     * numero documento
     * nombre cliente
     * apellido cliente
     * numero documento del cliente
     * telefono del cliente
     * direccion de cliente
     * ciudad
     * estado
     */

    @Query("SELECT c FROM Clientes c WHERE c.PrimerNombre LIKE %?1% OR c.Ciudad LIKE %?2% OR c.Estado LIKE %?3%")
    List<Clientes> ClientesExist(String PrimerNombre, String Ciudad, String Estado);
    
}
