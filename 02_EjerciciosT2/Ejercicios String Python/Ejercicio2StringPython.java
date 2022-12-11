 /*
 */
package ejercicio2.string.python;
import java.util.Scanner;

/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio2StringPython {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Escriba un texto (50 caracteres máximo):");
        String cadena = new Scanner(System.in).nextLine();
        
        while(cadena.length()>50){
            System.out.println("Se ha pasado de caracteres");
            System.out.println("\nEscriba un texto (50 caracteres máximo):");
            cadena = new Scanner(System.in).nextLine();
        }
        System.out.println("Cadena normal: "+cadena);
        
        cadena = cadena.replaceAll("\\s+", "");
        
        System.out.println("Cadena sin espacios: "+cadena);
        }                        
        
    }
    
}
