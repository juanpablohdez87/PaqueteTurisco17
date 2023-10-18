package Datos;

import Entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author lucia
 */
public class ClientesDatos {
    
    private static Connection con = Conexion1.getConexion();
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

//    public static void clientesbuscar(Cliente client) {
//
//        String sql = "insert into clientes(idbuscar, modificar, guardar, estado) value (?, ?, ?, ?)";
//
//        try {
//            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setInt(1, client.getclientes().getIdclientes());
//            ps.setDate(2, Date.valueOf(ciu.getbuscar()));
//            ps.setDate(3, Date.valueOf(ciu.getmodificar()));
//            ps.setString(4, client.getguardar().name());
//            ps.setBoolean(6, alo.isEstado());
//
//            ps.executeUpdate();
//            rs = ps.getGeneratedKeys();
//
//            if (rs.next()) {
//                alo.setIdclientes(rs.getInt(1));
//                System.out.println("ID generado");
//            } else {
//                System.out.println("Error: ID");
//            }
//            ps.close();
//            JOptionPane.showMessageDialog(null, ">>> Guardado <<<");
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error al insertar " + e.getMessage());
//        }
//    }
//
//    public static void modificarclientes(int id) {
//
//        String sql = "update clientes set estado = 0 where idclientes = ?";
//
//        try {
//
//            ps = con.prepareStatement(sql);
//            ps.setInt(1, id);
//            int fila = ps.executeUpdate();
//            if (fila == 1) {
//                JOptionPane.showMessageDialog(null, "clientes modificados");
//            } else {
//                JOptionPane.showMessageDialog(null, "clientes modificados con anterioridad");
//            }
//            ps.close();
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error al acceso de datos de clientes" + e.getMessage());
//        }
//
//    }
//
//    public static void guardar clientes(clientes client) {
//        
//        String sql = "update clientes set idguardar = ?, nombre = ?, apellido = ?, dni = ?, telefono = ? where idcliente = ?";
//
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setInt(1, client.getclientes().getIdclientes());
//            ps.setDate(2, Date.valueOf(client.getnombre()));
//            ps.setDate(3, Date.valueOf(client.getapellido()));
//            ps.setString(4,client.getdni().name());
//            ps.setDouble(5,client.gettelefono());
//            ps.setInt(6, client.getIdclientes());
//            
//            int exito = ps.executeUpdate();
//            if (exito == 1) {
//                JOptionPane.showMessageDialog(null, "Datos clientes Modificados");
//            } else {
//                JOptionPane.showMessageDialog(null, "Error: Carga de datos clientes inexistente");
//            }
//            ps.close();            
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceso de datos clientes" + ex.getMessage());
//        }
//
//    }
//
//    public static clientes buscarclientes(int id) {
//        
//        String sql ="select idclientes, nombre , apellido , dni ,telefono  from clientes where idclientes = ? and estado= 1";
//        clientes client = new clientes();
//        
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setInt(1, id);
//            rs = ps.executeQuery();
//            if (rs.next()) {
//                clientes cliente = clientesDatos.buscarclientesPorId(rs.getInt("idclientes"));
//                String tiponombreStr = rs.getString("nombre");
//                 
//                client.setIdclientes(id);
//                client.setnombre(nombre);
//                client.setapellido(rs.getDate("apellido").toLocalDate());
//                client.setdni(rs.getDate("dni").toLocalDate();
//                client.setEstado(true);
//
//            } else {
//                JOptionPane.showMessageDialog(null, "cliente no esta activo o no existe");
//            }
//            ps.close();
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error al acceso de datos de clientes"+e.getMessage());
//        }
//        return alo;
//        
//
//    }
//
//    public static List<clientes> listaclientes() {
//        List<clientes> listaclient = new ArrayList<>();
//        String sql = "select * from clientes";
//
//        try {
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                clientes client = new clientes();
//                clientes client = clientesDatos.buscarclientePorId(rs.getInt("idclientes"));
//                String tipodniStr = rs.getString("dni");
//               
//                
//                client.setIdclientes(rs.getInt("idclientes"));
//                client.setcleintes(cliente);
//                client.setnombre(nombre);
//                client.setapellido(rs.getDouble("apellido");
//                client.setEstado(rs.getBoolean("cliente"));
//
//                listaAlo.add(client);
//            }
//            ps.close();
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error al acceso de datos de cliente" + e.getMessage());
//        }
//        return listaAlo;
//    }
//    public static List<cliente> listaclientesxCiudadActiva() {
//        List<cliente> listaclient = new ArrayList<>();
//        String sql = "select * from clientes where estado = 1";
//
//        try {
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                clientes client= new clientes();
//                clientes cliente = clienteDatos.buscarclientePorId(rs.getInt("idcliente"));
//                String tipoServicioStr = rs.getString("nombre");
//                Servicio tiponombre = nombre.valueOf(tiponombreStr);
//                
//                client.setIdclientes(rs.getInt("idclientes"));
//                client.setnombre(nombre);
//                client.setapellido(apellido);
//                client.setdni(rs.getDouble("dni"));
//               client.setEstado(rs.getBoolean("estado"));
//
//                listaAlo.add(client);
//            }
//            ps.close();
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error al acceso de datos de clientes" + e.getMessage());
//        }
//        return listaAlo;
//    }
}
