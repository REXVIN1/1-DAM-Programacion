
package ejercicio30;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio30 {

    public static void main(String[] args) {
        boolean b = true;
        int n, x=0;
        
        while(b){
            System.out.println("\nIntroduzca un numero de segundos:");
            n = new Scanner(System.in).nextInt();

            if(n<0){
                System.out.println("Introduzca un numero positivo");
            }
            if(n>=60){
                x = n/60;
                n = n%60;
                System.out.println(x);
                System.out.println(n);
                for(int i=n;i>=0;i--){
                    try {
                        System.out.println(x+":"+i);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.out.println("Error: "+ex.getMessage());
                    }
                }
                while(x>0){
                    x--;
                    n=60;                
                    if(x==0){
                        for(int i=n;i>=0;i--){                       
                            try {
                                System.out.println(x+":"+i);
                                Thread.sleep(1000);
                            }catch (InterruptedException ex) {
                                System.out.println("Error: "+ex.getMessage());
                            }
                        } 
                    }else{
                        for(int i=n;i>=0;i--){                       
                            try {
                                System.out.println(x+":"+i);
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                                System.out.println("Error: "+ex.getMessage());
                            }
                        } 
                    }
                }                
            }
            if(n<60&&x==0){
               for(int e=n;e>=0;e--){
                   try {
                       System.out.println(x+":"+e);
                       Thread.sleep(1000);
                   } catch (InterruptedException ex) {
                       System.out.println("Error: "+ex.getMessage());
                   }                    
                } 
            }            
        }
    }
}
