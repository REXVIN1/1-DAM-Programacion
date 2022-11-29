/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio42;

/**
 *
 * @author usuario-mañana
 */
public class Ejercicio42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 42 : Realiza un programa que genere un número aleatorio comprendido entre 29 y 65\n" +
"y lo muestre por pantalla. Nota: Hay dos formas posibles de hacerlo: con la clase Math y con la\n" +
"clase Random de la “Librería Estándar de Java”. Mira las dos y elige la que te resulte más fácil.\n");
        
        int a=29,b=65;
        
        double n = a + (b-a)*Math.random();
        
        System.out.println("Número aleatorio: "+n);
    }
    
}
