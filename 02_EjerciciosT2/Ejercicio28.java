/*
 */
package ejercicio28;
import java.net.*;
import java.util.*;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 28 : Usa la clase InetAddress para hacer un programa que pregunte por un nombre\n" +
"de equipo de la red y nos muestre su dirección IP.\n");
        
        System.out.println("Introduzca un nombre de equipo:");
        String nombre = new Scanner(System.in).nextLine();
        
        try{
            InetAddress ID = InetAddress.getByName(nombre);
            System.out.println("\nLa IP de "+nombre+" es "+ID.getHostAddress());
        }catch(Exception fallo){
            System.out.println("\nHa surgido un problema");
        }
    }
    
}
