/*
 */
package ejercicio22;
import bpc.daw.objetos.*;
import java.util.*;
/**
 *
 * @author Kevin Gómez <kgomval118@g.educaand.es>
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 22 : En la librería ObjetosSencillos.jar se encuentra la clase TarjetaCrédito. Haz un\n" +
"programa que cree una tarjeta de crédito con contraseña 1111 y saldo 5000€. Mostrar la\n" +
"información de la cuenta por pantalla. Sacar 2000 € y volver a mostrar la información.\n");
        
        int contraseña = 1111;        
        TarjetaCredito c1 = new TarjetaCredito(5000,contraseña);
        
        System.out.println("Introduzca contraseña para obtener saldo:");
        int acceder = new Scanner(System.in).nextInt();
        
        try{
            System.out.println("Saldo: "+c1.getSaldo(acceder));
        }catch(Exception saldo){
            System.out.println("\nIntroduzca la contraseña correcta");
        }  
        
        System.out.println("\nIntroduzca la contraseña para sacar dinero:");
        int acceder2 = new Scanner(System.in).nextInt();
        
        try{
            System.out.println("¿Cuánto dinero quiere sacar?");
            int cantidad = new Scanner(System.in).nextInt();
            c1.sacarDinero(cantidad, contraseña); 
            System.out.println("Saldo: "+c1.getSaldo(acceder2));    
        }catch(Exception saldo_final){
            System.out.println("Introduzca la contraseña correcta");
        }
        
            
        
        
        
        
        
        
    }
    
}
