
package ejercicio06;
import java.util.ArrayList;
import java.util.List;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio06 {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        
        for(int i=1;i<=100;i++){
            if(i%3!=0){
                a.add(i);
            }            
        }
        System.out.println(a);
        a.clear();
        
        for(int x=1;x<=100;x++){
            if(x%5!=0){
                a.add(x);
            }            
        }
        System.out.println(a);
        a.clear();
        
        for(int x=1;x<=100;x++){
            if(x%5!=0&&x%3!=0){
                a.add(x);
            }            
        }
        System.out.println(a);
    }
}
