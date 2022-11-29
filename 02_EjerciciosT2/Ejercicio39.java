
package ejercicio39;
import java.lang.*;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio39 {

    /*@param args the command line arguments*/
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 39 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase System. Haz un\n" +
"programa que muestre por pantalla información sobre tu ordenador, de la forma que indica la\n" +
"siguiente imagen. (Nota: La carpeta de archivos temporales es la variable de entorno TMP).\n");
        
        String SO = "os.name";
        String VSO = "os.version";
        String ASO = "os.arch";
        String user = "user.name";
        String cap = "java.io.tmpdir";
        
        System.out.println("Información sobre el ordenador:\n");
        System.out.println("-Sistema operativo: "+System.getProperty(SO));
        System.out.println("-Versión del sistema operativo: "+System.getProperty(VSO));
        System.out.println("-Arquitectura del sistema operativo: "+System.getProperty(ASO));
        System.out.println("-Usuario actual: "+System.getProperty(user));
        System.out.println("-Carpeta de archivos temporales: "+System.getProperty(cap));
        
    }

}
