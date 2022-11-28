
package ejercicio35;
import bpc.daw.reproductor.*;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 35 : Realiza las siguientes tareas y responde las preguntas que se indican:\n");
        
        System.out.println("a) Crea dos objetos diferentes ArchivoMP3, pero que usen la misma ruta de archivo.\n");
        ArchivoMP3 c1 = new ArchivoMP3("C:/Users/kevin/Desktop/Ejercicio35/beethoven.mp3");
        ArchivoMP3 c2 = new ArchivoMP3("C:/Users/kevin/Desktop/Ejercicio35/beethoven.mp3");
        
        System.out.println("a. Compáralos con el signo == como si fuesen tipos básicos. ¿Qué sucede?");
        boolean r1 = c1==c2;
        System.out.println("El resultado da '"+r1+"' por lo tanto no se compara correctamente.\n");
        
        System.out.println("b. Compáralos con el método equals. ¿Qué sucede?");
        boolean r2 = c1.equals(c2);
        System.out.println("El resultado da '"+r2+"' por lo tanto se compara correctamente.\n");
        
        System.out.println("c. Muestra los hashCode de dichos objetos. ¿Coinciden?");
        System.out.println("HashCode canción 1: "+c1.hashCode());
        System.out.println("HashCode canción 2: "+c2.hashCode());
        System.out.println("Si coinciden\n");
        
        System.out.println("b) Crea un objeto Reproductor y muestra por pantalla la salida de su método toString.\n" +
"¿Qué aparece?"); 
        Reproductor rep = new Reproductor(c1,true ,true );
        System.out.println("To string del reproductor: "+rep.toString());
        System.out.println("Aparece la ruta de la clase reproductor y el objeto/canción en string\n");
        
        System.out.println("c) Crea un objeto ArchivoMP3 y muestra por pantalla la salida de su método toString.\n" +
"¿Qué aparece? ¿Tiene el mismo formato que la salida de toString de Reproductor? ¿a\n" +
"qué crees que puede ser debido?");
        
        ArchivoMP3 c3 = new ArchivoMP3("C:/Users/kevin/Desktop/Ejercicio35/beethoven.mp3");
        System.out.println("To string del objeto/cancion: "+c3.toString());
        System.out.println("Aparece null.\n"
                + "No, ya que se trata de una canción");
    }

}
