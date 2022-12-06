/*
 */
package ejercicio09;
import bpc.daw.objetos.Caja;
/**
 *
 * @author Kevin Gómez <kgomval118@g.educaand.es>
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 9 : En la librería ObjetosSencillos.jar se encuentra la clase Caja. Haz un programa que\n" +
"cree una caja que contenga el mensaje “Bienvenidos al instituto”. Consultar el mensaje con la\n" +
"caja cerrada y mostrar el resultado. Abrir la caja y consultar el mensaje. Mostrar el resultado."+"\n");
        
        Caja c = new Caja("Bienvenidos al instituto");
        
        c.cerrarCaja();        
       
        System.out.println("Mensaje cerrado: "+c.getMensaje());
        
        c.abrirCaja();
        
        System.out.println("Mensaje abierto: "+c.getMensaje());
    }
    
}
