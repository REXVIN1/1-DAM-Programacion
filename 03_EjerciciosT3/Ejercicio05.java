


package ejercicio05;

import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 5: Según el reglamento de la federación "
                + "de caza, un cazador no puede cazar más piezas de las que se "
                + "permiten en un día. Queremos hacer un programa que nos lleve "
                + "la cuenta de piezas cazadas e indique cuando se ha excedido "
                + "el límite. Para ello primero se leerá por teclado el límite "
                + "del día y a continuación los valores de las piezas cazadas en "
                + "el orden que se obtienen. El programa imprimirá un mensaje en "
                + "el momento en que el límite haya sido excedido. Después de "
                + "que cada pieza ha sido registrada, el programa mostrará el "
                + "número total de piezas que se llevan hasta ese momento "
                + "cazadas. Ejemplo:\n");
        
        System.out.println("Escriba el límite por dia:");
        int limite = new Scanner(System.in).nextInt();
        
        System.out.println("\n---Empezamos la caza");
        
        int piezas;
        int cantidad = 0;
        do{
            System.out.println("--------------------------------------------");
            System.out.println("Introduzca el número de piezas cazadas");
            piezas = new Scanner(System.in).nextInt();
            cantidad = cantidad+piezas;
            System.out.println("Usted lleva cazadas "+cantidad+" piezas de "
                    + ""+limite+" posibles");
            System.out.println("--------------------------------------------\n");
            if(cantidad>limite){
                System.out.println("El numero máximo de piezas ha sido excedido");
                System.out.println("Pulse una tecla para finalizar");
                String string = new Scanner(System.in).nextLine();
                System.exit(1);
            }
            if(cantidad==limite){
                System.out.println("Ha alcanzado el bumero máximo");
                System.out.println("Pulse una tecla para finalizar");
                String string = new Scanner(System.in).nextLine();
                System.exit(1);
            }
        }while(cantidad<limite);
        
        
        
    }

}
