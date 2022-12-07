


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
        
        ArchivoMP3 c1 = new ArchivoMP3("C:/Users/kevin/Desktop/beethoven.mp3");
        ArchivoMP3 c2 = new ArchivoMP3("C:/Users/kevin/Desktop/mozart.mp3");
        ArchivoMP3 c3 = new ArchivoMP3("C:/Users/usuario-mañana/Desktop/chopin.mp3");
        
        ArchivoMP3[] lista = {c1, c2, c3};
        PlayList playlist = new PlayList();
        playlist.añadirVarias(lista);
        playlist.setTitulo("Lista de Ejemplo");
        
        try {
            playlist.guardar("C:/Users/kevin/Desktop/lista.txt");
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
        
        Reproductor r1 = new Reproductor(playlist , true, true);
        try{                            
            r1.play();
        }catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

}
