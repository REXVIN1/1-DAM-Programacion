/*
 */
package ejercicio14;
import java.util.Scanner;
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
   
        boolean b = true;
        while(b==true){
            System.out.println("\n----------------------------------------------------------");
            System.out.println("Introduzca una frase:");
            String frase = new Scanner(System.in).nextLine();
            int longitud = frase.length();
            int mitad = longitud/2;
            if(longitud%2 == 0){
                System.out.println("\nAl ser par no consta de una letra en mitad de la frase.");
                int letra1 = mitad;
                int letra2 = mitad+1;
                System.out.println("En todo caso serian dos: '"+frase.charAt(letra1)+"' y '"+frase.charAt(letra2)+"'."); 
                System.out.println("----------------------------------------------------------");
            }else{
                System.out.println("\nLa letra del medio es: "+frase.charAt(mitad++));
                System.out.println("----------------------------------------------------------");
            }
        } 
    }
    
}
