
package ejercicio50;
import java.util.ArrayList;

/*@author usuario-mañana*/

public class Ejercicio50 {

    /*@param args the command line arguments*/
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 50 : Consulta la documentación de la interfaz List<T> y la clase ArrayList<T> y haz un\n" +
"programa que las use para crear una lista de Strings llamada “mensajes” y haga estas acciones:\n");
        
        System.out.println("a) Rellene la lista con 5 palabras (las que tú quieras)");
        
        ArrayList mensajes = new ArrayList();
        
        mensajes.add("hola");
        mensajes.add("que");
        mensajes.add("tal");
        mensajes.add("como");
        mensajes.add("estas"); 
        
        System.out.println(mensajes);
        
        System.out.println("\nb) Muestre por pantalla el tamaño de la lista\n");
        System.out.println("Tamaño: "+mensajes.size());
        
        System.out.println("\nc) Muestre por pantalla la palabra de la posición 3 de la lista.");
        System.out.println("Posicion 3: "+mensajes.get(3));
        
        System.out.println("\nd) Llame al método toString de la lista y muestre por pantalla lo que produce");
        System.out.println("Metodo String: "+mensajes.toString());
        
        System.out.println("\ne) Elimine el primer dato de la lista");
        mensajes.remove(0);
        System.out.println(mensajes);
        
        System.out.println("\nf) Muestre el tamaño de la lista");
        System.out.println("Tamaño: "+mensajes);
        
        System.out.println("\ng) Muestre por pantalla la palabra de la posición 3 de la lista");
        System.out.println("Posicion 3: "+mensajes.get(3));
        
        System.out.println("\nh) Llame al método toString de la lista y muestre por pantalla lo que produce");
        System.out.println("Metodo String: "+mensajes.toString());
    }
    
}
