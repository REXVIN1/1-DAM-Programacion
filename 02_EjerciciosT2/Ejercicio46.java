/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio46;
import java.lang.*;
import java.time.*;

/**
 *
 * @author usuario-mañana
 */
public class Ejercicio46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 46 : Consulta la “Librería estándar de Java” y busca las clases Thread y Random. Haz\n" +
"un programa que haga una pausa de una cantidad aleatoria de segundos entre 0 y 10.\n" +
"Consulta ahora el pdf de la librería “java time” y busca las clases Instant y Duration. Obtén un\n" +
"objeto Instant antes de que empiece la pausa y luego otro objeto Instant cuando la pausa\n" +
"termine. A partir de dichos dos objetos, obtén un objeto Duration y úsalo para mostrar\n" +
"cuántos segundos ha durado la pausa.\n");
        
        try{
            Instant i1 = Instant.now();
            double n1 = 0 + (10-0)*Math.random();
            int n2 = (int) n1;
            Thread.sleep(n2);
            Instant i2 = Instant.now();
            
            System.out.println(Duration.between(i1, i2));
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
    }
    
}
