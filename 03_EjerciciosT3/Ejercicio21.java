
package ejercicio21;

import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio21 {

    public static void main(String[] args) {
        int lista[] = {2,9,4,5,6,1,2,3,45,2,1,2,65,3,2,6,1,2,3,5,2,2,6,67,11,
            67,3,2,1,7,8,5,3,27,8,93,1,6},cantidad = 0;
        boolean b = true;
        while(b){
            System.out.println("\nEscriba un número:");
            try {
                int n = new Scanner(System.in).nextInt();
                for(int i=0;i<lista.length;i++){
                    if(n==lista[i]){
                        cantidad = cantidad + 1;
                    }
                }
                System.out.println(cantidad);
                b = false;            
            } catch (Exception ex) {
                System.out.println("Introduzca un numero entero. Error: " + ex.getMessage());
            }            
        }
    }
}
