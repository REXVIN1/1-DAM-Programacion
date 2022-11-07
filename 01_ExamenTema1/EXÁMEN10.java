
package exámen10;

import java.util.Scanner;

public class EXÁMEN10 {

    public static void main(String[] args) {

        System.out.println("Introduzca el primer número");
        int n1 = new Scanner(System.in).nextInt();
        System.out.println("Introduzca el segundo");
        int n2 = new Scanner(System.in).nextInt();
        System.out.println("Introduzca el tercero");
        int n3 = new Scanner(System.in).nextInt();
        
        if (n1 > n2 && n1 > n3){
            System.out.println("El primer número es mayor");
        }
        
        if (n2 > n1 && n2 > n3){
            System.out.println("El segundo número es mayor");
        }
        
        if (n3 > n1 && n3 > n2){
            System.out.println("El tercer número es mayor");
        }
        
        if (n1 == n2 && n1 == n3){
            System.out.println("Los tres números son iguales");
        }
    }
    
}