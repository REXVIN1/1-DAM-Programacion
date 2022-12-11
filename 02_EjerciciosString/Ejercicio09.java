/*
 */
package ejercicio09;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Se deben leer dos cadenas y comprobar si una cadena es anagrama( tienen las mismas letras pero en distinto nombre) de la otra.\n");
        
        //OPCIÓN 1--------------------------------------------
        
        System.out.println("Introduzca dos cadenas anagramas: ");
        String f1 = new Scanner(System.in).nextLine();
        String f2 = new Scanner(System.in).nextLine();
        f1 = f1.replaceAll("\\s+", "").toLowerCase();
        f2 = f2.replaceAll("\\s+", "").toLowerCase();
        
        System.out.println("\nCadena 1: "+f1);
        System.out.println("Cadena 2: "+f2);
        while(f1.length()!=f2.length()){
            System.out.println("Para ser anagrama tiene que tener el mismo numero de letras");
            System.out.println("\nIntroduzca dos frases anagramas (con la misma longitud): ");
            f1 = new Scanner(System.in).nextLine();
            f2 = new Scanner(System.in).nextLine();
            f1 = f1.replaceAll("\\s+", "").toLowerCase();
            f2 = f2.replaceAll("\\s+", "").toLowerCase();
        }
        int i = 0, e= 0, letra = 0;
        while(i<f1.length()){
            while(e<f2.length()){
                boolean b = f1.charAt(i)==f2.charAt(e);
                if(b==false){
                    e++;
                }if(b==true){
                    letra++;
                    e=f2.length();
                }  
            }
            e=0;
            i++;       
        }
        if(letra==f1.length()||letra==f2.length()){
            System.out.println("\nLas cadenas son anagramas");
        }else{
            System.out.println("\nLas cadenas son anagramas");
        }
        
        //OPCIÓN2--------------------------------------------
        
        System.out.println("Introduzca cadena1:");
        String cadena1 = new Scanner(System.in).nextLine();
        System.out.println("Introduzca cadena2:");
        String cadena2 = new Scanner(System.in).nextLine();
           
        char[] cadena_array1 = cadena1.toCharArray();
        Arrays.sort(cadena_array1);
        String cadena1_ordenada = new String(cadena_array1);
        System.out.println("\nCadena1 ordenada: "+cadena1_ordenada);
           
        char[] cadena_array2 = cadena2.toCharArray();
        Arrays.sort(cadena_array2);
        String cadena2_ordenada = new String(cadena_array2);
        System.out.println("Cadena2 ordenada: "+cadena2_ordenada);
           
        if(cadena1_ordenada==cadena2_ordenada){
            System.out.println("\nSon anagramas");
        }else{
            System.out.println("\nNo son anagramas");
        }
    }
    
}
