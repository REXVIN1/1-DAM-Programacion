
package ejercicio54;
import java.util.ArrayList;
import java.util.Collections;

/*@author usuario-mañana*/

public class Ejercicio54 {

    /*@param args the command line arguments*/
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 54 : Haz un programa que haga esto:\n");
        
        System.out.println("a) Crea una lista de 10 palabras (las que tú quieras)");
        
        ArrayList lista = new ArrayList();
        
        lista.add("dias");
        lista.add("de");
        lista.add("semana");
        lista.add("lunes");
        lista.add("martes");
        lista.add("jueves");
        lista.add("viernes");
        lista.add("sabado");
        lista.add("domingo");
        
        Collections.sort(lista);
        
        System.out.println(lista.toString());
    }
    
}
