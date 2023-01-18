
package ejercicio29;

import java.util.HashMap;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio29 {

    public static void main(String[] args) {
        boolean b = true;
        
        HashMap hm = new HashMap();
        hm.put("hola", "hello");
        hm.put("casa", "house");
        hm.put("caballo", "horse");
        hm.put("hacha", "axe");
        hm.put("manzana", "apple");
        hm.put("ventana", "window");
        hm.put("tortuga", "turtle");
        hm.put("raton", "mouse");
        hm.put("mesa", "table");
        
        while(b){
            System.out.println("\nEscriba una palabra:");
            String palabra = new Scanner(System.in).nextLine();
            if(hm.containsKey(palabra)==true){
                System.out.println("Traducción: "+hm.get(palabra));
            }else{
                System.out.println("Esta palabra no se encuentra en el diccionario");
            }                            
        }
    }
}
