/*
 */
package ejercicio16;
import java.util.Scanner;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 15 : Haz un programa en el que haya una variable String llamada “clave” con el texto\n" +
"que tú quieras. A continuación, el programa pedirá que introduzcas una contraseña por\n" +
"teclado. El ordenador mostrará si la variable “clave” coincide con la contraseña introducida."+"\n");
        
        String clave = "contraseña";
        System.out.println("----------------------------");
        System.out.println("Escriba la contraseña:");
        String contraseña = new Scanner(System.in).nextLine();
        
        boolean coincide = contraseña.equals(clave);
        
        while(coincide==false){
            System.out.println("La contraseña es incorrecta");
            System.out.println("----------------------------");
            System.out.println("\n----------------------------");
            System.out.println("Escriba la contraseña:");
            contraseña = new Scanner(System.in).nextLine();
            coincide = contraseña.equals(clave);
        }
        System.out.println("La contraseña coincide");
        System.out.println("----------------------------");
        
    }
    
}
