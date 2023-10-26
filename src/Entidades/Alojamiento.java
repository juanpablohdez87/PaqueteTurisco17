package Entidades;

import java.time.LocalDate;

/**
 *
 * @author Juan
 */
public class Alojamiento {

    private int idAlojamiento;
    private Ciudad ciuDestino;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private TipoAlojamiento alojamiento;    
    private Servicio servicio;//enum
    private double importeDiario;
    private boolean estado;

    public Alojamiento() {
    }

    public Alojamiento(Ciudad ciuDestino, LocalDate fechaIngreso, LocalDate fechaSalida, TipoAlojamiento alojamiento, Servicio servicio, double importeDiario, boolean estado) {
        this.ciuDestino = ciuDestino;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.alojamiento = alojamiento;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.estado = estado;
    }

    public Alojamiento(int idAlojamiento, Ciudad ciuDestino, LocalDate fechaIngreso, LocalDate fechaSalida, TipoAlojamiento alojamiento, Servicio servicio, double importeDiario, boolean estado) {
        this.idAlojamiento = idAlojamiento;
        this.ciuDestino = ciuDestino;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.alojamiento = alojamiento;
        this.servicio = servicio;
        this.importeDiario = importeDiario;
        this.estado = estado;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public Ciudad getCiuDestino() {
        return ciuDestino;
    }

    public void setCiuDestino(Ciudad ciuDestino) {
        this.ciuDestino = ciuDestino;
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

    public TipoAlojamiento getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(TipoAlojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public double getImporteDiario() {
        return importeDiario;
    }

    public void setImporteDiario(double importeDiario) {
        this.importeDiario = importeDiario;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Ingreso: " + fechaIngreso + "/ Salida: " + fechaSalida + "/ [" + alojamiento + "]/ [" + servicio + "]/ Importe Diario: " + importeDiario;
    }

   

}
