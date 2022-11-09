/*
 */
package ejercicio1.strings.python;
import java.util.*;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio1StringsPython {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Consiste en eliminar los espacios en blanco iniciales en una cadena. Por ejemplo, la cadena ' Python rocks!' quedaría 'Python rocks!'"+"\n");
        
        System.out.println("Escriba texto:");
        String cadena = new Scanner(System.in).nextLine();
        
        System.out.println("\n"+"Cadena normal: "+cadena);
        System.out.println("Cadena trim: "+cadena.trim()); 
        System.out.println("Número de caracteres: "+cadena.trim().length());
    }
    
}
