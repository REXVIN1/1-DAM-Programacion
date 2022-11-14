/*
 */
package ejercicio24;
import java.io.*;
import java.util.*;
/**
 *
 * @author Kevin Gómez <kgomval118@g.educaand.es>
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 24 : Consulta el pdf de la librería “java io” y busca la clase PrintWriter. Realiza un\n" +
"programa que pregunte por teclado al usuario dos frases. El ordenador creará un archivo\n" +
"llamado “d:/frases.txt” (asegúrate de tener permisos de escritura, si no, pon otra carpeta) y\n" +
"escribirá las dos frases en él.\n");
        
        System.out.println("Escriba 2 frases: ");
        String frase1 = new Scanner(System.in).nextLine();
        String frase2 = new Scanner(System.in).nextLine();            
        
            try{
                PrintWriter writer = new PrintWriter("C:\\Users\\usuario-mañana\\Desktop\\nuevo\\frases.txt");
                writer.println(frase1);
                writer.println(frase2); 
                writer.close();
            }catch(Exception existe_archivo){
                System.out.println("\nNo tienes permiso");                   
            }                        
    }
    
}
