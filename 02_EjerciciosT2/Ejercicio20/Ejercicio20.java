/*
 */
package ejercicio20;
import java.util.*;
import java.io.*;
/**
 *
 * @author Kevin Gómez <kgomval118@g.educaand.es>
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 20 : Realiza un programa que pregunte al usuario por la ruta de un archivo del disco\n" +
"duro. Si dicho archivo existe y es directorio, el programa dirá \"La ruta introducida corresponde\n" +
"a un directorio\" y terminará sin hacer nada más. En caso de que sea un archivo, el programa\n" +
"mostrará \"La ruta introducida es un archivo de tamaño ... bytes. ¿Desea borrarlo (si/no)?\". Si el\n" +
"usuario introduce la palabra \"si\", el archivo se borrará y el ordenador mostrará si se ha\n" +
"borrado correctamente o se ha producido un error al borrar. En caso de que el usuario escriba\n" +
"cualquier otra cosa el programa responderá \"Borrado cancelado\" y finalizará."+"\n");
        
        System.out.println("Escriba una ruta: ");                   
        
        String ruta = new Scanner(System.in).nextLine();
        File archivo = new File(ruta);
        double bits = archivo.length();
        double bytes = bits/8;
        
        if(archivo.exists()&&archivo.isDirectory()){
            System.out.println("\n"+"La ruta introducida corresponde\n" +
"a un directorio");
        }
        if(archivo.isFile()){
            System.out.println("\n"+"La ruta introducida es un archivo de tamaño "+bytes+" bytes.¿Desea borrarlo(si/no?");
            String respuesta = new Scanner(System.in).nextLine();
            if(respuesta.equalsIgnoreCase("si")){
                archivo.delete();
                System.out.println("\n"+"Se ha borrado correctamente");
            }if(respuesta.equalsIgnoreCase("no")){
                System.out.println("\n"+"El archivo no ha sido borrado");
            }else{
                System.out.println("\n"+"Se ha producido un error");
            }
        }     
    }
    
}
