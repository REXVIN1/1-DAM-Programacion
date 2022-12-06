
package prueba;
import java.util.Scanner;

/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 16 : Haz un programa que pregunte al usuario por teclado dos frases. El programa\n" +
"deberá mostrar por pantalla si la segunda frase está incluida dentro de la primera frase."+"\n");
        
        System.out.println("Escriba una frase:");
        String frase1 = new Scanner(System.in).nextLine();
        frase1 = frase1.toLowerCase();
        
        System.out.println("Escriba otra frase:");
        String frase2 = new Scanner(System.in).nextLine();
        frase2 = frase2.toLowerCase();
        
        boolean incluida = frase1.contains(frase2);
        
        if(incluida==true){
            System.out.println("\nLa segunda frase esta incluida en la primera frase");
        }else{
            System.out.println("\nLa segunda frase no esta incluida en la primera frase");
        }
    }
    
}
