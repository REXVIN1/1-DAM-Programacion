
package exámen12;
import java.util.*;

public class EXÁMEN12 {


    public static void main(String[] args) {
        System.out.println("12. Escribe un programa que le pida al usuario su edad y muestre por pantalla un mensaje \n" +
"diciendo si es menor o mayor de edad. Debes usar un if corto."+"\n");
        
        int edad = new Scanner(System.in).nextInt();
        
        boolean mayor = edad>=18 ? true:false;
        
        if (mayor=true){
            System.out.println("\n"+"Es mayor de edad");
        }else{
            System.out.println("\n"+"Es menor de edad");
        }
        
        System.out.println("Mayor de edad: "+mayor);
            
    }
    
}

