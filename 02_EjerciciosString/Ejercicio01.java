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
        
        String cadena = "       hola        "; 
        
        System.out.println("\nCadena normal: "+cadena);
        System.out.println("Cadena length inicial: "+cadena.length());
                
        String cadena2 = cadena.substring(0, cadena.lastIndexOf(" "));
        String cadena2_1 = cadena2;
        
        
        System.out.println("\nCadena sin espacios adelante:"+cadena2_1.trim());
        System.out.println("Cadena length después: "+cadena2_1.length());
    }
    
}
