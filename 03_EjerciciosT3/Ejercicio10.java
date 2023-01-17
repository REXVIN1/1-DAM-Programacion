
package ejercicio10;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio10 {
    
    public static void main(String[] args) {
        String ruta,linea;
        FileInputStream fis;
        InputStreamReader ipr;
        BufferedReader br;
        
        System.out.println("Escriba una ruta:");
        //"C:/Users/kevin/OneDrive/Documents/NetBeansProjects/Unidad 3/Ejercicio10/src/ejercicio10/documento.txt"
        ruta = new Scanner(System.in).nextLine();
        try {
            fis = new FileInputStream(ruta);
            ipr = new InputStreamReader(fis);
            br = new BufferedReader(ipr);
            try {
                while((linea = br.readLine()) != null){                    
                    System.out.println(linea); 
                }                
            } catch (IOException ex) {
                System.out.println("Error: " + ex.getMessage());
            }                        
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }                        
    }
}
