
package ejercicio38;
import java.lang.*;
import java.math.*;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio38 {

    /*@param args the command line arguments*/
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 38 : Haz un programa que calcule las dos soluciones de la ecuación x^2 − 5x + 6\n");
                
        int a=1,b=5
        
        double r1 = (-5+Math.sqrt(Math.pow(-5, 2)-4*1*6))/2*1;
        double r2 = (-5-Math.sqrt(Math.pow(-5, 2)-4*1*6))/2*1;
        
        System.out.println("Resultado:");
        System.out.println("x = "+r1+" y x = "+r2);
        
    }

}
