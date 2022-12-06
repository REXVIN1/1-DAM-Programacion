/*
 */
package ejercicio29;
import java.util.Scanner;
import bpc.daw.objetos.Caja;
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
        try{
            System.out.println("Introduzca un numero:");
            int n = new Scanner(System.in).nextInt();
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
        //ERROR: ArrayIndexOutOfBoundsException
        System.out.println("\nb) Un programa necesita recuperar dos argumentos de la línea de comandos y no se pasa" +
"ninguno"); 
        try{
            System.out.println("Argumento 1: " + args[0]);
            System.out.println("Argumento 2: " + args[1]);  
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
        //ERROR: ArrayIndexOutOfBoundsException
        System.out.println("\nc) Creamos una caja vacía. Recuperamos el mensaje que tiene y mostramos por pantalla\n" +
"su longitud.");
        try{
            Caja c = null;
            c.abrirCaja();
            System.out.println("Mensaje: "+c.getMensaje());
            System.out.println("Mensaje: "+c.getMensaje().length());
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
    }
    
}
