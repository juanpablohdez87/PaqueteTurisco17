package Datos;

import Entidades.Alojamiento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;

public class AlojamientoDatos {

    private static Connection con = Conexion1.getConexion();
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    public static void alojamientoGuardar(Alojamiento alo) {

        String sql = "insert into alojamiento(idCiuDestino, fechaIngreso, fechaSalida, servicio, importeDiario, estado) value (?, ?, ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alo.getCiuDestino().getIdCiudad());
            ps.setDate(2, Date.valueOf(alo.getFechaIngreso()));
            ps.setDate(3, Date.valueOf(alo.getFechaSalida()));
            ps.setString(4, alo.getServicio());
            ps.setDouble(5, alo.getImporteDiario());
            ps.setBoolean(6, alo.isEstado());

            ps.executeUpdate();
            rs = ps.getGeneratedKeys();

            if (rs.next()) {
                alo.setIdAlojamiento(rs.getInt(1));
                System.out.println("ID generado");
            } else {
                System.out.println("Error: ID");
            }
            ps.close();
            JOptionPane.showMessageDialog(null, ">>> Guardado <<<");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar " + e.getMessage());
        }
    }

    public static void eliminarAlojamiento(int id) {

        String sql = "update alojamiento set estado = 0 where idAlojamiento = ?";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Alojamiento eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "Alojamiento eliminado con anterioridad");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceso de datos Alojamiento" + e.getMessage());
        }

    }

    public static void modificarAlojamiento(Alojamiento alo) {
        
        String sql = "update alojamiento set idCiuDestino = ?, fechaIngreso = ?, fechaSalida = ?, servicio = ?, importeDiario = ? where idAlojamiento = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, alo.getCiuDestino().getIdCiudad());
            ps.setDate(2, Date.valueOf(alo.getFechaIngreso()));
            ps.setDate(3, Date.valueOf(alo.getFechaSalida()));
            ps.setString(4, alo.getServicio());
            ps.setDouble(5, alo.getImporteDiario());
            ps.setInt(6, alo.getIdAlojamiento());
            
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Datos Alojamiento Modificados");
            } else {
                JOptionPane.showMessageDialog(null, "Error: Carga de datos Alojamiento inexistente");
            }
            ps.close();            

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceso de datos Alojamiento" + ex.getMessage());
        }

    }

    public static Alojamiento buscarAlojamiento(String ciuDestino) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static List<Alojamiento> listaAlo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
