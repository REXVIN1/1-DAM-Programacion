/*
 */
package ejercicio23;
import bpc.daw.objetos.*;
import java.util.*;
/**
 *
 * @author Kevin Gómez <kgomval118@g.educaand.es>
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 23 : Haz un programa que cree una tarjeta de crédito con contraseña 2222 y saldo\n" +
"1000€. Mostrar la información de la cuenta por pantalla. Ingresar 100 € y volver a mostrar la\n" +
"información. Retirar 2800 € de ella y volver a mostrar la información.\n");
        
        int contraseña = 2222;
        
        TarjetaCredito c1 = new TarjetaCredito(1000,contraseña);
                        
        System.out.println("Introduzca la contraseña: ");
        int acceso = new Scanner(System.in).nextInt();
        
        try{
            System.out.println("Cuánto desea ingresar: ");
            int cantidad = new Scanner(System.in).nextInt();
            
            c1.ingresarDinero(cantidad);
            System.out.println("Saldo: "+c1.getSaldo(acceso));
        }catch(Exception contraseña_aceptada){
            System.out.println("\nError: "+contraseña_aceptada.getMessage());
        }
        
        System.out.println("\nIntroduzca la contraseña: ");
        int acceso2 = new Scanner(System.in).nextInt();
        
        try{
            System.out.println("Cuánto desea retirar: ");
            int cantidad = new Scanner(System.in).nextInt();
            
            c1.sacarDinero(cantidad, acceso2);
            System.out.println("Saldo: "+c1.getSaldo(acceso2));
        }catch(Exception contraseña_aceptada2){
            System.out.println("\nError: "+contraseña_aceptada2.getMessage());
        }
    }
    
}
