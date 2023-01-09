
package nombre;
import java.util.Scanner;

/*@author usuario-mañana*/

public class EjemploNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduzca 5 nombres: ");
        String nombre = new Scanner(System.in).nextLine();
        int n = 1;
        System.out.println("Nombre "+n+": ");        
        while(n!=5){
            nombre = new Scanner(System.in).nextLine();            
            n++;
            System.out.println("Nombre: "+n+": "+nombre);
        }
    }
    
}
