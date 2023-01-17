
package ejercicio27;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio27 {

    public static void main(String[] args) {
        int n, total=0;
        
        System.out.println("Escriba las notas: ");
        for(int i=0;i<10;i++){
            n = new Scanner(System.in).nextInt();
            if(n<5){
                System.out.println("Esta suspenso");
                break;
            }
            total = total+n;
        }
        System.out.println("Media: "+total/10);
    }
}
