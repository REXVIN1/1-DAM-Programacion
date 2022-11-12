/*
 */
package ejercicio10;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Leer una cadena, y hacer una estadística sobre cuantas veces aparece cada caracter, mostrando el resultado de mayor a menor respetando la alineación a la derecha de los números. Por ejemplo, para \"nosotros no somos como los orozco, yo los conozco, son ocho los monos\", debería mostrar:\n" +
                            "\n" +
                            "o 23\n" +
                            "' ' 12\n" +
                            "s 9\n" +
                            "n 5\n" +
                            "c 5\n" +
                            "m 3\n" +
                            "l 3\n" +
                            "z 2\n" +
                            "r 2\n" +
                            ", 2\n" +
                            "y 1\n" +
                            "t 1\n" +
                            "h 1\n");
                
        System.out.println("Introduce una frase: ");
        String frase = new Scanner(System.in).nextLine();
        
        System.out.println("\n-----Letras-----\n");
        
        contarCaracteres(frase);
    }

    public static void contarCaracteres(String frase) {
        int y = 0;
        char [] abecedario = {',',' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        for(int x=0;x<abecedario.length;x++) {
            int contador = 0;
            for(y = 0;y<frase.length();y++) {
                if ((frase.charAt(y)==abecedario[x])){
                        contador++;                        
                }
                else if((frase.charAt(y)==abecedario[x] && y !=(abecedario[x]))) {
                    System.out.println("");
                }
            }
            if(contador>0){
                if(abecedario[x]==abecedario[0]){
                    System.out.println("Hay "+contador+" coma/s");                
                }else{
                    if(abecedario[x]==abecedario[1]){
                        System.out.println("Hay "+contador+" espacio/s");
                    }else{
                        System.out.println("Hay "+contador+" "+abecedario[x]);
                    }
                    
                }
                
            }
            
        }
        
        
    }
    
}
