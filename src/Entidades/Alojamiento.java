/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author Juan
 */
public class Alojamiento {
    
    private int idAlojamiento;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private boolean estado;
    private String servicio;//Pueder enum
    private double importeDiario;
    private Ciudad ciuDestino;

    public Alojamiento() {
    }

    public Alojamiento(LocalDate fechaIngreso, LocalDate fechaSalida, boolean estado, String servicio, double importeDiario, Ciudad ciuDestino) {
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.ciuDestino = ciuDestino;
    }

    public Alojamiento(int idAlojamiento, LocalDate fechaIngreso, LocalDate fechaSalida, boolean estado, String servicio, double importeDiario, Ciudad ciuDestino) {
        this.idAlojamiento = idAlojamiento;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.ciuDestino = ciuDestino;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public double getImporteDiario() {
        return importeDiario;
    }

    public void setImporteDiario(double importeDiario) {
        this.importeDiario = importeDiario;
    }

    public Ciudad getCiuDestino() {
        return ciuDestino;
    }

    public void setCiuDestino(Ciudad ciuDestino) {
        this.ciuDestino = ciuDestino;
    }

    @Override
    public String toString() {
        return "Alojamiento{" + "idAlojamiento=" + idAlojamiento + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", estado=" + estado + ", servicio=" + servicio + ", importeDiario=" + importeDiario + ", ciuDestino=" + ciuDestino + '}';
    }
    
            
    
}
