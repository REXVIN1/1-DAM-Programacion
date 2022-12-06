/*
 */
package ejercicio05;
import bpc.daw.mario.*;
/**
 *
 * @author Kevin Gómez <kgomval118@g.educaand.es>
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 5 : Realiza un programa con la librería de Mario Bros en el que haya dos cañones. Haz\n" +
"que el primero dispare dos veces y el segundo tres. Pregunta a los dos cañones cuántas veces\n" +
"han disparado y muestra dichos valores por pantalla."+"\n");
        
        Cañon c1 = new Cañon(500,200);
        Cañon c2 = new Cañon(500,500);
        
        try {
            c1.disparar(1000, 200);
            c2.disparar(1000, 500);
            Thread.sleep(5000);
            c1.disparar(1000, 200);
            c2.disparar(1000, 500);
            Thread.sleep(5000);
            c2.disparar(1000, 500);
            System.out.println("Disparos del cañon 1: "+c1.getTotalDisparosRealizados());
            System.out.println("Disparos del cañon 2: "+c2.getTotalDisparosRealizados());
        } catch (InterruptedException ex) {
            System.out.println("Erro: "+ex.getMessage());
        }
    }
    
}
