package Datos;

import Entidades.Ciudad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CiudadDatos {

    private static Connection con = Conexion1.getConexion();
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    public static void ciudadGuardar(Ciudad ciudad) {
        String sql = "insert into ciudad( nombre, pais, estado, provincia) value( ?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, ciudad.getNombre());
            ps.setString(2, ciudad.getPais());
            ps.setBoolean(3, ciudad.isEstado());
            ps.setString(4, ciudad.getProvincia());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                ciudad.setIdCiudad(rs.getInt(1));
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

    public static Ciudad buscarCiudad(String nombre) {
        String sql = "select idCiudad, pais, provincia from ciudad where nombre = ? and estado = 1";
        Ciudad ciu = new Ciudad();
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            if (rs.next()) {
                ciu.setIdCiudad(rs.getInt("idCiudad"));
                ciu.setNombre(nombre);
                ciu.setPais(rs.getString("pais"));
                ciu.setEstado(true);
                ciu.setProvincia(rs.getString("provincia"));
            } else {
                JOptionPane.showMessageDialog(null, "La Ciudad no esta activo o no existe");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: Al acceso Ciudad");
        }
        return ciu;
    }

    public static List<Ciudad> listarCiu() {
        List<Ciudad> listaCiu = new ArrayList<>();
        String sql = "select * from ciudad";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Ciudad ciu = new Ciudad();
                ciu.setIdCiudad(rs.getInt("idCiudad"));
                ciu.setNombre(rs.getString("nombre"));
                ciu.setPais(rs.getString("pais"));
                ciu.setEstado(rs.getBoolean("estado"));
                ciu.setProvincia(rs.getString("provincia"));
                listaCiu.add(ciu);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: Acceso a la tabla de Ciudad");
        }

        System.out.println("---> Lista de Ciudades Registrada");
        for (Ciudad c : listaCiu) {
            System.out.println(c.toString());
        }
        return listaCiu;
    }

    public static void eliminarCiudad(int id) {
        String sql = "update ciudad set estado = 0 where idCiudad = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "---> Ciudad Eliminada");
            } else {
                JOptionPane.showMessageDialog(null, "---> Ciudad ya no activa");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceso a la tabla Ciudad" + ex.getMessage());
        }
    }

    public static void modificarCiudad(Ciudad ciudad) {
        String sql = " update ciudad set nombre = ?, pais = ?, provincia = ? where idCiudad = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ciudad.getNombre());
            ps.setString(2, ciudad.getPais());
            ps.setString(3, ciudad.getProvincia());
            ps.setInt(4, ciudad.getIdCiudad());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Ciudad Actualizada");
            } else {
                JOptionPane.showMessageDialog(null, "Error: Ciudad no Existente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceso a la tabla Ciudad " + ex.getMessage());
        }
    }
    
}