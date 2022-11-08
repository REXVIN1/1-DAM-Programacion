/*
 */
package ejercicio18;
import java.util.*;
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
        
        int posicion = correo.indexOf("@");
        int caracteres = correo.length();
        
        String substract1 = correo.substring(0, posicion);
        String substract2 = correo.substring(posicion+1, caracteres);
        
        System.out.println("-Tu nombre de usuario es: "+substract1);
        System.out.println(".Tu dominio es: "+substract2);
    }
    
}
