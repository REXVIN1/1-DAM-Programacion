/*
 */
package ejercicio25;
import java.util.*;
import java.io.*;
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
        
        File archivo = new File("C:\\Users\\usuario-mañana\\Desktop\\nuevo\\frases.txt");
        try{
            Scanner escaner = new Scanner(archivo);
            System.out.println("Linea 1: "+escaner.nextLine()+"\n"+"Linea 2: "+escaner.nextLine());                        
        }catch(Exception error){
            System.out.println("\nError: "+error.getMessage());  
        }                    
    }    
}
