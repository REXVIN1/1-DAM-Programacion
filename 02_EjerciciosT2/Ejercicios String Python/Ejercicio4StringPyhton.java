/*
 */
package ejercicio4.string.pyhton;
import java.util.*;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio4StringPyhton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Codificador de cadenas: el resultado será una cadena que se ha obtenido cambiando cada carácter por el carácter cuyo código ASCII es n unidades mayor."+"\n");  
        
        System.out.println("Escriba un numero del 1 al 255:");
        int caracteres = new Scanner(System.in).nextInt();   
        
        if(caracteres>=1&&caracteres<=255){
            char caracteres2 = (char)caracteres;
            System.out.println("\n"+caracteres2);
        }else{
            System.out.println("Por favor, eliga un numero entre 1 y 255");
        }
        
    }
    
}
