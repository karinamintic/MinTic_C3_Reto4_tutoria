package com.tutoria.reto4.Repositorio;

import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

import com.tutoria.reto4.Interface.InterfaceCliente;
import com.tutoria.reto4.Modelo.Cliente;

import org.springframework.beans.factory.annotation.Autowired;

@Repository
public class ClienteRepositorio
{
    @Autowired
    private InterfaceCliente crud1;

    public List<Cliente> getAll(){
        return (List<Cliente>) crud1.findAll();
    }

    public Optional <Cliente> getCliente(int id){
        return crud1.findById(id);
    }

    public Cliente save(Cliente cliente){
        return crud1.save(cliente);
    }
     public void delete(Cliente cliente){
        crud1.delete(cliente);
    }
}
