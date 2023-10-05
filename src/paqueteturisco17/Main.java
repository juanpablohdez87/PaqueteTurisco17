package paqueteturisco17;

import Datos.AlojamientoDatos;
import Datos.CiudadDatos;
import Datos.PaqueteDatos;
import Datos.PasajeDatos;
import Entidades.Alojamiento;
import Entidades.Ciudad;
import Entidades.Paquete;
import Entidades.Pasaje;
import Entidades.Transporte;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Juan
 */
public class Main {

    public static void main(String[] args) {
//        ****************************CIUDAD***********************************
          Ciudad ciudad = new Ciudad("Bahía Blanca","Argentina",true,"Buenos Aires");
          Ciudad ciudad1 = new Ciudad("Bariloche","Argentina",true,"Río Negro");
          Ciudad ciudad2 = new Ciudad("San Miguel de Tucumán","Argentina",true,"Tucumán");
          Ciudad ciudad3 = new Ciudad("Maquinista Savio","Argentina",true,"Buenos Aires");
          Ciudad ciudad4 = new Ciudad("Patagones","Argentina",true,"Buenos Aires");
          Ciudad ciudad5 = new Ciudad("Ushuaia","Argentina",true,"Tierra del Fuego");
          Ciudad ciudad6 = new Ciudad("Teheran","Irán",true,"Teheran");
          Ciudad ciudad7 = new Ciudad("Estambul","Turquía",true,"Estambul");
          Ciudad ciudad8 = new Ciudad("Beirut","Líbano",true,"Beirut");
          Ciudad ciudad9 = new Ciudad("Ciudad de México","México",true,"Ciudad de México");
          Ciudad ciudad10 = new Ciudad("Nueva Delhi","India/Bahrat",true,"Delhi");
//          CiudadDatos.ciudadGuardar(ciudad10);
//        System.out.println(CiudadDatos.buscarCiudadPorId(19));
//        Ciudad c = new Ciudad("General Belgrano", "Republica de Cordoba", true, "Cordoba de Anda Lucia");
//        Ciudad ab = new Ciudad(2, "Guiñazu", "Republica de Cordoba", true, "Cordoba de Anda Lucia");
//        CiudadDatos.ciudadGuardar(ciudad1);
//        CiudadDatos.ciudadGuardar(ciudad2);
//        CiudadDatos.ciudadGuardar(ab);

//        System.out.println(CiudadDatos.buscarCiudadPorId(8));
//        Ciudad m = CiudadDatos.buscarCiudad("General Belgrano");
//        System.out.println("id = " + m.getIdCiudad());

//        CiudadDatos.modificarCiudad(ab);
//        List<Ciudad> lista = CiudadDatos.listarCiu();

//         ****************************PASAJE************************************
        Pasaje pasaje = new Pasaje(11,Transporte.TREN,5422.66 , ciudad, true);
        Pasaje pasaje1 = new Pasaje(Transporte.AVIÓN,122589.77 , ciudad, true);
        Pasaje pasaje2 = new Pasaje(Transporte.TREN,20589.45,ciudad1, true);
        Pasaje pasaje3 = new Pasaje(Transporte.COLECTIVO,7548.22 , ciudad2, true);
        Pasaje pasaje4 = new Pasaje(Transporte.COLECTIVO,6250, ciudad3, true);
        Pasaje pasaje5 = new Pasaje(Transporte.AVIÓN,322789.78 , ciudad5, true);
        Pasaje pasaje6 = new Pasaje(Transporte.AVIÓN,692887.12,ciudad9,true);
        Pasaje pasaje7 = new Pasaje(18,Transporte.TREN,28974.19, ciudad3, true);
        //Para guardar el pasaje se agrega la variable del objeto creado y el nombre de la ciudad
//        PasajeDatos.guardarPasaje(pasaje, "Bahía Blanca");
//        PasajeDatos.guardarPasaje(pasaje1, "Bahía Blanca");
//        PasajeDatos.guardarPasaje(pasaje2, "Bariloche");
//        PasajeDatos.guardarPasaje(pasaje3, "San Miguel de Tucumán");
//        PasajeDatos.guardarPasaje(pasaje4, "Maquinista Savio");
//        PasajeDatos.guardarPasaje(pasaje5, "Ushuaia");
//        PasajeDatos.guardarPasaje(pasaje6, "Ciudad de México");
//        PasajeDatos.guardarPasaje(pasaje7, "Maquinista Savio");
        
//Para modificar el pasaje se debe agregar la variable del objeto creado y el id de la ciudad. Antes se debe agregar el idPasaje en la varible donde se construyo el objeto
//        PasajeDatos.modificarPasaje(pasaje7,12);
//          System.out.println(PasajeDatos.buscarPasaje(13));

//        PasajeDatos.listaPas();
//        PasajeDatos.eliminarPasaje(18);


    
//        *******************************************************************************************************************
    
    Alojamiento alo1 = new Alojamiento(CiudadDatos.buscarCiudad("San Miguel de Tucumán"), LocalDate.of(2023, 5, 20), LocalDate.of(2023, 8, 15), "Completo", 203555.58, true);
//    AlojamientoDatos.alojamientoGuardar(alo1);
////    ***********************************************************************************************************************
//    
    Paquete paq1 = new Paquete(CiudadDatos.buscarCiudad("Bariloche"), CiudadDatos.buscarCiudad("San Miguel de Tucumán"), AlojamientoDatos.buscarAlojamiento(5), PasajeDatos.buscarPasaje(3));
    PaqueteDatos.guardarPaquete(paq1);
    
    }

}