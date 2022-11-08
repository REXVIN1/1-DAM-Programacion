/*
 */
package ejercicio19;
import java.util.*;
import java.io.*;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 19 : Consulta el pdf de la librería “java io” y encuentra la clase File. Realiza un\n" +
"programa que pregunte al usuario por teclado la ruta de un archivo. El programa deberá decir\n" +
"cuántos bytes y cuántos megabytes ocupa en el disco duro."+"\n");
        
        System.out.println("Escriba la ruta de un archivo:");    
        //C:\Users\kevin\OneDrive\Documents\NetBeansProjects\Ejercicio19\build\classes\ejercicio19\archivo2.avi
        
        String ruta = new Scanner(System.in).nextLine();
        File filename = new File(ruta);

        System.out.println("\n"+"Bits: "+filename.length());
                
        double bytes = filename.length()/8;
        int bytes2 = (int) bytes;
        System.out.println("\n"+"Cantidad de Bytes: "+bytes2);
        
        double bytes3 = bytes/1000;
        int bytes4 = (int) bytes3;
        System.out.println("\n"+"Cantidad de Kilobytes: "+bytes4);
        
        double bytes5 = bytes3/1000;
        int bytes6 = (int) bytes5;
        System.out.println("\n"+"Cantidad de Kilobytes: "+bytes6);
    }
    
}
