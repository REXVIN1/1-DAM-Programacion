/*
 */
package ejercicio25;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author Kevin Gómez <kgomval118@g.educaand.es>
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 25 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase Scanner. Realiza\n" +
"un programa que abra el archivo “d:/frase.txt” que has creado en el ejercicio anterior y nos\n" +
"muestre por pantalla las dos frases que hay guardadas en él.\n");
        
        File f = new File("C:/Users/kevin/Desktop/frases.txt");
        try{
           Scanner escaner = new Scanner(f);
           System.out.println("Frase 1: "+escaner.nextLine());
           System.out.println("Frase 2: "+escaner.nextLine()); 
        }catch(IOException e){
            System.out.println("\nError: "+e.getMessage());
        }                  
    }    
}
