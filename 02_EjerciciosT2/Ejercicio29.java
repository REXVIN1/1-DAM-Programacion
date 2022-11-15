/*
 */
package ejercicio29;
import java.util.*;
import bpc.daw.objetos.*;
import java.net.*;
import java.io.*;
/**
 *
 * @author Kevin Gómez <kgomval118@g.educaand.es>
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 29 : Realiza las siguientes acciones en un programa y escribe si lanzan o no una\n" +
"excepción. En caso afirmativo, escribe el nombre de la excepción que se lanza.\n");
        
//ERROR: NumberFormatException
        System.out.println("a) Por teclado se pide que el usuario escriba un número y el usuario escribe un texto");
        int numero = new Scanner(System.in).nextInt();        
        
        //ERROR: ArrayIndexOutOfBoundsException
        System.out.println("\nb) Un programa necesita recuperar dos argumentos de la línea de comandos y no se pasa" +
"ninguno");
        File archivo = new File("C:\\Users\\usuario-mañana\\Desktop\\archivo.txt");
        try{
            Scanner escaner = new Scanner(archivo);
        }catch(Exception error){
            System.out.println("Surgió un problema");
        }
                       
        //ERROR: ArrayIndexOutOfBoundsException
        System.out.println("c) Creamos una caja vacía. Recuperamos el mensaje que tiene y mostramos por pantalla\n" +
"su longitud.");
        Caja c = new Caja("");
        c.abrirCaja();
        String mensaje = c.getMensaje();
        System.out.println("Mensaje: "+mensaje);   
    }
    
}
