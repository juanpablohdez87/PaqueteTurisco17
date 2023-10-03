package Entidades;

/**
 *
 * @author lucia
 */
public class Cliente {
    private int idCliente;
    private String nombre;
    private String apellido;
    private int telefono;
    private int dni;
    private Paquete paquete;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int telefono, int dni, Paquete paquete) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
        this.paquete = paquete;
    }

    public Cliente(int idCliente, String nombre, String apellido, int telefono, int dni, Paquete paquete) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
        this.paquete = paquete;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", dni=" + dni + ", paquete=" + paquete + '}';
    }
     
}
