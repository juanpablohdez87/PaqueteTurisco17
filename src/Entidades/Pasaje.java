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
public class Pasaje {
    private int idPasaje;
    private Transporte tipoTransporte;//prodria ser con herencia
    private double importe;
    private Ciudad nomCiuOrigen;
    private boolean estado;

    public Pasaje() {
    }

    public Pasaje(Transporte tipoTransporte, double importe, Ciudad nomCiuOrigen, boolean estado) {
        this.tipoTransporte = tipoTransporte;
        this.importe = importe;
        this.nomCiuOrigen = nomCiuOrigen;
        this.estado = estado;
    }

    public Pasaje(int idPasaje, Transporte tipoTransporte, double importe, Ciudad nomCiuOrigen, boolean estado) {
        this.idPasaje = idPasaje;
        this.tipoTransporte = tipoTransporte;
        this.importe = importe;
        this.nomCiuOrigen = nomCiuOrigen;
        this.estado = estado;
    }

    public int getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }

    public Transporte getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(Transporte tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Ciudad getNomCiuOrigen() {
        return nomCiuOrigen;
    }

    public void setNomCiuOrigen(Ciudad nomCiuOrigen) {
        this.nomCiuOrigen = nomCiuOrigen;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  "["+tipoTransporte+"]" + " Importe: $ " + importe;
    }
    
    
    
}
