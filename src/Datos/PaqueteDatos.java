package Datos;

import Datos.Conexion1;
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

//    public static Paquete buscarPaquetePorId(int id) {
//
//        String sql = "select Ciuorigen, Ciudestino, alojamiento, pasaje from paquete where idpaquete = ? and estado = 1";
//        paquete Paquete = new paquete();
//
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setInt(1, id);
//            rs = ps.executeQuery();
//            if (rs.next()) {
//                paquete.setIdPaquete(id);
//                paquete.setCiuorigen(rs.getInt("Ciuorigen"));
//                paquete.setCiudestino(rs.getString("Ciudestino"));
//                paquete.setAlojamiento(rs.getString("alojamiento"));
//                paquete.setPasaje(rs.getDate("pasaje").toLocalDate());
//                paquete.setEstado(true);
//
//            } else {
//                JOptionPane.showMessageDialog(null, "El Paquete no esta disponible o no existe");
//            }
//            ps.close();
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error: Al acceso Paquete");
//        }
//        return Paquete;
//
//    }
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
//    public static List<Paquete> listarPaquete() {
//        List<Paquete> listaA = new ArrayList<>();
//        String sql = "select * from paquete";
//
//        try {
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                Paquete paquete = new Paquete();
//                paquete.setIdpaquete(rs.getInt("idPaquete"));
//                paquete.setCiuorigen(rs.getInt("Ciuorigen"));
//                paquete.setCiudestino(rs.getString("Ciudestino"));
//                paquete.setNombre(rs.getString("alojamiento"));
//                paquete.setFechaNacimiento(rs.getDate("pasaje").toLocalDate());
//                paquete.setEstado(rs.getBoolean("estado"));
//                listaA.add(paquete);
//
//            }
//            ps.close();
////            JOptionPane.showMessageDialog(null, "Lista Registrada");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error: Acceso a la tabla de paquetes");
//        }
//
//        System.out.println("---> Lista de paquetes Registrada");
//        for (Paquete paq : listaA) {
//            System.out.println(paq.toString());
//        }
//        return listaA;
//    }
//
//    public static void modicarPaquete(Paquete paquete) {
//
//        String sql = "update paquete set Ciuorigen = ?, Ciudestino = ?, Alojamiento = ?, pasaje = ? where idpaquete = ?";
//
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setInt(1, paquete.getCiuorigen());
//            ps.setString(2, paquete.getCiudestino());
//            ps.setString(3, paquete.getAlojamiento());
//            PreparedStatement PreparedStatement = ps.setDate(4, Date.valueOf(paquete.getPasaje()));
//            /*setDate*/
//            ps.setInt(5, paquete.getIdAlumno());
//            int exito = ps.executeUpdate();
//            if (exito == 1) {
//                JOptionPane.showMessageDialog(null, "paquete Actualizado");
//            } else {
//                JOptionPane.showMessageDialog(null, "Error: paquete no Existe");
//            }
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceso a la tabla paquete" + ex.getMessage());
//        }
//
//    }
//
//    public static void eliminarpaquete(int id) {
//        String sql = "update paquete set paquete = 0 where idpaquete= ?";
//
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setInt(1, id);
//            int fila = ps.executeUpdate();
//            if (fila == 1) {
//                JOptionPane.showMessageDialog(null, "---> paquete Eliminado");
//            } else {
//                JOptionPane.showMessageDialog(null, "---> paquete ya no disponible");
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceso a la tabla paquete" + ex.getMessage());
//        }
//
//    }

}