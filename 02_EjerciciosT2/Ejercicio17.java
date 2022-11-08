/*
 */
package ejercicio17;
import java.util.*;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 17 : Como ya sabes, una dirección de correo tiene el formato nombre@dominio.\n" +
"Realiza un programa que pregunte al usuario su nombre y después su dominio. En caso de que\n" +
"el dominio termine en .com o .es, el programa el programa formará una nueva variable\n" +
"llamada “correo” a partir de ellos y la mostrará por pantalla. En caso contrario, mostrará un\n" +
"mensaje de error “El dominio es incorrecto”."+"\n");
        
        System.out.println("¿Cuál es su nombre?");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("¿Cuál es tu dominio?");
        String dominio = new Scanner(System.in).nextLine();
        
        boolean permitir = dominio.endsWith(".com");
        
        if (permitir==true){
            System.out.println("\n"+"Tu correo es: "+nombre+"@"+dominio);
        }else{
            System.out.println("\n"+"\u001B[31m"+"El dominio es incorrecto");
        }
        
        
    }
    
}
