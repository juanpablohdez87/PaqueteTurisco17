/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Juan
 */
public class Paquete {
    
    private int idPaquete;
    private Ciudad ciuOrigen;
    private Ciudad ciuDestino;
    private Alojamiento alojamiento;
    private Pasaje pasaje;

    public Paquete() {
    }

    public Paquete(Ciudad ciuOrigen, Ciudad ciuDestino, Alojamiento alojamiento, Pasaje pasaje) {
        this.ciuOrigen = ciuOrigen;
        this.ciuDestino = ciuDestino;
        this.alojamiento = alojamiento;
        this.pasaje = pasaje;
    }

    public Paquete(int idPaquete, Ciudad ciuOrigen, Ciudad ciuDestino, Alojamiento alojamiento, Pasaje pasaje) {
        this.idPaquete = idPaquete;
        this.ciuOrigen = ciuOrigen;
        this.ciuDestino = ciuDestino;
        this.alojamiento = alojamiento;
        this.pasaje = pasaje;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Ciudad getCiuOrigen() {
        return ciuOrigen;
    }

    public void setCiuOrigen(Ciudad ciuOrigen) {
        this.ciuOrigen = ciuOrigen;
    }

    public Ciudad getCiuDestino() {
        return ciuDestino;
    }

    public void setCiuDestino(Ciudad ciuDestino) {
        this.ciuDestino = ciuDestino;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    public Pasaje getPasaje() {
        return pasaje;
    }

    public void setPasaje(Pasaje pasaje) {
        this.pasaje = pasaje;
    }

    @Override
    public String toString() {
        return "Paquete{" + "idPaquete=" + idPaquete + ", ciuOrigen=" + ciuOrigen + ", ciuDestino=" + ciuDestino + ", alojamiento=" + alojamiento + ", pasaje=" + pasaje + '}';
    }
    
    
    
}
