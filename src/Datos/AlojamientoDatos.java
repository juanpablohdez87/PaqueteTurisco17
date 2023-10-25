package Datos;

import Entidades.Alojamiento;
import Entidades.Ciudad;
import Entidades.Servicio;
import Entidades.TipoAlojamiento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlojamientoDatos {

    private static Connection con = Conexion1.getConexion();
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    public static void alojamientoGuardar(Alojamiento alo) {

        String sql = "insert into alojamiento(idCiuDestino, fechaIngreso, fechaSalida,tipoAlojamiento, servicio, importeDiario, estado) value (?, ?, ?, ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alo.getCiuDestino().getIdCiudad());
            ps.setDate(2, Date.valueOf(alo.getFechaIngreso()));
            ps.setDate(3, Date.valueOf(alo.getFechaSalida()));
            ps.setString(4, alo.getAlojamiento().name());
            ps.setString(5, alo.getServicio().name());
            ps.setDouble(6, alo.getImporteDiario());
            ps.setBoolean(7, alo.isEstado());

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
        
        String sql = "update alojamiento set idCiuDestino = ?, fechaIngreso = ?, fechaSalida = ?, tipoAlojamiento = ?, servicio = ?, importeDiario = ? where idAlojamiento = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, alo.getCiuDestino().getIdCiudad());
            ps.setDate(2, Date.valueOf(alo.getFechaIngreso()));
            ps.setDate(3, Date.valueOf(alo.getFechaSalida()));
            ps.setString(4, alo.getAlojamiento().name());
            ps.setString(5, alo.getServicio().name());
            ps.setDouble(6, alo.getImporteDiario());
            ps.setInt(7, alo.getIdAlojamiento());
            
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

    public static Alojamiento buscarAlojamiento(int id) {
        
        String sql ="select idCiuDestino, fechaIngreso , fechaSalida ,tipoAlojamiento, servicio , importeDiario  from alojamiento where idAlojamiento = ? and estado= 1";
        Alojamiento alo = new Alojamiento();
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Ciudad ciudad = CiudadDatos.buscarCiudadPorId(rs.getInt("idCiuDestino"));
                String tipoAlojamientoStr=rs.getString("tipoAlojamiento");
                TipoAlojamiento tipoAlo= TipoAlojamiento.valueOf(tipoAlojamientoStr);
                
                String tipoServicioStr = rs.getString("Servicio");
                Servicio tipoServicio = Servicio.valueOf(tipoServicioStr);
                
                alo.setIdAlojamiento(id);
                alo.setCiuDestino(ciudad);
                alo.setFechaIngreso(rs.getDate("fechaIngreso").toLocalDate());
                alo.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                alo.setAlojamiento(tipoAlo);
                alo.setServicio(tipoServicio);
                alo.setImporteDiario(rs.getDouble("importeDiario"));
                alo.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "Alojamiento no esta activo o no existe");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceso de datos Alojamiento"+e.getMessage());
        }
        return alo;
        

    }

    public static List<Alojamiento> listaAlojamientos() {
        List<Alojamiento> listaAlo = new ArrayList<>();
        String sql = "select * from alojamiento ORDER BY fechaIngreso";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Alojamiento alo = new Alojamiento();
                Ciudad ciudad = CiudadDatos.buscarCiudadPorId(rs.getInt("idCiuDestino"));
                String tipoAlojamientoStr=rs.getString("tipoAlojamiento");
                TipoAlojamiento tipoAlo= TipoAlojamiento.valueOf(tipoAlojamientoStr);
                String tipoServicioStr = rs.getString("Servicio");
                Servicio tipoServicio = Servicio.valueOf(tipoServicioStr);
                
                alo.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alo.setCiuDestino(ciudad);
                alo.setFechaIngreso(rs.getDate("fechaIngreso").toLocalDate());
                alo.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                alo.setAlojamiento(tipoAlo);
                alo.setServicio(tipoServicio);
                alo.setImporteDiario(rs.getDouble("importeDiario"));
                alo.setEstado(rs.getBoolean("estado"));

                listaAlo.add(alo);
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceso de datos Alojamiento" + e.getMessage());
        }
        return listaAlo;
    }
    public static List<Alojamiento> listaAlojamientosxCiudadActiva() {
        List<Alojamiento> listaAlo = new ArrayList<>();
        String sql = "select * from alojamiento where estado = 1 ORDER BY fechaIngreso";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Alojamiento alo = new Alojamiento();
                Ciudad ciudad = CiudadDatos.buscarCiudadPorId(rs.getInt("idCiuDestino"));
                String tipoAlojamientoStr=rs.getString("tipoAlojamiento");
                TipoAlojamiento tipoAlo= TipoAlojamiento.valueOf(tipoAlojamientoStr);
                String tipoServicioStr = rs.getString("Servicio");
                Servicio tipoServicio = Servicio.valueOf(tipoServicioStr);
                
                alo.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alo.setCiuDestino(ciudad);
                alo.setFechaIngreso(rs.getDate("fechaIngreso").toLocalDate());
                alo.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                alo.setAlojamiento(tipoAlo);
                alo.setServicio(tipoServicio);
                alo.setImporteDiario(rs.getDouble("importeDiario"));
                alo.setEstado(rs.getBoolean("estado"));

                listaAlo.add(alo);
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceso de datos Alojamiento hoy" + e.getMessage());
        }
        return listaAlo;
    }
    public static List<Alojamiento> listaAlojamientosxCiudad(Ciudad ciu) {
         if (ciu == null) {
        return new ArrayList<>(); 
    }
        List<Alojamiento> listaAlo = new ArrayList<>();
        String sql = "select * from alojamiento where estado = 1 and idciuDestino=? ORDER BY fechaIngreso";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,ciu.getIdCiudad());
            rs = ps.executeQuery();
            while (rs.next()) {
                Alojamiento alo = new Alojamiento();
                String tipoAlojamientoStr=rs.getString("tipoAlojamiento");
                TipoAlojamiento tipoAlo= TipoAlojamiento.valueOf(tipoAlojamientoStr);
                String tipoServicioStr = rs.getString("Servicio");
                Servicio tipoServicio = Servicio.valueOf(tipoServicioStr);
                alo.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alo.setCiuDestino(ciu);
                alo.setFechaIngreso(rs.getDate("fechaIngreso").toLocalDate());
                alo.setFechaSalida(rs.getDate("fechaSalida").toLocalDate());
                alo.setAlojamiento(tipoAlo);
                alo.setServicio(tipoServicio);
                alo.setImporteDiario(rs.getDouble("importeDiario"));
                alo.setEstado(rs.getBoolean("estado"));

                listaAlo.add(alo);
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceso de datos Alojamiento" + e.getMessage());
        }
        return listaAlo;
    }
    
}
