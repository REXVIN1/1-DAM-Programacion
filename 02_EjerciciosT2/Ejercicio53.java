
package ejercicio53;
import java.util.*;

/*@author usuario-mañana*/

public class Ejercicio53 {

    /*@param args the command line arguments*/
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 53 : Repite los apartados a,b,c y d del ejercicio anterior pero rellenando el\n" +
"Map<String,Color> con un TreeMap<String,Color>. ¿Notas alguna diferencia en la salida del\n" +
"programa?\n");
        
        System.out.println("\na) Crea un Map<String,Color> y rellenarlo con un HashMap<String,Color> vacío");
        
        TreeMap tm = new TreeMap();
        System.out.println(tm);
        
        System.out.println("\nb) Añade al objeto creado en el apartado anterior estas asociaciones:");
        tm.put("12535ABC","Color rojo");
        tm.put("98525KWX","Color amarillo");
        tm.put("17632MSE","Color verde");
        tm.put("85321ABC","Color amarillo");
        
        System.out.println(tm);
        
        System.out.println("\nc) Muestra en pantalla el tamaño del map"); 
        System.out.println("Tamaño: "+tm.size());
        
        System.out.println("\nd) Llama al método toString del map y muestra lo que produce por pantalla");
        System.out.println("Método toString: "+tm.toString());
        
        System.out.println("\nNo veo ninguna diferencia entre un metodo y otro");
    }
    
}
