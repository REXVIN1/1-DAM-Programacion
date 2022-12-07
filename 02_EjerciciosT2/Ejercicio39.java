
package ejercicio39;
import java.lang.*;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio39 {

    /*@param args the command line arguments*/
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 39 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase System. Haz un\n" +
"programa que muestre por pantalla información sobre tu ordenador, de la forma que indica la\n" +
"siguiente imagen. (Nota: La carpeta de archivos temporales es la variable de entorno TMP).\n");
        
        System.out.println("Informacion del ordenador:\n");
        System.out.println("-Sistema operativo: "+System.getProperty("os.name"));
        System.out.println("-Version del sistema operativo: "+System.getProperty("os.version"));
        System.out.println("-Arquitectura del sistema operativo: "+System.getProperty("os.arch"));
        System.out.println("-Usuario actual: "+System.getProperty("user.name"));
        System.out.println("-Carpeta de archivos temporales: "+System.getProperty("java.io.tmpdir"));
        
    }

}
