package Datos;

import Datos.Conexion1;
import Entidades.Alojamiento;
import Entidades.Ciudad;
import Entidades.Paquete;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PaqueteDatos {

    private static Connection con = Conexion1.getConexion();
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    public static void guardarPaquete(Paquete paquete) {
        String sql = "insert into Paquete(idCiuOrigen, idCiuDestino, idAlojamiento, idPasaje) value(?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paquete.getCiuOrigen().getIdCiudad());
            ps.setInt(2, paquete.getCiuDestino().getIdCiudad());
            ps.setInt(3, paquete.getAlojamiento().getIdAlojamiento());
            ps.setInt(4, paquete.getPasaje().getIdPasaje());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                paquete.setIdPaquete(rs.getInt(1));
                System.out.println("Se agrego con exito al ID");
            } else {
                System.out.println("no se obtuvo al ID");
            }
            ps.close();
            JOptionPane.showMessageDialog(null, ">>> Guardado <<<");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar " + ex.getMessage());
        }
    }

    public static Paquete buscarPaquetePorId(int id) {
        String sql = "select idCiuOrigen, idCiuDestino, idAlojamiento, idPasaje from paquete where idPaquete = ?";
        Paquete paquete = new Paquete();
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                paquete.setIdPaquete(id);
                paquete.setCiuOrigen(CiudadDatos.buscarCiudadPorId(rs.getInt("idCiuOrigen")));
                paquete.setCiuDestino(CiudadDatos.buscarCiudadPorId(rs.getInt("idCiuDestino")));
                paquete.setAlojamiento( AlojamientoDatos.buscarAlojamiento(rs.getInt("idAlojamiento")));
                paquete.setPasaje(PasajeDatos.buscarPasaje(rs.getInt("idPasaje")));
            } else {
                JOptionPane.showMessageDialog(null, "El Paquete no esta disponible o no existe");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: Al acceso Paquete");
        }
        return paquete;
    }
//
//    public static Paquete buscarPaquetePorCiudestino(int dni) {
//
//        String sql = "select idPaquete, Ciuorigen, Ciudestino, Alojamiento, Pasaje from paquete where Ciudestino = ? and estado = 1";
//        Paquete Paquete = new Paquete();
//
//        try {
//            ps = con.prepareStatement(sql);
//            int Ciuorigen = 0;
//            ps.setInt(1, Ciuorigen);
//            rs = ps.executeQuery();
//            if (rs.next()) {
//                paquete.setIdPaquete(rs.getInt("idPaquete"));
//                paquete.setCiuorigen(rs.getInt("Ciuorigen"));
//                paquete.setCiudestino(rs.getString("Ciudestino"));
//                paquete.setalojamiento(rs.getString("alojamiento"));
//                paquete.pasaje(rs.getDate("pasaje").toLocalDate());
//                paquete.setEstado(true);
//
//            } else {
//                JOptionPane.showMessageDialog(null, "El Paquete no esta disponible o no existe");
//            }
//            ps.close();
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error: Acceso Paquete");
//        }
//        Paquete paquete = null;
//        return paquete;
//    }
//
    public static List<Paquete> listarPaquete() {
        List<Paquete> listaA = new ArrayList<>();
        String sql = "select * from paquete";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Paquete paquete = new Paquete();
                paquete.setIdPaquete(rs.getInt("idPaquete"));
                paquete.setCiuOrigen(CiudadDatos.buscarCiudadPorId(rs.getInt("idCiuOrigen")));
                paquete.setCiuDestino(CiudadDatos.buscarCiudadPorId(rs.getInt("idCiuDestino")));
                paquete.setAlojamiento(AlojamientoDatos.buscarAlojamiento(rs.getInt("idAlojamiento")));
                paquete.setPasaje(PasajeDatos.buscarPasaje(rs.getInt("idPasaje")));
                listaA.add(paquete);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: Acceso a la tabla de paquetes");
        }

//        System.out.println("---> Lista de paquetes Registrada");
//        for (Paquete paq : listaA) {
//            System.out.println(paq.toString());
//        }
        return listaA;
    }
//
//    public static void modicarPaquete(Paquete paquete) {
//        String sql = "update paquete set idCiuOrigen = ?, idCiuDestino = ?, idAlojamiento = ?, idPasaje = ? where idPaquete = ?";
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setInt(1, paquete.getCiuOrigen().getIdCiudad());
//            ps.setInt(2, paquete.getCiuDestino().getIdCiudad());
//            ps.setInt(3, paquete.getAlojamiento().getIdAlojamiento());
//            ps.setInt(4, paquete.getPasaje().getIdPasaje());
//            ps.setInt(5, paquete.getIdPaquete());
//            int exito = ps.executeUpdate();
//            if (exito == 1) {
//                JOptionPane.showMessageDialog(null, "Paquete Actualizado");
//            } else {
//                JOptionPane.showMessageDialog(null, "Error: paquete no Existe");
//            }
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceso a la tabla paquete" + ex.getMessage());
//        }
//    }
//
    public static void eliminarpaquete(int id) {
        String sql = "DELETE FROM paquete WHERE idPaquete = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "---> Paquete Eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "---> Paquete ya no esta Disponible");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceso a la tabla paquete" + ex.getMessage());
        }
    }
    public static List<Paquete> busquedaPaquetexPais(String pais){
        List<Paquete> listaPaquete = new ArrayList<>();
//        String sql="SELECT * FROM paquete INNER JOIN ciudad ON paquete.idCiuDestino = ciudad.idCiudad WHERE ciudad.pais = ?";
        String sqlBusqueda="select Paquete.* from Paquete,Ciudad where Paquete.idCiuDestino = Ciudad.idCiudad and Ciudad.pais like '%"+pais+"%' ORDER BY ciudad.nombre";
        try {
            ps=con.prepareStatement(sqlBusqueda);
//            ps.setString(1,pais);
            rs = ps.executeQuery();
            while (rs.next()) {
                Paquete paquete = new Paquete();
                paquete.setIdPaquete(rs.getInt("idPaquete"));
                
                paquete.setCiuOrigen(CiudadDatos.buscarCiudadPorId(rs.getInt("idCiuOrigen")));
                paquete.setCiuDestino(CiudadDatos.buscarCiudadPorId(rs.getInt("idCiuDestino")));
                paquete.setAlojamiento(AlojamientoDatos.buscarAlojamiento(rs.getInt("idAlojamiento")));
                paquete.setPasaje(PasajeDatos.buscarPasaje(rs.getInt("idPasaje")));
                listaPaquete.add(paquete);
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla paquete "+ex.getMessage());
        }
        return listaPaquete;
        
    }
    public static List<Paquete> busquedaPaquetexFecha(Date fecha,Date fecha1){
      String sqlBusqueda="SELECT paquete.* FROM paquete,alojamiento WHERE paquete.idAlojamiento=alojamiento.idAlojamiento and  fechaIngreso>=? and fechaSalida<=?";  
      List<Paquete> listaPaquete = new ArrayList<>();
        try {
            ps=con.prepareStatement(sqlBusqueda);
            ps.setDate(1, fecha);
            ps.setDate(2, fecha1);
            rs = ps.executeQuery();
            while (rs.next()) {
                Paquete paquete = new Paquete();
                paquete.setIdPaquete(rs.getInt("idPaquete")); 
                paquete.setCiuOrigen(CiudadDatos.buscarCiudadPorId(rs.getInt("idCiuOrigen")));
                paquete.setCiuDestino(CiudadDatos.buscarCiudadPorId(rs.getInt("idCiuDestino")));
                paquete.setAlojamiento(AlojamientoDatos.buscarAlojamiento(rs.getInt("idAlojamiento")));
                paquete.setPasaje(PasajeDatos.buscarPasaje(rs.getInt("idPasaje")));
                listaPaquete.add(paquete);
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de paquete");
        }
        return listaPaquete;
    }
  
}