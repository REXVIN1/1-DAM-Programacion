
package ejercicio38;

import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio38 {

    public static void main(String[] args) {
        int nota = 0, total = 0;
        boolean b = true, b1;
        
        while(b){
            b1=true;
            System.out.println("\nEscriba las notas: ");
            for(int i=0;i<10&&b1==true;i++){
                nota = new Scanner(System.in).nextInt();
                total = total + nota;
                if(nota>10||nota<0){
                    System.out.println("Por favor, introduzca una nota adecuada");
                    b1=false;
                }
            }
            if(b1==true){
                System.out.println("Nota media: "+total/10);
                b=false;
            }
        }
    }
}
