
package exámen09;
import java.util.*;

public class EXÁMEN09 {

    public static void main(String[] args) {
        System.out.println("9. Realiza un programa que pregunte un número comprendido entre 10 y 56 por teclado al \n" +
"usuario. Si el número está en dicho rango, el programa mostrará un mensaje de que es \n" +
"correcto, y en caso contrario, se indicará que no lo es."+"\n");
        
        System.out.println("Introduzca un númeor comprendido entre 10 y 56: ");
       
        System.out.println("");
       int v1 = new Scanner(System.in).nextInt();
       
       if(v1>=10 && v1<=56){
           System.out.println("Enhorabuena");
       }else{
           System.out.println("prueba otra vez");
       }
    }
    
}
