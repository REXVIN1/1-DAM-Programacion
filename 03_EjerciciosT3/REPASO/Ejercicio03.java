
package ejercicio03;

import java.util.Scanner;

/*@author usuario-mañana*/

public class Ejercicio03 {

    public static void main(String[] args) {
        String producto, r;
        int total=0, productos=0;
        double precio;
        boolean b=true, b1=true;
        while(b){
            System.out.println("Introduzca un producto:");
            producto = new Scanner(System.in).nextLine();
            productos = productos+1;

            System.out.println("Introduzca un precio:");
            precio = new Scanner(System.in).nextDouble();
            total = total+1;
            
            while(b1){
                System.out.println("Desea introducir mas productos:");
                r = new Scanner(System.in).nextLine();

                if(r.equalsIgnoreCase("si")){
                    b1=false;                     
                }if(r.equalsIgnoreCase("no")){
                    b1=false;
                    b=false;
                }else{
                    System.out.println("Por favor introduzca un valor adecuado (si/no)");
                }             
            }            
            System.out.println("\nImporte total: "+total+"\nProductos: "+productos);
        }
    } 
}
