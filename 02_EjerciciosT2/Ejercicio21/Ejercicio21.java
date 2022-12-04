


package ejercicio21;

import java.io.File;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 21 : Realiza un programa que pida por teclado la ruta de un directorio. En caso de que\n" +
"la ruta introducida no sea un directorio, el programa mostrará un mensaje de error. En caso\n" +
"contrario, el programa mostrará el número total de archivos y carpetas que contiene.");
        
        System.out.println("\nIntroduzca la ruta de la carpeta para ver sus archivos y otras carpetas:");
        String ruta = new Scanner(System.in).nextLine();
        File file5 = new File(ruta);            
        File[] lista = {};
        lista = file5.listFiles();
        int valor = 0,archivos=0,carpetas=0;
        
        System.out.println("\nARCHIVOS Y CARPETAS");
        System.out.println("ARCHIVOS-----------------------------");
        while(valor<lista.length){
            if(lista[valor].isFile()){
                archivos++;
                System.out.println("Archivo "+(archivos)+": "+lista[valor].getName());
                valor++;  
            }else{
                valor++;
            }      
        }
        valor = 0;
        System.out.println("\nCARPETAS-----------------------------");
        while(valor<lista.length){
            if(lista[valor].isDirectory()){
                carpetas++;
                System.out.println("Carpeta "+(carpetas)+": "+lista[valor].getName());
                valor++;  
            }else{
                valor++;
            }      
        }
    }

}
