


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
        File carpeta2 = new File(ruta.replaceAll("\\s+", ""));
        File[] lista = {};
        
        lista = carpeta2.listFiles();
        
        int i = 0, a = 0, c = 0; 
        
        if(carpeta2.isDirectory()){
            System.out.println("\n--------------------------------------");
            System.out.println("                LISTA         ");
            System.out.println("--------------------------------------");
            while(i<lista.length){
                if(lista[i].isFile()==true){ 
                    System.out.println("Archivo "+(i+1)+": "+lista[i].getName());
                    i++;
                    a++;
                }                     
                if(lista[i].isDirectory()==true){                
                    System.out.println("Carpeta "+(i+1)+": "+lista[i].getName());
                    i++;
                    c++;
                }
            }
            System.out.println("--------------------------------------");
            System.out.println("Archivos totales: "+a);
            System.out.println("Carpetas totales: "+c);
            System.out.println("--------------------------------------");
        }else{
            System.out.println("\nPorfavor, introduzca una ruta a un directorio");
        } 
    }

}
