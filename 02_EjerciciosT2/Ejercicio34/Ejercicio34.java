
package ejercicio34;
import java.io.*;
import java.util.*;
import bpc.daw.reproductor.*;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 34 : Haz un programa que cargue la lista de reproducción guardada en el ejercicio\n" +
"anterior y la reproduzca de forma síncrona.\n");
        
        File lista = new File("C:/Users/kevin/Desktop/Ejercicio33/lista.txt");
        
        try{
            Scanner s = new Scanner(lista);
            s.nextLine();
            String l1 = s.nextLine();
            String l2 = s.nextLine();
            String l3 = s.nextLine();
            
            ArchivoMP3 c1 = new ArchivoMP3(l1);
            ArchivoMP3 c2 = new ArchivoMP3(l2);
            ArchivoMP3 c3 = new ArchivoMP3(l3);
            
            boolean a = true,b = true;
            Reproductor r1 = new Reproductor(c1, a, b);
            Reproductor r2 = new Reproductor(c2, a, b);
            Reproductor r3 = new Reproductor(c3, a, b);
            
            r1.play();
            r2.play();
            r3.play();
            
        }catch(Exception ex){
            System.out.println("Surgió un error");
        }
        
        
    }

}
