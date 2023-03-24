package com.disegraf.agendamiento.dto;

import java.sql.Date;
import jakarta.annotation.*;
import org.springframework.lang.Nullable;
/**
 *
 * @author Lau
 */
public class AgendamientoDTO {
    @Nonnull
    private String nombres;
    
    @Nonnull
    private String fecha;
    
    @Nonnull
    private String contacto;
    
    @Nullable
    private String hora;
    
    @Nullable
    private String horario;
    
    @Nullable
    private String tipo;
    
    @Nullable
    private int abono;
    
    @Nullable
    private int pago;
    
    @Nullable
    private String descripcion;
    
    

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
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
