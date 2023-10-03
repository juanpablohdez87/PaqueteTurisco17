package Datos;

import Entidades.Ciudad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class CiudadDatos {

    private Connection con;

    private PreparedStatement ps;

    private ResultSet rs;

    public static void ciudadGuardar(Ciudad ciudad) {
    }

    public Ciudad buscarCiudad(String nombre) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Ciudad> listaC() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static void eliminarCiudad(Ciudad ciudad) {
    }

    public static void modificarCiudad(Ciudad ciudad) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
