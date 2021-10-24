package com.tutoria.reto4.Repositorio;

import java.util.List;
import java.util.Optional;

import com.tutoria.reto4.Interface.InterfaceMensaje;
import com.tutoria.reto4.Modelo.Mensaje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MensajeRepositorio 
{
    @Autowired
    private InterfaceMensaje crud3;
    public List<Mensaje> getAll(){
        return (List<Mensaje>) crud3.findAll();
    }
    public Optional<Mensaje> getMessage(int id){
        return crud3.findById(id);
    }

    public Mensaje save(Mensaje message){
        return crud3.save(message);
    }
     public void delete(Mensaje mensaje){
        crud3.delete(mensaje);
    }
}
