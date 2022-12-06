/*
 */
package ejercicio18;
import java.util.Scanner;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 18 : Haz un programa que pregunte al usuario por su dirección de correo y la\n" +
"descomponga en su nombre de usuario y su dominio."+"\n");
        
        System.out.println("¿Cuál es su correo?");
        String correo = new Scanner(System.in).nextLine();
        
        int arroba = correo.indexOf("@");
        String nombre = correo.substring(0, arroba);
        String dominio = correo.substring(arroba+1, correo.length());
        
        System.out.println("-Tu nombre de usuario es: "+nombre);
        System.out.println("-Tu dominio es: "+dominio);
    }
    
}
