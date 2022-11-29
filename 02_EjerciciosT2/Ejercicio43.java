/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio43;
import java.text.*;
import java.util.Locale;

/**
 *
 * @author usuario-mañana
 */
public class Ejercicio43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 43 : Consulta el pdf de la “Librería Estándar de Java” y busca las clases Math y\n" +
"NumberFormat. Haz un programa que calcule el valor del número pi usando la siguiente\n" +
"fórmula: π = 4 ∗ arc tg(1) y muestre el valor usando 4 cifras decimales.\n");
        
        double pi = 4*Math.atan(1);
        String r2;
        
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(4);
        r2 = nf.format(pi); 
        
        System.out.println("El resultado es: "+r2);
    }
    
}
