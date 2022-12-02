
package ejercicio51;
import java.util.*;

/*@author usuario-mañana*/

public class Ejercicio51 {

    /*@param args the command line arguments*/
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 51 : Consulta la documentación de la interfaz Set<T> y la clase HashList<T> y haz un\n" +
"programa que las use para crear un conjunto de Strings llamado “mensajes” y haga esto:\n");
        
        HashSet h = new HashSet();
        
        System.out.println("a) Rellene el conjunto con las palabras: silla, mesa, niño, mesa, casa, silla, lápiz");
        
        h.add("silla");
        h.add("mesa");
        h.add("niño");
        h.add("mesa");
        h.add("casa");
        h.add("silla");
        h.add("lápiz");
        
        System.out.println("\nb) Muestre por pantalla el tamaño de la lista");
        System.out.println("Tamaño lista: "+h.size());
        
        System.out.println("\nc) Llame al método toString de la lista y muestre por pantalla lo que produce");
        System.out.println("Método string: "+h.toString());    
    }
    
}
