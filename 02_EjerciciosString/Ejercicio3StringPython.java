/*
 */
package ejercicio3.string.python;
import java.util.*;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio3StringPython {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Traductor de latin. Dada una palabra si acaba en consonante, se le añade us si acaba en vocal, se suprime dicha vocal y se añade us. Ej. El diccionario, pasaría a Elus Diccionarius."+"\n");
        
        System.out.println("Traductor de latin"+"\n");
        System.out.println("Escriba palabra: ");
        String palabra = new Scanner(System.in).nextLine();
        
        String vocal1 = "a";
        String vocal2 = "e";
        String vocal3 = "i";
        String vocal4 = "o";
        String vocal5 = "u";
        
        int caracteres = palabra.length();
        int palabra_cortada = caracteres-1;
        String palabra_cortada1 = palabra.substring(0, palabra_cortada);
        
        boolean a = palabra.endsWith(vocal1);
        boolean e = palabra.endsWith(vocal2);
        boolean i = palabra.endsWith(vocal3);
        boolean o = palabra.endsWith(vocal4);
        boolean u = palabra.endsWith(vocal5);
        
        if(a==true||e==true||i==true||o==true||u==true){
            System.out.println("\n"+palabra_cortada1+"us");
        }else{
            System.out.println(palabra+"us");
        }
    }
    
}
