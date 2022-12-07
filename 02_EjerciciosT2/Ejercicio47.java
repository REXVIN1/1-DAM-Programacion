/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio47;
import java.awt.Desktop;
import java.util.Scanner;
import java.io.File;

/**
 *
 * @author usuario-mañana
 */
public class Ejercicio47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 47 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase Desktop. Haz un\n" +
"programa que pregunte al usuario la ruta de un archivo. El programa abrirá dicho archivo\n" +
"usando para ello el programa que esté configurado en el sistema operativo.\n");
        
        System.out.println("Escriba una ruta:");
        String ruta = new Scanner(System.in).nextLine();
        File f = new File(ruta);
        
        try{
            Desktop d = Desktop.getDesktop();
            d.open(f);
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
        
        
        
    }
    
}
