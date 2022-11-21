


package ejercicio01;
import java.util.*;
/*@author Kevin Gómez <kgomval118@g.educaand.es>*/
 
public class Ejercicio01 {

    /*@param args the command line arguments*/
     
    public static void main(String[] args) {
        
        try{
            String[] canciones = {
                "paquito-chocolatero.mp3",
                "highway-to-hell.mp3",
                "eso es lo que tu me das.mp3",
                "despecha.mp3",
                "la-bilirrubina.mp3"
            };
            
            System.out.println("===================================");
            System.out.println("|            CANCIONES            |");
            System.out.println("===================================");
            System.out.println("| 1 - "+canciones[0]+"     |");
            System.out.println("| 2 - "+canciones[1]+"         |");
            System.out.println("| 3 - "+canciones[2]+" |");
            System.out.println("| 4 - "+canciones[3]+"                |");
            System.out.println("| 5 - "+canciones[4]+"          |");
            System.out.println("===================================");
            
            System.out.println("\nEliga una canción:");
            int n1 = new Scanner(System.in).nextInt();
            
            switch(n1){
                case 1:
                    System.out.println("\nCanción elegida: "+canciones[0]);
                    break;
                case 2:
                    System.out.println("\nCanción elegida: "+canciones[1]);
                    break;
                case 3:
                    System.out.println("\nCanción elegida: "+canciones[2]);
                    break;
                case 4:
                    System.out.println("\nCanción elegida: "+canciones[3]);
                    break;
                case 5:
                    System.out.println("\nCanción elegida: "+canciones[4]);
                    break;
                default:
                    System.out.println("\nNinguna canción escogida");
            }
        }catch(Exception error){
            System.out.println("\nEliga un número etre 1 y 5");
        }
            
    }

}
