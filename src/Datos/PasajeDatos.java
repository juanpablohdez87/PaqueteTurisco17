package Datos;

import Entidades.Pasaje;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;

public class PasajeDatos {

    private static Connection con = Conexion1.getConexion();
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    public static void ciudadPasaje(Pasaje pas) {
        String sqlCrear="insert into pasaje(tipoTransporte, idCiuOrigen,importe,estado)values(?,?,?,?)";
        try {
            ps=con.prepareStatement(sqlCrear,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,pas.getTipoTransporte());
            ps.setInt(2, pas.getNomCiuOrigen().getIdCiudad());
            ps.setDouble(3, pas.getImporte());
            ps.setBoolean(4, pas.isEstado());
            ps.executeUpdate();
            rs=ps.getGeneratedKeys();
            if(rs.next()){
                pas.setIdPasaje(rs.getInt(1));
                System.out.println("bien");
            }else{
                System.out.println("mal");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar los datos en la tabla de Pasaje");
        }
    }

    public static void eliminarPasaje(Pasaje pas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static void modificarPasaje(Pasaje pas) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static Pasaje buscarPasaje(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static List<Pasaje> listaPas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}