package com.disegraf.agendamiento.service;

import com.disegraf.agendamiento.entity.Agendamiento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.disegraf.agendamiento.repository.AgendamientoRepository;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Lau
 */

//Notacion para indicar que se trata de un servicio
@Service

//buscar informacion sobre esta anotacion
@Transactional
public class AgendamientoService {

    @Autowired
    AgendamientoRepository agendamientoRepository;
    
    //metodo para listar todo lo que esta en la tabla
    public List<Agendamiento>listaAgenda(){
        return agendamientoRepository.findAll();
    }
    
    //para traer un dato por su id
    public Optional<Agendamiento> getAgenda(int id){
        return agendamientoRepository.findById(id);
    }
    
    //traer un dato por el nombre
    public Optional<Agendamiento> getByNombreAgenda(String nombreAgenda){
        return agendamientoRepository.findByNombres(nombreAgenda);
    }
    
    //traer por la fecha
    public List<Agendamiento> getByFecha(String fecha){
        return agendamientoRepository.findByFecha(fecha);
        //return agendamientoRepository.findByFecha(fecha);
    }
    
    //metodo para guardar datos
    public void saveAgendamiento(Agendamiento agenda){
        agendamientoRepository.save(agenda);
    } 
    
    //metodo para eliminar
    public void deleteAgenda(int id){
        agendamientoRepository.deleteById(id);
    }
    
    //metodo para poder mirar si existe un valor por id
    public boolean existsByidAgenda(int id){
        return agendamientoRepository.existsById(id);
    }
    
    //metodo para poder obtener el detalle de la agenda por la fecha
    public boolean existsByFecha(String fecha){
        return agendamientoRepository.existsByFecha(fecha);
    }
    
    //metodo para ver si existe un valor por nombre
    public boolean existsByNombreAgenda(String nombres){
        return agendamientoRepository.existsByNombres(nombres);
    }
}
