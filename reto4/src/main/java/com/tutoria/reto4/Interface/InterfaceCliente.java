package com.tutoria.reto4.Interface;

import com.tutoria.reto4.Modelo.Cliente;

import org.springframework.data.repository.CrudRepository;

public interface InterfaceCliente extends CrudRepository<Cliente, Integer> 
{
    
}
