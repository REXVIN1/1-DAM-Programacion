
package exámen02;
import java.util.*;

public class EXÁMEN02 {


    public static void main(String[] args) {
        System.out.println("2. Escribe un programa que muestre por pantalla tu nombre y apellidos dentro de un \n" +
"rectángulo formado por el carácter ‘*’. Además, debe pedir al usuario que escriba 5 tipos \n" +
"de datos diferentes para almacenarlos en su variable correspondiente. Por último, se debe \n" +
"mostrar por pantalla el contenido de cada una de las variables"+"\n");
        
        System.out.println("**********************");
        System.out.println("*Kevin Gómez Valderas*");
        System.out.println("**********************");
        
        int v1 = new Scanner(System.in).nextInt();
        short v2 = new Scanner(System.in).nextShort();
        long v3 = new Scanner(System.in).nextLong();
        String v4 = new Scanner(System.in).nextLine();
        boolean v5 = new Scanner(System.in).nextBoolean();
        
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
    }
    
}
