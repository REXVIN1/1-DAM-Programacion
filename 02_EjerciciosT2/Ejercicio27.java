/*
 */
package ejercicio27;
import java.util.*;
import java.net.*;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 27 : Consulta el pdf de la librería “java net” y busca la clase InetAddress. Realiza un\n" +
"programa que pregunte por teclado al usuario una dirección IP y un número llamado timeout.\n" +
"El ordenador nos indicará si puede hacer ping a la IP indicada, esperando el tiempo que dice la\n" +
"variable timeout.\n");
        
        System.out.println("Introduzca una dirección IP:");
        String ip = new Scanner(System.in).nextLine();
        System.out.println("Introduzca un timeout (en milisegundos):");        
        int timeout = new Scanner(System.in).nextInt();                
        
        try{
            InetAddress IP = InetAddress.getByName(ip);
            Thread tiempo = new Thread();
            tiempo.sleep(timeout);
            boolean ping = IP.isReachable(timeout);
            System.out.println("\nHaciendo ping a "+IP.getHostAddress()+"...");
            if(ping==true){
                System.out.println("¿Puede hacerse ping?: "+ping);
            }else{
                System.out.println("No se puede hacer ping");
            }
        }catch(Exception problema){
            System.out.println("\nError: "+problema.getMessage());
        }
    }
    
}
