package Datos;

import Entidades.Paquete;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class PaqueteDatos {

    private Connection con;

    private PreparedStatement ps;

    private ResultSet rs;

    public void guardarPaquete(Paquete paq) {
    }

    public void eliminarPaquete(Paquete paq) {
    }

    public List<Paquete> listaPaq() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
