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
import Entidades.TipoAlojamiento;
import Entidades.Transporte;
import Vistas.Menu;
import java.sql.Date;
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
//        Paquete paquete1 = PaqueteDatos.buscarPaquetePorId(9);
//        Cliente cliente = new Cliente(5,"Martin", "Coleman", 4589632, 487956, paquete1,2, 4856.32,false);
//         ClientesDatos.guardarCliente(cliente);
//         System.out.println(ClientesDatos.buscarClientes(5));
//        ClientesDatos.modificarclientes(cliente);
//        System.out.println(ClientesDatos.listaclientes());
//        ClientesDatos.eliminarCliente(5);
//for(Paquete paq:PaqueteDatos.listarPaquete()){
//    System.out.println(paq);
//}
//for(Paquete paq:PaqueteDatos.busquedaPaquetexPais("Argentina")){
//    System.out.println(paq);
//}
//
//for(Paquete paq:PaqueteDatos.busquedaPaquetexFecha(Date.valueOf("2023-10-05"),Date.valueOf("2023-10-15"))){
//    System.out.println(paq);
//}

    }
    
    
}
