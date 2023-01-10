
package ejercicio11.pkg2;

import java.util.Scanner;

/*@author Kevin-Gómez-Valderas*/

public class Ejercicio11 {

    /*@param args the command line arguments*/
    
    public static void main(String[] args) {
        System.out.println("Escribe un programa que muestre en tres columnas, "
                + "el cuadrado y el cubo de los 5 primeros números enteros a partir "
                + "de uno que se introduce por teclado.");
        int n;
        try{
            n = new Scanner(System.in).nextInt();
            for(int i=n;i<=n+4;i++){
                System.out.println("\nNumero entero: "+n);
                System.out.println("Al cuadrado: "+Math.pow(n, 2));
                System.out.println("Al cubo: "+Math.pow(n, 3));
            }     
        }catch(NumberFormatException ex){
            System.out.println("Error: "+ex.getMessage());
        }

    }
    
}
