
package ejercicio52;
import java.util.HashMap;
import java.util.Scanner;

/*@author usuario-mañana*/

public class Ejercicio52 {

    /*@param args the command line arguments*/
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 52 : En este ejercicio vamos a guardar las asociaciones entre la matrícula de un coche\n" +
"y el color de dicho coche. Consulta la documentación de la interfaz Map<K,V>, la clase\n" +
"HashMap<K,V> y la clase Color del paquete java.awt y haz un programa que haga esto:\n");
        
        System.out.println("\na) Crea un Map<String,Color> y rellenarlo con un HashMap<String,Color> vacío");
        
        HashMap hm = new HashMap();
        
        System.out.println("\nb) Añade al objeto creado en el apartado anterior estas asociaciones:");
        hm.put("12535ABC","Color rojo");
        hm.put("98525KWX","Color amarillo");
        hm.put("17632MSE","Color verde");
        hm.put("85321ABC","Color amarillo");
        
        System.out.println(hm);
        
        System.out.println("\nc) Muestra en pantalla el tamaño del map"); 
        System.out.println("Tamaño: "+hm.size());
        
        System.out.println("\nd) Llama al método toString del map y muestra lo que produce por pantalla");
        System.out.println("Método toString: "+hm.toString());
        
        System.out.println("\ne) Muestra en pantalla el color del coche cuya matrícula se introduce por teclado. En\n" +
"caso de introducir una matrícula que no esté en el map, se mostrará el mensaje “No\n" +
"existe esa matrícula”");
        
        System.out.println("\nIntroduzca el código:");
        String n = new Scanner(System.in).nextLine();     
        
        boolean b = n.equals("12535ABC")||n.equals("98525KWX")||n.equals("17632MSE")||n.equals("85321ABC");
        while(b==false){
            System.out.println("\nPor favor introduzca una matrícula existente");
            System.out.println("\nIntroduzca el código:");
            n = new Scanner(System.in).nextLine();
            b = n.equals("12535ABC")||n.equals("98525KWX")||n.equals("17632MSE")||n.equals("85321ABC");
        }
        System.out.println("\n"+hm.get(n)); 
        
    }
    
}
