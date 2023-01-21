
package ejercicio07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio07 {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        int n, max, min;
        
        System.out.println("Escriba 10 numeros:");
        for(int i=0;i<10;i++){
            n = new Scanner(System.in).nextInt();
            numeros.add(n);
        }        
        max = Collections.max(numeros);
        min = Collections.min(numeros);
        System.out.println("\nLista de numeros: "+numeros);
        System.out.println("Maximo: "+max+"\nPosicion: "+numeros.indexOf(max)+""
                + "\n\nMinimo: "+min+"\nPosicion: "+numeros.indexOf(min));
    }
}
