

package ejercicio05;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio05 {

    public static void main(String[] args) {
        
        int x=0, y=1;
        String numeros = "";
        
        while(y<=50){
            numeros = numeros +x+" "+y+" ";            
            x=x+y;
            y=x+y;
        }
        System.out.println("Numeros Fibonacci: "+numeros);
    }
}
