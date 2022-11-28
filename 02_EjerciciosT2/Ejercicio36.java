
package ejercicio36;
import java.lang.*;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio36 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 36 : En la “Librería Estándar de Java” está la clase Math, que sirve para realizar\n" +
"cálculos matemáticos. Consulta su documentación y calcula:\n");
        
        System.out.println("a. La raíz cuadrada de 150");
        double r1 = Math.pow(150,2);
        System.out.println("Resultado: "+r1);
        
        System.out.println("\nb. 2 elevado a 9, y se divide entre el logaritmo neperiano de 6");
        double r2 = (Math.pow(9, 2))/Math.log(6);
        System.out.println("Resultado: "+r2);
        
        System.out.println("\nc. Coseno de 0.16 radianes.");
        double r3 = Math.cos(Math.toDegrees(0.16));
        System.out.println("Respuesta: "+r3);
        
        System.out.println("\nd. Seno de 45 grados (utiliza la clase Math para pasar de grados a radianes)");
        double r4 = (Math.sin(Math.toRadians(45)));
        System.out.println("Respuesta: "+r4);
    }

}
