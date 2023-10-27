package Datos;

import Entidades.Ciudad;
import Entidades.Pasaje;
import Entidades.Transporte;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PasajeDatos {

    private static Connection con = Conexion1.getConexion();
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    public static void guardarPasaje(Pasaje pas) {
        String sqlCrear = "insert into pasaje(tipoTransporte,importe,idCiuOrigen,estado)values(?,?,?,?)";
        try {

            ps = con.prepareStatement(sqlCrear, Statement.RETURN_GENERATED_KEYS);
            //https://stackoverflow.com/questions/13291076/java-enum-why-use-tostring-instead-of-name
            ps.setString(1, pas.getTipoTransporte().name());//por lo que entiendo el met. name() para este caso es similar al toString pero se recomienda el name()porq el toString puede sufrir una sobre-escritura
            ps.setDouble(2, pas.getImporte());
            ps.setInt(3, pas.getNomCiuOrigen().getIdCiudad());
            ps.setBoolean(4, pas.isEstado());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pas.setIdPasaje(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Guardado exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "Imposible guardarlo en la base de datos");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar los datos en la tabla de Pasaje");
        }
    }

    public static void eliminarPasaje(int idP) {
        String sqlBorrar = "delete from pasaje where idPasaje=?";

        try {
            ps = con.prepareStatement(sqlBorrar);
            ps.setInt(1, idP);
            int fila = ps.executeUpdate();
            if (fila > 0) {
                JOptionPane.showMessageDialog(null, "Pasaje Eliminado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Pasaje");
        }
    }

    public static void modificarPasaje(Pasaje pas) {
        // estado para que lo modifique de false a true, por el hecho de q si algún cliente cambia de opinión
        String sqlActualizar = "update pasaje set tipoTransporte = ?, idCiuOrigen = ?, importe = ?,estado=? where idPasaje = ?";
        try {
            ps = con.prepareStatement(sqlActualizar);

            ps.setString(1, pas.getTipoTransporte().name());
//            Ciudad ciudad = CiudadDatos.buscarCiudadPorId(idC);
            ps.setInt(2, pas.getNomCiuOrigen().getIdCiudad());
            ps.setDouble(3, pas.getImporte());
            ps.setBoolean(4, pas.isEstado());
            ps.setInt(5, pas.getIdPasaje());

            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Actualización realizada correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Actualización realizada incorrectamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Pasajes");
        }

    }

    public static Pasaje buscarPasaje(int id) {
        String sqlBusqueda = "select tipoTransporte,idCiuOrigen,importe from pasaje where idPasaje=? and estado=1";
        Pasaje pasaje = new Pasaje();
        try {
            ps = con.prepareStatement(sqlBusqueda);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                pasaje.setIdPasaje(id);
                //lo que traiga el rs me lo guardo en una variable
                String tipoTransporteStr = rs.getString("tipoTransporte");
                //el valueOf sirve para comparar el valor de la cadena con los valores del enum
                Transporte tipoTransporte = Transporte.valueOf(tipoTransporteStr);
                pasaje.setTipoTransporte(tipoTransporte);
                Ciudad ciudad = CiudadDatos.buscarCiudadPorId(rs.getInt("idCiuOrigen"));
                pasaje.setNomCiuOrigen(ciudad);
                pasaje.setImporte(rs.getDouble("importe"));
                pasaje.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "El pasaje no se encuentra activo o no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Pasaje");
        }
        return pasaje;
    }

    public static List<Pasaje> listaPas() {
        List<Pasaje> listaPasaje = new ArrayList<>();
        String sqlBusqueda = "select * from pasaje";
        try {
            ps = con.prepareStatement(sqlBusqueda);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pasaje pasaje = new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                String tipoTransporteStr = rs.getString("tipoTransporte");
                Transporte tipoTransporte = Transporte.valueOf(tipoTransporteStr);
                pasaje.setTipoTransporte(tipoTransporte);
                pasaje.setImporte(rs.getDouble("importe"));
                Ciudad ciudad = CiudadDatos.buscarCiudadPorId(rs.getInt("idCiuOrigen"));
                pasaje.setNomCiuOrigen(ciudad);
                pasaje.setEstado(rs.getBoolean("estado"));
                listaPasaje.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }

        return listaPasaje;
    }
    
    public static List<Pasaje> listarPasajesActivos(){
        List<Pasaje> listaPasaje = new ArrayList<>();
        String sqlBusqueda = "select * from pasaje where estado = 1";
        try {
            ps = con.prepareStatement(sqlBusqueda);
            rs = ps.executeQuery();
            while (rs.next()) {
                Pasaje pasaje = new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                String tipoTransporteStr = rs.getString("tipoTransporte");
                Transporte tipoTransporte = Transporte.valueOf(tipoTransporteStr);
                pasaje.setTipoTransporte(tipoTransporte);
                pasaje.setImporte(rs.getDouble("importe"));
                Ciudad ciudad = CiudadDatos.buscarCiudadPorId(rs.getInt("idCiuOrigen"));
                pasaje.setNomCiuOrigen(ciudad);
                pasaje.setEstado(rs.getBoolean("estado"));
                listaPasaje.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }

        return listaPasaje;
           
    }
    public static List<Pasaje> listarPasajesxCiudad(Ciudad ciu){
         if (ciu == null) {
        return new ArrayList<>(); 
    }
        List<Pasaje> listaPasaje = new ArrayList<>();
        String sqlBusqueda = "select * from pasaje where estado = 1 and idCiuOrigen=?";
        try {
            
            ps = con.prepareStatement(sqlBusqueda);
            ps.setInt(1, ciu.getIdCiudad());
            rs = ps.executeQuery();
            while (rs.next()) {
                Pasaje pasaje = new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                String tipoTransporteStr = rs.getString("tipoTransporte");
                Transporte tipoTransporte = Transporte.valueOf(tipoTransporteStr);
                pasaje.setTipoTransporte(tipoTransporte);
                pasaje.setImporte(rs.getDouble("importe"));
                pasaje.setNomCiuOrigen(ciu);
                pasaje.setEstado(rs.getBoolean("estado"));
                listaPasaje.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        }
        return listaPasaje;
           
    }
   
}
