
package ejercicio42;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio42 {

    public static void main(String[] args) {
        int f, c,e,x = 0;
        String fila = "";
        boolean b = true;
        while(b){
            System.out.println("\nEscriba numero de filas:");
            f = new Scanner(System.in).nextInt();
            System.out.println("Escriba numero de columnas:");
            c = new Scanner(System.in).nextInt();

            for(int i=0;i<f;i++){  
                e=0+i;
                while(x<c){
                    fila = fila+" "+e;
                    e++;
                    x++;
                }
                System.out.println(fila);
                fila = "";
                x=0;                        
            }                          
        }
    }
}
