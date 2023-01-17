
package ejercicio09;

import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio09 {
    public static void main(String[] args) { 
        
    //REVISAR

        double n;
        double s = 1,a = 1;
        boolean b = false;
        System.out.println("Escriba un número positivo:");
        try{
            n = new Scanner(System.in).nextInt();              
            do{ 
                s = (1/2)*(a+(Math.abs(n)/a));
                if((Math.abs(s-a))<0.000001){
                    System.out.println("La raiz cuadrada aproximada es: "+s);
                    b = true;
                }else{
                    a=s;
                    System.out.println("op");
                }            
            }while(b);         
        }catch(Exception ex){
            System.out.println("Introduzca un numero y positivo: "+ex.getMessage());
        }
    }
}
