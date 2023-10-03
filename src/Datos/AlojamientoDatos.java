package Datos;

import Entidades.Alojamiento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class AlojamientoDatos {

    private Connection con;

    private PreparedStatement ps;

    private ResultSet rs;

    public static void alojamientoGuardar(Alojamiento alo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static void eliminarAlojamiento(Alojamiento alo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static void modificarAlojamiento(Alojamiento alo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static Alojamiento buscarAlojamiento(String ciuDestino) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static List<Alojamiento> listaAlo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
