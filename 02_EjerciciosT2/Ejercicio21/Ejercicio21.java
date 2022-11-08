/*
 */
package ejercicio21;
import java.util.*;
import java.io.*;
/**
 *
 * @author Kevin Gómez <kgomval118@g.educaand.es>
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 21 : Realiza un programa que pida por teclado la ruta de un directorio. En caso de que\n" +
"la ruta introducida no sea un directorio, el programa mostrará un mensaje de error. En caso\n" +
"contrario, el programa mostrará el número total de archivos y carpetas que contiene."+"\n");
        
        System.out.println("Introduzca la ruta:");
        String ruta = new Scanner(System.in).nextLine();
        File archivo = new File(ruta);
        File lista_archivos[]={};
        int carpetas = 0;
        
        if(archivo.isDirectory()){
            lista_archivos = archivo.listFiles();
            System.out.println("\n"+"Número total de archivos: "+lista_archivos.length);
            boolean archivo1 = lista_archivos[0].isDirectory();
            boolean archivo2 = lista_archivos[1].isDirectory();
            boolean archivo3 = lista_archivos[2].isDirectory();
            if(archivo1==true){
                carpetas++;
            }if(archivo2==true){
                carpetas++;
            }if(archivo3==true){
                carpetas++;
            }
            System.out.println("Número de carpetas: "+carpetas);
        }else{
            System.out.println("\n"+"Error");
        }
    }
    
}
