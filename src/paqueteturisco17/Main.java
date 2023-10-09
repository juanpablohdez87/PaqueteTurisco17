package paqueteturisco17;

import Datos.AlojamientoDatos;
import Datos.CiudadDatos;
import Datos.PaqueteDatos;
import Datos.PasajeDatos;
import Entidades.Alojamiento;
import Entidades.Ciudad;
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
}
