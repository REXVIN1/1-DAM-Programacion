
package exámen05;
import java.util.*;

public class EXÁMEN05 {


    public static void main(String[] args) {
        System.out.println("5. Escribe un programa al usuario que le pida un valor entero. Ese valor entero se debe \n" +
"incrementa en 5, utiliza el operador de incremento y se muestra por pantalla. Decrementa \n" +
"el valor en 4 unidades, utiliza el operador de decremento y muéstralo por pantalla. Utiliza \n" +
"el operador de incremento unitario sobre la variable y muestra por pantalla su valor. Por \n" +
"último, utiliza el operador de decremento unitario y muestra por pantalla el nuevo valor."+"\n");
        
        System.out.println("Introduzca número entero: ");
        int v1 = new Scanner(System.in).nextInt();
        v1 += 5;
        System.out.println("Aumento de 5 unidades: "+v1);
        v1 -= 5;
        System.out.println("Incremento de 5 unidades: "+v1);
        v1 ++;
        System.out.println("Incremento unitario: "+v1);
        v1 --;
        System.out.println("Decremento unitario: "+v1);
        
    }
    
}
