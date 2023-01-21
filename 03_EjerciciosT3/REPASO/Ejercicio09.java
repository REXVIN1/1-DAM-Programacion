
package ejercicio09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio09 {

    public static void main(String[] args) {
        List<Integer> n = new ArrayList<>();
        int t, f=0, nr;
        Random r = new Random();
        boolean b = true;
        String n2, f2;
        
        System.out.println("Introduzca el tamaño de la lista: ");
        t = new Scanner(System.in).nextInt();
        
        while(b){
            System.out.println("\nIndique el numero con el que acaban:");
            f = new Scanner(System.in).nextInt();
            if(f<0||f>9){
                System.out.println("Indique un valor entre 0 y 9");
            }else{
                b=false;
            }            
        }                        
        while(n.size()<t){
            nr = r.nextInt(1, 300);
            n2=Integer.toString(nr);
            f2=Integer.toString(f);
            if(n2.endsWith(f2)){
                n.add(nr);
                System.out.println("\nValor: "+nr+"\nPosicion: "+n.indexOf(nr));
            }                     
        }
        System.out.println("\n"+n);
    }
}
