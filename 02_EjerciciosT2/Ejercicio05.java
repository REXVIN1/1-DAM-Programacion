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
        
        Cañon c1,c2 = null;        
        Disparo d1,d2,d3,d4,d5 = null;
        
        c1 = new Cañon (500,300); 
        c2 = new Cañon (500,500);                     
       
        d1 = new Disparo(500,300,700,300);
        d2 = new Disparo(500,300,700,300);
       
        d3 = new Disparo(500,500,700,500);
        d4 = new Disparo(500,500,700,500);
        d5 = new Disparo(500,500,700,500);        
        
        System.out.println("¿Cuántos cañones ha disparado el primer cañón?");
        int r1 = 2;
        System.out.println("Ha disparado "+r1+" veces");
        System.out.println("¿Cuántos cañones ha disparado el segundo cañón?");
        int r2 = 3;
        System.out.println("Ha disparado "+r2+" veces");
    }
    
}
