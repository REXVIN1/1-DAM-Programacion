
package ejercicio26;

import java.util.ArrayList;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio26 {

    public static void main(String[] args) {
        String palabra, palabras_con_a = "";
        ArrayList al = new ArrayList();
        int palabras = 0;
        
        System.out.println("Introduzca 6 palabras: (pulsar enter tras ppalabra)");
        for(int i=0;i<=5;i++){
            palabra = new Scanner(System.in).nextLine();
            al.add(palabra);
        }
        System.out.println(al);
        for(int e=0;e<=5;e++){
            if(al.get(e).toString().toLowerCase().indexOf("a")!=-1){
                palabras = palabras + 1;
                palabras_con_a = palabras_con_a+" "+al.get(e);
            }            
        }
        System.out.println("Existe/n "+palabras+" palabra/s con la letra A\nSon: "+palabras_con_a);
    }
}
