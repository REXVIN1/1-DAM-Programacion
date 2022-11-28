
package ejercicio32;
import bpc.daw.reproductor.*;

/*Kevin Gómez Valderas*/

public class Ejercicio32 {

    /*@param args the command line arguments*/
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 32 : En la librería ReproductorMúsica.jar se encuentran clases para reproducir\n" +
"archivos mp3 y crear listas de reproducción que pueden guardarse en el disco. Su diagrama de\n" +
"clases y documentación vienen en el pdf que acompaña la librería. Realiza un programa que\n" +
"reproduzca en segundo plano (asíncrona) un archivo mp3 que tengas en tu disco duro. Una vez\n" +
"comenzada la reproducción, se mostrará el título de la canción, su autor y su duración.\n");
        
        ArchivoMP3 c = new ArchivoMP3("C:/Users/usuario-mañana/Desktop/las cosas del de la tarde/Programación/PaquitoChocolatero.mp3");
        
        System.out.println("Título: "+c.getTitulo());
        System.out.println("Autor: "+c.getAutor());
        System.out.println("Duración: "+c.getDuracion()/1000+" segundos");
        
        boolean a = true,b = true;
        Reproductor r = new Reproductor(c, a, b);
        r.play();
        
    }
    
}
