
package ejercicio37;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio37 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 37 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase Integer, que está\n" +
"en la hoja de “clases envoltorio”. Haz un programa que pregunte al usuario por teclado un\n" +
"número. El programa mostrará ese número escrito en binario y hexadecimal.\n");
        
        System.out.println("Escriba un número:");
        int n = new Scanner(System.in).nextInt();
        System.out.println("\nNúmero en binario: "+Integer.toBinaryString(n));
        System.out.println("Número en hexadecimal: "+Integer.toHexString(n));
    }

}
