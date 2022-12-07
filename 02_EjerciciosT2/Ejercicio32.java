
package ejercicio32;
import bpc.daw.reproductor.Reproductor;
import bpc.daw.reproductor.ArchivoMP3;
import java.text.NumberFormat;

/*Kevin Gómez Valderas*/

public class Ejercicio32 {

    /*@param args the command line arguments*/
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 32 : En la librería ReproductorMúsica.jar se encuentran clases para reproducir\n" +
"archivos mp3 y crear listas de reproducción que pueden guardarse en el disco. Su diagrama de\n" +
"clases y documentación vienen en el pdf que acompaña la librería. Realiza un programa que\n" +
"reproduzca en segundo plano (asíncrona) un archivo mp3 que tengas en tu disco duro. Una vez\n" +
"comenzada la reproducción, se mostrará el título de la canción, su autor y su duración.\n");
        
        ArchivoMP3 a = new ArchivoMP3("C:/Users/kevin/Desktop/chopin.mp3");
        NumberFormat nf = NumberFormat.getInstance();
        
        System.out.println("Título: "+a.getTitulo());
        System.out.println("Autor: "+a.getAutor());
        
        double duracion2 = a.getDuracion();
        double minutos = duracion2/1000/60;
        
        nf.setMaximumFractionDigits(2);
        
        System.out.println("Duración: "+nf.format(minutos));
        
        Reproductor r = new Reproductor(a,true,true);      
        r.play();
        
    }
    
}
