
package ejercicio40;
import java.lang.*;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio40 {

    /*@param args the command line arguments*/
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 40 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase Runtime. Haz un\n" +
"programa que muestre por pantalla el número de procesadores de tu ordenador y la cantidad\n" +
"de memoria total asociada al proceso de Java por el sistema operativo.\n");
        
        System.out.println("Número de procesadores: "+Runtime.getRuntime().availableProcessors());
        
        double mb = Runtime.getRuntime().totalMemory()/8/1000;
        
        System.out.println("Cantidad de memoria: "+mb+" Mb");
    }

}
