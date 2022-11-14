/*
 */
package ejercicio26;
import java.util.*;
/**
 *
 * @author Kevin Gómez <kgomval118@g.educaand.es>
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 26 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase Thread. Realiza\n" +
"un programa que pregunte al usuario “¿cuántos segundos quiere esperar?”. El usuario\n" +
"escribirá un número entero y el programa hará una pausa de dicha cantidad de segundos.\n" +
"Pasado ese tiempo se mostrará el mensaje “Programa finalizado”.\n");
        
        System.out.println("¿Cuántos segundos quiere esperar?");
        int segundos = new Scanner(System.in).nextInt();
        int segundos2 = segundos*1000;
        
        try{
            Thread tread = new Thread();
            tread.sleep(segundos2);
        }catch(Exception problema){
            System.out.println("Ha surgido un problema");
        }  
        System.out.println("\nSe ha completado");
    }    
}
