
package ejercicio34;

import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio34 {

    public static void main(String[] args) {
        int n = 0;
        boolean b;
        
        System.out.println("Escriba un numero: ");
        n = new Scanner(System.in).nextInt();        
        System.out.println("Los divisores de "+n+" son:");
        
        for(int i=1;i<=n;i++){
            b =(n%i)==0;
            if(b==true){
                System.out.println(i);
            }                    
        }
    }
}
