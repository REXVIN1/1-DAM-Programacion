/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio41;

/**
 *
 * @author usuario-mañana
 */
public class Ejercicio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 41 : Haz un programa que calcule el valor de (0.38*4.93)-0.36 y lo muestre por pantalla.\n" +
"Redondea el resultado al entero más cercano y muéstralo también por pantalla.\n");
        
        double a = 0.38, b = 4.93, c = -0.36;
        double op = Math.pow((a*b), c);
        System.out.println("Resultado: "+op);        
        System.out.println("Resultado redondeado: "+Math.round(op));
    }
    
}
