package com.disegraf.agendamiento.controllers;

import com.disegraf.agendamiento.dto.Mensaje;
import com.disegraf.agendamiento.dto.AgendamientoDTO;
import com.disegraf.agendamiento.entity.Agendamiento;
import com.disegraf.agendamiento.service.AgendamientoService;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;

import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Lau
 */

//notacion para dar a entender que esta clase se trata de un controlador
@RestController

//notacion para indicar el contexto de nuestros endpoints
@RequestMapping("/api/agenda")

//notacion para usarse luego con angular
@CrossOrigin(origins = "http://localhost:4200")
public class AgendamientoController {
    
    //se inyecta la dependencia
    @Autowired
    AgendamientoService agendamientoService;

    @PostMapping("/asignarCita")
    public ResponseEntity<?> asignaCita(@RequestBody AgendamientoDTO agendaDto){
        if(StringUtils.isBlank(agendaDto.getNombres()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(agendaDto.getFecha()))
            return new ResponseEntity(new Mensaje("La fecha es obligatoria"), HttpStatus.BAD_REQUEST);
        
        Agendamiento agendamiento = new Agendamiento(agendaDto.getNombres(), agendaDto.getContacto(), agendaDto.getFecha(), agendaDto.getHora(), agendaDto.getHorario(), agendaDto.getTipo(), agendaDto.getAbono(), agendaDto.getPago(), agendaDto.getDescripcion());
        agendamientoService.saveAgendamiento(agendamiento);
        return new ResponseEntity(new Mensaje("Cita asignada"), HttpStatus.OK);
        
    }
    
    @GetMapping("/listarCitas")
    public ResponseEntity<List<Agendamiento>> listaCitas(){
        List<Agendamiento> agenda = agendamientoService.listaAgenda();
        return new ResponseEntity<List<Agendamiento>>(agenda, HttpStatus.OK);
    }
    
    @GetMapping("/detalleFecha/{fecha}")
    public ResponseEntity<Agendamiento> agendaByFecha(@PathVariable("fecha") String fecha){
        if(!agendamientoService.existsByFecha(fecha))
            return new ResponseEntity(new Mensaje("No existe cita asignada para la fecha"), HttpStatus.NOT_FOUND);
                
        List<Agendamiento> agendamiento = agendamientoService.getByFecha(fecha);
        return new ResponseEntity(agendamiento, HttpStatus.OK);
    }
    
}
