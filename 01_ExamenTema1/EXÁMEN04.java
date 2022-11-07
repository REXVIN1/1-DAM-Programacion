
package exámen04;
import java.util.*;

public class EXÁMEN04 {


    public static void main(String[] args) {
        System.out.println("4. Realiza un programa que pregunte al usuario la edad de dos personas. El programa\n" +
"mostrará si ambas son mayores de edad, y también si la primera persona es mayor que la \n" +
"segunda. (no puedes usar la estructura condicional if)."+"\n");
        
        System.out.println("Escriba la edad de dos personas: ");
        int edad1 = new Scanner(System.in).nextInt();
        int edad2 = new Scanner(System.in).nextInt();
        
        boolean mayor_edad = edad1>=18 && edad2>=18;
        boolean mayor_que = edad1>edad2;
        
        System.out.println("Son ambas mayores de edad: "+mayor_edad);
        System.out.println("¿Persona 1 mayor que la segunda?:  "+mayor_que);
        
        
    }
    
}
