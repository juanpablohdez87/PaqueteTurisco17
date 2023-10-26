package Datos;

import Entidades.Cliente;
import Entidades.Paquete;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClientesDatos {

    private static Connection con = Conexion1.getConexion();
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    public static void guardarCliente(Cliente client) {

        String sql = "insert into cliente(dni, nombre, apellido, telefono,idPaquete, cantPersonas, importeTotal, abonado) value (?, ?, ?, ?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, client.getDni());
            ps.setString(2, client.getNombre());
            ps.setString(3, client.getApellido());
            ps.setInt(4, client.getTelefono());
            ps.setInt(5, client.getPaquete().getIdPaquete());
            ps.setInt(6, client.getCantPersonas());
            ps.setDouble(7, client.getImporteTotal());
            ps.setBoolean(8, client.isAbonado());

            ps.executeUpdate();
            rs = ps.getGeneratedKeys();

            if (rs.next()) {
                client.setIdCliente(rs.getInt(1));
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

    public static void modificarclientes(Cliente cliente) {

        String sql = "update cliente set dni=?,nombre=?,apellido=?,telefono=?,idPaquete=? , cantPersonas=?, importeTotal=?, abonado=? where idcliente = ?";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setInt(4, cliente.getTelefono());
            ps.setInt(5, cliente.getPaquete().getIdPaquete());
            ps.setInt(6, cliente.getCantPersonas());
            ps.setDouble(7, cliente.getImporteTotal());
            ps.setBoolean(8, cliente.isAbonado());
            ps.setInt(9, cliente.getIdCliente());

            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Cliente modificado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceso de datos de clientes" + e.getMessage());
        }

    }

    public static Cliente buscarClientes(int id) {

        String sql = "select * from Cliente where idCliente = ?";
        Cliente cliente = new Cliente();

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                cliente.setIdCliente(id);
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setTelefono(rs.getInt("telefono"));
                Paquete paquete = PaqueteDatos.buscarPaquetePorId(rs.getInt("idPaquete"));
                cliente.setPaquete(paquete);
                cliente.setCantPersonas(rs.getInt("cantPersonas"));
                cliente.setImporteTotal(rs.getDouble("importeTotal"));
                cliente.setAbonado(rs.getBoolean("abonado"));
            } else {
                JOptionPane.showMessageDialog(null, "El cliente no existe");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceso de la tabla de datos de clientes" + e.getMessage());
        }
        return cliente;

    }

    public static List<Cliente> listaclientes() {
        List<Cliente> listaclient = new ArrayList<>();
        String sql = "select * from cliente where abonado = 1 ORDER BY nombre";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente client = new Cliente();
                client.setIdCliente(rs.getInt("idCliente"));
                client.setNombre(rs.getString("nombre"));
                client.setApellido(rs.getString("apellido"));
                client.setDni(rs.getInt("dni"));
                client.setTelefono(rs.getInt("telefono"));
                Paquete paquete = PaqueteDatos.buscarPaquetePorId(rs.getInt("idPaquete"));
                client.setPaquete(paquete);
                client.setCantPersonas(rs.getInt("cantPersonas"));
                client.setImporteTotal(rs.getDouble("importeTotal"));
                client.setAbonado(rs.getBoolean("abonado"));
                listaclient.add(client);
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceso de datos de cliente" + e.getMessage());
        }
        return listaclient;
    }
    
    public static List<Cliente> listaclientesNoAbonados() {
        List<Cliente> listaclient = new ArrayList<>();
        String sql = "select * from cliente where abonado = 0 ORDER BY nombre";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente client = new Cliente();
                client.setIdCliente(rs.getInt("idCliente"));
                client.setNombre(rs.getString("nombre"));
                client.setApellido(rs.getString("apellido"));
                client.setDni(rs.getInt("dni"));
                client.setTelefono(rs.getInt("telefono"));
                Paquete paquete = PaqueteDatos.buscarPaquetePorId(rs.getInt("idPaquete"));
                client.setPaquete(paquete);
                client.setCantPersonas(rs.getInt("cantPersonas"));
                client.setImporteTotal(rs.getDouble("importeTotal"));
                client.setAbonado(rs.getBoolean("abonado"));
                listaclient.add(client);
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceso de datos de cliente" + e.getMessage());
        }
        return listaclient;
    }

    public static void eliminarCliente(int idCliente) {
        String eliminarSqul = "Delete from Cliente where idCliente=?";
        try {
            ps = con.prepareStatement(eliminarSqul);
            ps.setInt(1, idCliente);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Cliente Eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos de Cliente");
        }
    }
}
