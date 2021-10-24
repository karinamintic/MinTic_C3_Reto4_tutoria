package com.tutoria.reto4.Interface;

import com.tutoria.reto4.Modelo.Mensaje;

import org.springframework.data.repository.CrudRepository;

public interface InterfaceMensaje extends CrudRepository<Mensaje, Integer>
{
    
}
