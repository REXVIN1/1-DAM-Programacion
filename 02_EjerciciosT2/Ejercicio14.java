/*
 */
package ejercicio14;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 14 : Consulta la documentación de la clase String para hacer un programa que\n" +
"pregunte una frase al usuario y se muestre la letra que hay justo en la mitad de la frase."+"\n");
        
        
        System.out.println("Escriba una frase:");
        String frase = new Scanner(System.in).nextLine();        
        
        char letra = frase.charAt(frase.length()/2);
        
        System.out.println("\n "+"Letra central: "+letra);
    }
    
}
