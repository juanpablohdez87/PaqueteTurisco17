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
    private int cantPersonas;
    private double importeTotal;
    private boolean abonado;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int telefono, int dni, Paquete paquete, int cantPersonas, double importeTotal, boolean abonado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
        this.paquete = paquete;
        this.cantPersonas = cantPersonas;
        this.importeTotal = importeTotal;
        this.abonado = abonado;
    }

    public Cliente(int idCliente, String nombre, String apellido, int telefono, int dni, Paquete paquete, int cantPersonas, double importeTotal, boolean abonado) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
        this.paquete = paquete;
        this.cantPersonas = cantPersonas;
        this.importeTotal = importeTotal;
        this.abonado = abonado;
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

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public boolean isAbonado() {
        return abonado;
    }

    public void setAbonado(boolean abonado) {
        this.abonado = abonado;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", dni=" + dni + ", paquete=" + paquete + ", cantPersonas=" + cantPersonas + ", importeTotal=" + importeTotal + ", abonado=" + abonado + '}';
    }

    
    
    
}
