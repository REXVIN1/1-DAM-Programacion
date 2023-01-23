
package ejercicio06;
import java.util.ArrayList;
import java.util.List;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio06 {

    public static void main(String[] args) {
        List<String> numeros = new ArrayList<>();        
        
        for(int i=1;i<101;i++){
            if(i%3==0&&i%5==0){
                numeros.add("tres-cinco");
            }else{
                if(i%3==0){ 
                    numeros.add("tres");
                }else{
                    if(i%5==0){
                        numeros.add("cinco");
                    }else{                       
                        numeros.add(Integer.toString(i));
                    }                    
                }                
            }
        }
        System.out.println(numeros);
    }
}
