
package ejercicio08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio08 {

    public static void main(String[] args) {
        List<Integer> n = new ArrayList<>();
        Random r = new Random();
        int nr;
        
        for(int i=0;i<20;i++){
            nr = r.nextInt(0, 99);
            n.add(nr);
            System.out.println("\nValor: "+nr+"\nPosicion: "+n.indexOf(nr));
        }
    }
}
