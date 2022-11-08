/*
 */
package ejercicio17;
import java.util.*;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 16 : Haz un programa que pregunte al usuario por teclado dos frases. El programa\n" +
"deberá mostrar por pantalla si la segunda frase está incluida dentro de la primera frase."+"\n");
        
        System.out.println("Introduzca el texto 1:");
        String frase1 = new Scanner(System.in).nextLine();
        
        System.out.println("Introduzca el texto 1:");
        String frase2 = new Scanner(System.in).nextLine();               
        
        int index = frase1.indexOf(frase2);
        boolean resultado = true;
        
        if(index>=0){
            System.out.println("\n"+"Si coincide");
            resultado = true;
        }else{
            System.out.println("\n"+"No coincide");
            resultado = false;
        }  
        
        System.out.println("\n"+"¿El texto 2 está incluido en el texto 1? "+resultado);
    }
    
}
