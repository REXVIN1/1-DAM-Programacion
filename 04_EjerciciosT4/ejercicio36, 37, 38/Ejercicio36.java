
package ejercicio36;

import java.util.ArrayList;
import java.util.Collections;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio36 {

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        ArrayList<String> nombres = new ArrayList<String>();
                       
        Persona p1 = new Persona("Kevin");
        personas.add(p1);
        Persona p2 = new Persona("Sergio");
        personas.add(p2);
        Persona p3 = new Persona("Luis");
        personas.add(p3);
        Persona p4 = new Persona("Dario");
        personas.add(p4);
        Persona p5 = new Persona("Javi");
        personas.add(p5);
        Persona p6 = new Persona("Manuel");
        personas.add(p6);
        Persona p7 = new Persona("Emilio");
        personas.add(p7);
        Persona p8 = new Persona("Ossama");
        personas.add(p8);
        Persona p9 = new Persona("Romeo");
        personas.add(p9);
        Persona p10 = new Persona("Ivan");
        personas.add(p10);
        
        for(int i=0;i<10;i++){            
            nombres.add(personas.get(i).getNombre());
        }
        Collections.sort(personas);
        System.out.println(personas);
        Collections.sort(nombres);
        System.out.println(nombres);
    }
}
