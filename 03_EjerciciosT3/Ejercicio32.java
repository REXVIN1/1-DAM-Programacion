
package ejercicio32;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio32 {

    public static void main(String[] args) {
        int suma = 0, n;
        
        for(int i=5;i<=13;i++){            
            n = (int)Math.pow(i, 2);
            suma = suma + n;
        }
        System.out.println(suma);
    }
}
