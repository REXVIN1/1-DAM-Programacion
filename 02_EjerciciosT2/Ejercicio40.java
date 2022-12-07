
package ejercicio40;
import java.lang.*;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio40 {

    /*@param args the command line arguments*/
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 40 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase Runtime. Haz un\n" +
"programa que muestre por pantalla el número de procesadores de tu ordenador y la cantidad\n" +
"de memoria total asociada al proceso de Java por el sistema operativo.\n");
        
        Runtime r = Runtime.getRuntime();
        System.out.println("Número de procesadores: "+r.availableProcessors());
        System.out.println("memoria asociada a Java (en bits): "+r.totalMemory());
    }

}
