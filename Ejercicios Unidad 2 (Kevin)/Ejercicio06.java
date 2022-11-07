/*
 */
package ejercicio06;
import bpc.daw.mario.*;
import java.util.*;
/**
 *
 * @author Kevin Gómez <kgomval118@g.educaand.es>
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 6 : Crea un programa que pida por teclado dos coordenadas y cree un muñeco de\n" +
"Mario en ellas."+"\n");
        
        System.out.println("Eliga coordenada X e Y respectivamente:");
        int c1 = new Scanner(System.in).nextInt();
        int c2 = new Scanner(System.in).nextInt();
        
        System.out.println("\n"+"Eliga coordenada X e Y respectivamente:");
        int c3 = new Scanner(System.in).nextInt();
        int c4 = new Scanner(System.in).nextInt();
        
        Mario m1 = new Mario(c1,c2);
        Mario m2 = new Mario(c3,c4);      
    }
    
}
