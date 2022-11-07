
package exámen03;
import java.util.*;

public class EXÁMEN03 {


    public static void main(String[] args) {
        System.out.println("3. Haz un programa que pregunte al usuario tres números enteros y guárdalos en variables \n" +
"llamadas horas, minutos y segundos. El programa mostrará el número total de segundos \n" +
"que hay juntando las cantidades de tiempo expresadas en las tres variables."+"\n");
        
        System.out.println("Escriba tres números enteros: (horas, minutos, segundos)");
        int horas = new Scanner(System.in).nextInt();
        int minutos = new Scanner(System.in).nextInt();
        int segundos = new Scanner(System.in).nextInt();
        
        int horas1 = horas*3600;
        int minutos1 = minutos*60;
        int total = horas1+minutos1+segundos;
        
        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+segundos);
        
        System.out.println("Total de segundos: "+total);
        
    }
    
}
