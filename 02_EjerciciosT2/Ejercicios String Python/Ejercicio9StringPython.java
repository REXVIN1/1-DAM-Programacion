/*
 */
package ejercicio9.string.python;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio9StringPython {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Se deben leer dos cadenas y comprobar si una cadena es anagrama( tienen las mismas letras pero en distinto nombre) de la otra.\n");
        
        System.out.println("Escriba 2 frases:");
        String f1 = new Scanner(System.in).nextLine();
        String f2 = new Scanner(System.in).nextLine();        
        
        char[] o1 = f1.toCharArray();
        Arrays.sort(o1);
        String cadena1 = new String(o1);
        System.out.println("\nCadena1 ordenada: "+cadena1);
        
        char[] o2 = f2.toCharArray();
        Arrays.sort(o2);
        String cadena2 = new String(o2);
        System.out.println("Cadena2 ordenada: "+cadena2);
        
        if (cadena1.equals(cadena2)) System.out.println("\nSon anagramas");
        else System.out.println("\nNo son anagramas");
        
    }
    
}
