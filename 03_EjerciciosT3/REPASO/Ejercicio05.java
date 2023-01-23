

package ejercicio05;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio05 {

    public static void main(String[] args) {
        int x=0, y=1;
        String numeros =  "";
        
        for(int i=0;i<50;i++){
            numeros += +x+","+y+",";            
            x = x+y;
            y = x+y;
        }
        System.out.println(numeros);
    }
}
