/*
 */
package ejercicio05;
import java.util.Scanner;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Se trata de averiguar si una cadena es un palíndromo o no. Un ejemplo de palíndromo: 'Dabale arroz a la zorra el abad'."+"\n");
        
        System.out.println("Escriba un ejemplo de palíndromo: ");
        String palindromo = new Scanner(System.in).nextLine();        
        
        System.out.println("¿La palabra o frase '"+palindromo+"' es palindromo?: "+esPalindromo(palindromo));
    }   
    
    public static boolean esPalindromo(String palindromo){
        palindromo = palindromo.toLowerCase();
        
        for(int i = 0, j = palindromo.length() - 1; i <= j; i++, j-- ){
            if (palindromo.charAt(i) != palindromo.charAt(j)){
                return false;
            }
        }
        return true;
    }
    
}
