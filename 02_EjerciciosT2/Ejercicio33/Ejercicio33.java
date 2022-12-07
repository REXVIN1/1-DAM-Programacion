


package ejercicio33;
import bpc.daw.reproductor.ArchivoMP3;
import bpc.daw.reproductor.Reproductor;
import bpc.daw.reproductor.PlayList;
import java.io.IOException;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        System.out.println("Ejercicio 33 : Haz un programa que cree una lista de reproducción titulada “Lista de Ejemplo” y\n" +
                    "añádele tres canciones a ellas. El programa deberá guardar dicha lista en el disco duro (puedes\n" +
                    "inventar el nombre del archivo) y luego reproducir las tres canciones de forma síncrona.\n");
        
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
