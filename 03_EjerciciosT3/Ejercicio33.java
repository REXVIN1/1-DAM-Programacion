
package ejercicio33;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio33 {

    public static void main(String[] args) {
        String frase;
        
        System.out.println("Escriba una frase:");
        frase = new Scanner(System.in).nextLine();
        
        for(int i=0;i<frase.length();i++){
            System.out.println(frase.charAt(i));
        }
    }
}
