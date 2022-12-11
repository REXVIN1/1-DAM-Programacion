/*
 */
package ejercicio07;
import java.util.Scanner;

/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Partiendo de una cadena, intercambiar cada par de caracteres adyacentes. Un carácter sólo puede intercambiarse como máximo una vez.\n");
        System.out.println("Introduzca una cadena:");
        String cadena = new Scanner(System.in).nextLine();
        int i = 0, f = 2; 
        String extraccion;
        StringBuilder extraccion2;
        StringBuilder cadena2;
        while(f<cadena.length()){ 
            extraccion = cadena.substring(i, f);
            extraccion2 = new StringBuilder(extraccion);
            extraccion = extraccion2.reverse().toString();
            cadena2 = new StringBuilder(cadena);
            cadena = cadena2.replace(i, f, extraccion).toString();
            i+=2;
            f+=2;
        }
        System.out.println("\nCadena: "+cadena);
    }
    
}
