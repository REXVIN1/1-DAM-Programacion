
package ejercicio24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio24 {

    public static void main(String[] args) {
        int n, dias=1;
        boolean b = true;
        ArrayList al = new ArrayList();
        LocalDate ld;
        String resultado;
        
        while(b){            
            System.out.println("\nEscriba un mes (1-12):");
            n = new Scanner(System.in).nextInt();
            
            if(n>12){
                System.out.println("Superaste el limte");
                break;
            }
            if(n==1||n==3||n==5||n==7||n==8||n==10||n==12){
                dias=31;
            }if(n==4||n==6||n==9||n==11){
                dias=30;
            }else{
                dias=28;
            }
            for(int i=1;i<=dias;i++){
                ld = LocalDate.of(2023, n, i);
                resultado = ld.toString()+"/"+ld.getDayOfWeek();
                al.add(resultado);
            }
            System.out.println("\nLISTA:\n"+al+"\nTamaño: "+al.size());
        }        
    }
}
