/*
 */
package ejercicio08;

import java.util.Scanner;

/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Se lee una cadena con el nombre completo de una persona (nombre(s), primer apellido y segundo apellido) y se imprime una cadena con los apellidos y la(s) inicial(es) del nombre. Ej. 'Jose Luis Siqueira Recio' se imprime como 'Siqueira Recio, J.L.'"+"\n");
        
        String cadena = new Scanner(System.in).nextLine();
        //"Kevin Gomez Valderas Puertas";
        
        String[] fragmento = cadena.split(" ");
        
        String apellido2 = fragmento[2];
        String apellido2_m = apellido2.toUpperCase();
        char letra1 = apellido2_m.charAt(0);
        
        String apellido3 = fragmento[3];
        String apellido3_m = apellido3.toUpperCase();
        char letra2 = apellido3_m.charAt(0);
        
        String nombre = fragmento[0];
        String nombre_cortado = nombre.substring(1);
        String nombre_m = nombre.toUpperCase();     
        char letra3 = nombre_m.charAt(0);
        
        String apellido1 = fragmento[1];
        String apellido1_cortado = apellido1.substring(1);
        String apellido1_m = apellido1.toUpperCase();     
        char letra4 = apellido1_m.charAt(0);
        
        System.out.println(letra3+nombre_cortado+" "+letra4+apellido1_cortado+","+letra1+"."+letra2+".");
    }
    
}
