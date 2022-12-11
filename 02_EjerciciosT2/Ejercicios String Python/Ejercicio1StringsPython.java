/*
 */
package ejercicio1.strings.python;
import java.util.Scanner;
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
        
        //Extracción únicamente del inicio
        System.out.println("Escriba texto:");
        String cadena = new Scanner(System.in).nextLine();
        
        int i = 0;
        while(cadena.charAt(i)==' '){
            i++;
        }       
        char letra = cadena.charAt(i);
        int posicion = cadena.indexOf(letra);
        
        System.out.println("Extracción: ("+cadena.substring(posicion)+")");
    }
    
}
