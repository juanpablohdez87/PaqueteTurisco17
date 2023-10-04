package paqueteturisco17;

import Datos.CiudadDatos;
import Entidades.Ciudad;
import java.util.List;

/**
 *
 * @author Juan
 */
public class Main {

    public static void main(String[] args) {
//        Ciudad c = new Ciudad("General Belgrano", "Republica de Cordoba", true, "Cordoba de Anda Lucia");
//        Ciudad ab = new Ciudad(2, "Guiñazu", "Republica de Cordoba", true, "Cordoba de Anda Lucia");
        Ciudad m = CiudadDatos.buscarCiudad("General Belgrano");
        System.out.println("id = " + m.getIdCiudad());
//        CiudadDatos.modificarCiudad(ab);
//         List<Ciudad> lista = CiudadDatos.listarCiu();
//        CiudadDatos.ciudadGuardar(ab);
    }

}
