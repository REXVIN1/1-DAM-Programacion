/*
 */
package ejercicio22;
import bpc.daw.objetos.TarjetaCredito;
import java.util.Scanner;
/**
 *
 * @author Kevin Gómez <kgomval118@g.educaand.es>
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("Ejercicio 22 : En la librería ObjetosSencillos.jar se encuentra la clase TarjetaCrédito. Haz un\n" +
                    "programa que cree una tarjeta de crédito con contraseña 1111 y saldo 5000€. Mostrar la\n" +
                    "información de la cuenta por pantalla. Sacar 2000 € y volver a mostrar la información.\n");
            
            int contraseña1 = 1111;
            TarjetaCredito t = new TarjetaCredito(5000,contraseña1);
            
            System.out.println("Introduzca la contraseña: ");
            int contraseña2 = new Scanner(System.in).nextInt();
            
            while(contraseña2!=contraseña1){
                System.out.println("Contraseña incorrecta");
                System.out.println("\nIntroduzca la contraseña: ");
                contraseña2 = new Scanner(System.in).nextInt();
            }
            System.out.println("\nSaldo: "+t.getSaldo(contraseña1));
            
            System.out.println("\n¿Desea sacar dinero?(s/n)");
            String respuesta = new Scanner(System.in).nextLine();
            
            while(respuesta.trim().equalsIgnoreCase("s")&&respuesta.trim().equalsIgnoreCase("n")){
                System.out.println("Por favor introduzca 's'(si) o 'n'(no)");
                System.out.println("\n¿Desea sacar dinero?(s/n)");
                respuesta = new Scanner(System.in).nextLine();
            }  
            
            if(respuesta.trim().equalsIgnoreCase("s")){
                System.out.println("\n¿Cuanta cantidad desea retirar?");
                int cantidad = new Scanner(System.in).nextInt();
                System.out.println("\nIntroduzca la contraseña");
                contraseña2 = new Scanner(System.in).nextInt();
                while(contraseña2!=contraseña1){
                    System.out.println("\nContraseña incorrecta");
                    System.out.println("\nIntroduzca la contraseña");
                    contraseña2 = new Scanner(System.in).nextInt();
                }
                t.sacarDinero(cantidad, contraseña2);
                System.out.println("\nSaldo final: "+t.getSaldo(contraseña2));
                System.out.println("\nGracias por contar con nosotros");
            }if(respuesta.trim().equalsIgnoreCase("n")){
                System.out.println("\nGracias por contar con nosotros");
            }
               
        } catch (Exception ex) {
            System.out.println("Error: "+ex.getMessage());;
        }
        
    }
    
}
