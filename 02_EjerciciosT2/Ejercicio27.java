/*
 */
package ejercicio27;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
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
        
        System.out.println("Escriba una dirección IP:");
        String ip = new Scanner(System.in).nextLine();
        System.out.println("\nEscriba el timeout (en milisegundos):");
        int timeout = new Scanner(System.in).nextInt();
        
        try {
            InetAddress ia = InetAddress.getByName(ip);    
            try{
                boolean ping = ia.isReachable(timeout);
                Thread.sleep(timeout);
                System.out.println("\nHaciendo ping a "+ia.getHostAddress()+" ... "+ping);
            }catch(IOException e2){
                System.out.println("\nError: "+e2.getMessage());
            }
            
        } catch (InterruptedException | UnknownHostException e1) {
            System.out.println("\nError: "+e1.getMessage());
        }

    }
    
}
