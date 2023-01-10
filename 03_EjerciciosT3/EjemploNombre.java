
package nombre;
import java.util.ArrayList;
import java.util.Scanner;

/*@author usuario-mañana*/

public class EjemploNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList al = new ArrayList();        
        int n = 1;
        System.out.println("Introduzca 5 nombres: ");        
        String nombre = new Scanner(System.in).nextLine();
        al.add(nombre);
        System.out.println("Nombre "+n+": "+nombre);    
        
        while(n!=5){
            nombre = new Scanner(System.in).nextLine();
            al.add(nombre);
            n++;
            System.out.println("Nombre: "+n+": "+nombre);
        }
        System.out.println("\nNombres: "+al);
    }
    
}
