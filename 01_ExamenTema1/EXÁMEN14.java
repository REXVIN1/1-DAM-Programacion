
package EXÁMEN14;

import java.util.Scanner;


public class EXÁMEN14 {


    public static void main(String[] args) {
        System.out.println("Introduzca el dinero");
        int dinero = new Scanner(System.in).nextInt();
        
        int op = dinero / 500;
        int r2 = dinero % 500;
        
        int r3 = r2 / 100;
        int r4 = r2 % 100;
        
        int r5 = r4 / 50;
        int r6 = r4 % 50;
    
        int r7 = r6 / 20;
        int r8 = r6 % 20;
        
        int r9 = r8 / 10;
        int r10 = r8 % 10;
        
        int r11 = r10 / 2;
        int r12 = r10 % 2;
        
        System.out.println("En billetes de 500: "+op);
        System.out.println("En billetes de 100: "+r3);
        System.out.println("En billetes de 50: "+r5);
        System.out.println("En billetes de 20: "+r7);
        System.out.println("En billetes de 10: "+r9);
        System.out.println("En billetes de 2: "+r11);
        System.out.println("En billetes de 1: "+r12);
    }
    
}