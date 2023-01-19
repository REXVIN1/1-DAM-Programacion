
package ejercicio43;

import java.util.Random;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio43 {

    public static void main(String[] args) {
        int x=0, verdaderos=0, falsos=0;
        String fila = "";
        boolean b = true, b1;
        Random rm = new Random();
        
        for(int i=0;i<4;i++){  
            while(x<3){
                b1=rm.nextBoolean();
                fila = fila+" "+b1;
                if(b1==true){
                    verdaderos = verdaderos + 1;
                }else{
                    falsos = falsos + 1;
                }
                x++;
            }
            System.out.println(fila);
            fila = "";
            x=0;                        
        }
        System.out.println("Numero de FALSE: "+falsos+"\nNumero de TRUE: "+verdaderos);
    }
}
