
package ejercicio38;
import java.lang.*;
import java.math.*;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio38 {

    /*@param args the command line arguments*/
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 38 : Haz un programa que calcule las dos soluciones de la ecuación x^2 − 5x + 6\n");
                
        int a = 1,b = -5, c = 6;
        
        double r1 = (-b+(Math.sqrt(Math.pow(b, 2)-(4*a*c))))/2*a;
        double r2 = (-b-(Math.sqrt(Math.pow(b, 2)-(4*a*c))))/2*a;
        
        System.out.println("Resultados x = "+r1+" x = "+r2);
        
    }

}
