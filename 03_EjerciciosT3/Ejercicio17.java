
package ejercicio17;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio17 {

    public static void main(String[] args) {
        String IP;
        InetAddress ia;
        boolean b = true;
        int n;
        Instant instante, instante2;
        Duration duracion;
        
        while(b==true){
            try {
                System.out.println("\nEscriba una dirección IP:");
                IP = new Scanner(System.in).nextLine();
                System.out.println("\nEscriba el número de veces: ");
                n = new Scanner(System.in).nextInt();
                for(int i=0;i<n;i++){
                    try {
                        instante = Instant.now();
                        ia = InetAddress.getByName(IP);                    
                        System.out.println("\nHaciendo ping a: "+ia);
                        instante2 = Instant.now();
                        System.out.println("Respuesta desde "+ia.getHostAddress()+": tiempo: "+Duration.between(instante, instante2).toMillis()+"ms");                                                           
                    } catch (UnknownHostException ex) {
                        System.out.println("Error: "+ex.getMessage());
                    }
                    b=false;                            
                }                
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
}
