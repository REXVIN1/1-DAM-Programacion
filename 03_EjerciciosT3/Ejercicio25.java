
package ejercicio25;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio25 {

    public static void main(String[] args) {
        int lista[];
        int longitud = lista.length;
        
        for(int i=0;i<=5000;i++){
            lista[i] = 0;
        }
        for(int e=0;e<longitud;e+=2){
            lista[e] = 1;
        }
        for(int n=0;n<=longitud;n++){
            System.out.println("Elemento "+n+":");
        }
    }
}
