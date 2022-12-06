/*
 */
package ejercicio13;
import java.util.Scanner;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ejercicio 13 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase String. Haz un\n" +
"programa que pregunte tu nombre por teclado, y el ordenador lo muestre en mayúsculas,\n" +
"minúsculas y diga cuántos caracteres tiene."+"\n");
        
        System.out.println("Escribe tu nombre:");
        String nombre = new Scanner(System.in).nextLine();        
        System.out.println("Tu nombre en mayúsculas: "+nombre.toUpperCase());
        System.out.println("Tu nombre en minúsculas: "+nombre.toLowerCase());
        System.out.println("Total de caracteres de tu nombre: "+nombre.length());
    }
    
}
