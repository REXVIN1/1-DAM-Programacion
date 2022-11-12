/*
 */
package ejercicio02;
import java.util.Scanner;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Se leen 50 caracteres y se eliminan todos los separadores. Se consideran separadores espacios en blanco, tabuladores y retorno.\n");
        
        System.out.println("Escriba un texto de (50 caracteres como maximo):");
        
        String cadena = new Scanner(System.in).nextLine();
        
        if(cadena.length()>50){
            System.out.println("Te pasaste de caracteres");
        }else{
            System.out.println("\nCadena normal: "+cadena);
        
            cadena = cadena.replaceAll("\\s+", "");        
            System.out.println("Cadena sin espacios: "+cadena);
        }
        
    }
    
}
