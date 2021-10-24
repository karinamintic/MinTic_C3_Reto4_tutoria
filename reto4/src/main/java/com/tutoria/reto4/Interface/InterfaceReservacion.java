package com.tutoria.reto4.Interface;

import com.tutoria.reto4.Modelo.Reservacion;

import org.springframework.data.repository.CrudRepository;

public interface InterfaceReservacion extends CrudRepository<Reservacion, Integer>
{
    
}
