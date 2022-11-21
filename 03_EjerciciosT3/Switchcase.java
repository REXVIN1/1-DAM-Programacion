


package switchcase;
import java.util.*;
/*@author Kevin Gómez <kgomval118@g.educaand.es>*/
 
public class Switchcase {

    /*@param args the command line arguments*/
     
    public static void main(String[] args) {        
        
        try{ 
            
            System.out.println("Ejercicio Switch Case\n");
        
            System.out.println("Escriba el primer número: ");
            int n1 = new Scanner(System.in).nextInt();

            System.out.println("\nEscriba el segundo número: ");
            int n2 = new Scanner(System.in).nextInt();

            System.out.println("Escriba el tipo d eoperación (+,-,/,*)");
            String op = new Scanner(System.in).nextLine();

            switch(op){
                case "+":
                    int suma = n1+n2;
                    System.out.println("El resultado de la suma es: "+suma);
                    break;
                case "-":
                    int resta = n1-n2;
                    System.out.println("El resultado de la resta es: "+resta);
                    break;
                case "/":
                    int división = n1/n2;
                    System.out.println("\nEl resultado de la división es: "+división);
                    break;
                case "*":
                    int multiplicación = n1*n2;
                    System.out.println("El resultado de la multiplicación es: "+multiplicación);
                    break;
                default:
                    System.out.println("Escriba algo");
            }
        }catch(Exception error){
            System.out.println("\nOcurrió un error, porfavor introduzca lo indicado");
        }
    }

}
