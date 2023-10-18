package paqueteturisco17;

import Datos.AlojamientoDatos;
import Datos.CiudadDatos;
import Datos.ClientesDatos;
import Datos.PaqueteDatos;
import Datos.PasajeDatos;
import Entidades.Alojamiento;
import Entidades.Ciudad;
import Entidades.Cliente;
import Entidades.Paquete;
import Entidades.Pasaje;
import Entidades.Servicio;
import Entidades.Transporte;
import Vistas.Menu;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Juan
 */
public class Main {
    public static void main(String[] args) {
//        Ciudad ciudad = new Ciudad("Bahía Blanca","Buenos Aires",true,"Argentina");
//        Pasaje pasaje = new Pasaje(20,Transporte.TREN,5422.88,ciudad,true);
//        
//        PasajeDatos.modificarPasaje(pasaje);
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu().setVisible(true);
//            }
//        });
         Paquete paquete1 = PaqueteDatos.buscarPaquetePorId(1);
         Cliente cliente = new Cliente(1,"Hernan", "Coleman", 4589632, 487956, paquete1);
//         ClientesDatos.guardarCliente(cliente);
//         System.out.println(ClientesDatos.buscarClientes(1));
//         ClientesDatos.modificarclientes(cliente);
//         System.out.println(ClientesDatos.listaclientes());
         ClientesDatos.eliminarCliente(1);
    }
    
    
}
