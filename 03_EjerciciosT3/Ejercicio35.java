
package ejercicio35;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio35 {

    public static void main(String[] args) {
        int n, divisores = 0;
        boolean b=true, b2;
        
        System.out.println("\nIntroduzca un numero:");
        n = new Scanner(System.in).nextInt();

        if(n<=1){
            System.out.println("Introduzca un valor mayor de uno");
        }else{
            for(int i=2;i<n;i++){
                b2 =(n%i)==0;
                if(b2==true){
                    divisores = divisores + 1;
                }                  
            }
            if(divisores==0){
                System.out.println(n+" es primo");
            }else{
                System.out.println(n+" no es primo");
            }
        }              
    }
}
