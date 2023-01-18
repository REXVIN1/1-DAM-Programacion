
package ejercicio31;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio31 {

    public static void main(String[] args) {
        int n;
        
        System.out.println("Escriba un numero:");
        n = new Scanner(System.in).nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}
