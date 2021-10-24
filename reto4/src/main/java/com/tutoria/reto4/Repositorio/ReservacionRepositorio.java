package com.tutoria.reto4.Repositorio;

import java.util.List;
import java.util.Optional;

import com.tutoria.reto4.Interface.InterfaceReservacion;
import com.tutoria.reto4.Modelo.Reservacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservacionRepositorio
{
    @Autowired
    private InterfaceReservacion crud4;

    public List<Reservacion> getAll(){
        return (List<Reservacion>) crud4.findAll();
    }
    public Optional<Reservacion> getReservation(int id){
        return crud4.findById(id);
    }
    public Reservacion save(Reservacion reservation){
        return crud4.save(reservation);
    }
     public void delete(Reservacion reservacion){
        crud4.delete(reservacion);
    }
}
