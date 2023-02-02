/*
 */
package ejercicio10;
import bpc.daw.objetos.Caja;
/**
 *
 * @author Kevin Gómez <kgomval118@g.educaand.es>
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 10 : Haz otro programa que cree una caja con un mensaje cualquiera. Abrir la caja,\n" +
"consultar el mensaje y mostrarlo por pantalla. Sustituir el mensaje por otro. Volver a\n" +
"consultarlo y mostrar el resultado."+"\n");
        
        Caja c = new Caja("HOLA MUNDO");
        
        c.abrirCaja();
        
        System.out.println("Mensaje: "+c.getMensaje());
        
        c.cambiarMensaje("ADIOS MUNDO");
        
        System.out.println("Mensaje: "+c.getMensaje());                
    }
    
}
