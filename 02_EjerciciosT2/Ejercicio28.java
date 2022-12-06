/*
 */
package ejercicio28;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
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
            InetAddress ia = InetAddress.getByName(nombre);
            System.out.println("La IP de "+ia.getHostName()+" es "+ia.getHostAddress());
        }catch(UnknownHostException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
}
