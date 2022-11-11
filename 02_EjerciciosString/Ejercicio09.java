/*
 */
package ejercicio9.string.python;
import java.util.*;
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
        
           System.out.println("Introduzca cadena1:");
           String cadena1 = new Scanner(System.in).nextLine();
           System.out.println("Introduzca cadena2:");
           String cadena2 = new Scanner(System.in).nextLine();
           
           char[] cadena_array1 = cadena1.toCharArray();
           Arrays.sort(cadena_array1);
           String cadena1_ordenada = new String(cadena_array1);
           System.out.println("\nCadena1 ordenada: "+cadena1_ordenada);
           
           char[] cadena_array2 = cadena2.toCharArray();
           Arrays.sort(cadena_array2);
           String cadena2_ordenada = new String(cadena_array2);
           System.out.println("Cadena2 ordenada: "+cadena2_ordenada);
           
           if(cadena1_ordenada==cadena2_ordenada){
               System.out.println("\nSon anagramas");
           }else{
               System.out.println("\nNo son anagramas");
           }
        
    }
    
}
