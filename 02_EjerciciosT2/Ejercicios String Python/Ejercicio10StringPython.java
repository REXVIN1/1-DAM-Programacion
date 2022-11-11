/*
 */
package ejercicio10.string.python;
import java.util.*;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio10StringPython {

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
                
        Scanner lector=new Scanner(System.in);
        String cadena="";
        char[] Arraycadena;
        char caracter;
        int contador=0;
        System.out.println("Introduzca cadena: ");
        cadena = lector.nextLine();
        Arraycadena = cadena.toCharArray();
        for (int i = 0; i < Arraycadena.length; i++){
            caracter = Arraycadena[i];
            for(int j = 0; j <  Arraycadena.length; j++){
                if(Arraycadena[j]==caracter){
                    contador++;
                }
            }
            System.out.println(Arraycadena[i]+" "+contador);
            contador = 0;
        }
    }
    
}
