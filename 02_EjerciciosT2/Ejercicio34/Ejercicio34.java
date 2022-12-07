
package ejercicio34;
import bpc.daw.reproductor.ArchivoMP3;
import bpc.daw.reproductor.Reproductor;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 34 : Haz un programa que cargue la lista de reproducción guardada en el ejercicio\n" +
"anterior y la reproduzca de forma síncrona.\n");
        
        try{
            File lista = new File("C:/Users/kevin/Desktop/titulo.txt");
            Scanner s = new Scanner(lista);
            s.nextLine();
            boolean b = s.hasNextLine();
            while(b==true){
                ArchivoMP3 a = new ArchivoMP3(s.nextLine());
                Reproductor r = new Reproductor(a,true,true);
                r.play();
            }
            System.out.println("La PlayList a finalizado");
                   
        }catch(FileNotFoundException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        
    }

}
