
package exámen13;
import java.util.*;
import static java.lang.Math.pow;

public class EXÁMEN13 {


    public static void main(String[] args) {
        System.out.println("13. Haz una aplicación que calcule el área de un círculo(pi*R2\n" +
"). El radio se pedirá por teclado. \n" +
"Usa la constante PI y el método pow de Math."+"\n");
        System.out.println("Introduzca un radio: ");
        
        final double pi = 3.14;
        
        double radio = new Scanner(System.in).nextDouble();
        
        double operación = pi * (pow(radio,2));
        
        System.out.println("Resultado: "+operación);
    }
    
}
