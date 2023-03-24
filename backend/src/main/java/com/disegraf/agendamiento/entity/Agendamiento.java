package com.disegraf.agendamiento.entity;

import jakarta.persistence.*;
import java.util.Date;
//import javax.persistence.*;

@Entity
@Table(name = "agenda")
public class Agendamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombres;
    private String contacto;
    private String fecha;
    private String hora;
    private String horario;
    private String tipo;
    private int abono;
    private int pago;
    private String descripcion;
    
    //primero un constructor vacio
    public Agendamiento(){}
    
    
    //ahora un constructor con parametros
    public Agendamiento(String nombres, String contacto, String fecha, String hora, String horario, String tipo, int abono, int pago, String descripcion) {
        this.id = id;
        this.nombres = nombres;
        this.contacto = contacto;
        this.fecha = fecha;
        this.hora = hora;
        this.horario = horario;
        this.tipo = tipo;
        this.abono = abono;
        this.pago = pago;
        this.descripcion = descripcion;
    }

    //insertamos getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAbono() {
        return abono;
    }

    public void setAbono(int abono) {
        this.abono = abono;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
