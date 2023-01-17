
package ejercicio08;
import java.util.Scanner;
import java.util.StringTokenizer;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio08 {
    public static void main(String[] args) {
        int palabras = 0;
        System.out.println("Escriba una frase:");
        String frase = new Scanner(System.in).nextLine();
        StringTokenizer st = new StringTokenizer(frase);
        while(st.hasMoreTokens()){
            palabras++;
            System.out.println(st.nextToken());
        }
        System.out.println("Total de palabras: "+palabras);
    }
}
