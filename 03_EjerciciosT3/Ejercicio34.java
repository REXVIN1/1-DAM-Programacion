
package ejercicio34;

import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio34 {

    public static void main(String[] args) {
        int n;
        boolean b1=true, b2;
        
        while(b1){
            System.out.println("\nEscriba un numero: ");
            n = new Scanner(System.in).nextInt();                    

            if(n<0){
                System.out.println("Introduca un valor mayor de uno");
            }else{
                System.out.println("Los divisores de "+n+" son:");
                for(int i=1;i<=n;i++){
                    b2 =(n%i)==0;
                    if(b2==true){
                        System.out.println(i);
                    }                    
                }            
            }
        }
    }
}
