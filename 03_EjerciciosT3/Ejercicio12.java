
package ejercicio12;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio12 {

    public static void main(String[] args) {
        int lista[] = {0,1,2,3,4,5,6,7,8,9,10},n, i = 0, longitud = lista.length, total = 0;
        boolean b = true;
        while(b){
            System.out.println("Introduzca -1 para ver las notas: ");
            n = new Scanner(System.in).nextInt();
            if(n==-1){
                System.out.println("Nota máximo: "+Math.max(lista[0], lista[10])+""
                        + "\nNota mínimo: "+Math.min(lista[0], lista[10]));
                while(i<longitud){
                    total = total+lista[i];
                    i++;
                }
                System.out.println("Nota media: "+(total/longitud));
                b=false;
            }else{
                System.out.println("Introduzca un valor adecuado\n");
            }            
        }
    }
}
