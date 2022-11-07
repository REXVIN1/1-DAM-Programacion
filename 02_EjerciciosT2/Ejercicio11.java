/*
 */
package ejercicio11;
import bpc.daw.objetos.*;
/**
 *
 * @author Kevin Gómez <kgomval118@g.educaand.es>
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 11 : Haz otro programa que cree dos cajas, cada una con un mensaje diferente. Hacer\n" +
"un programa que intercambie los mensajes de las dos cajas."+"\n");
        
        Caja c1 = new Caja("HOLA MUNDO");
        Caja c2 = new Caja("ADIOS MUNDO");
        
        c1.abrirCaja();
        c2.abrirCaja();
        
        System.out.println("Mensaje caja 1: "+c1.getMensaje());
        System.out.println("Mensaje caja 2: "+c2.getMensaje());
        
        c1.cerrarCaja();
        c2.cerrarCaja();
        
        c1.cambiarMensaje(c2.getMensaje());
        c2.cambiarMensaje(c1.getMensaje());
        
        c1.abrirCaja();
        c2.abrirCaja();
        
        System.out.println("Mensaje caja 1: "+c1.getMensaje());
        System.out.println("Mensaje caja 2: "+c2.getMensaje());
        
        c1.cerrarCaja();
        c2.cerrarCaja();
    }
    
}
