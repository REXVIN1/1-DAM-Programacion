/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio44;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author usuario-mañana
 */
public class Ejercicio44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 44 : Consulta el pdf de la librería “java time” y busca las clases LocalDate y\n" +
"DateTimeFormatter. Haz un programa que muestre por pantalla la fecha actual en formato\n" +
"día/mes/año y después en formato día-mes-año.\n");
        
        LocalDate hoy = LocalDate.now();
        
        String f1;
        
        System.out.println("Fecha 1:");
        f1 = hoy.format(DateTimeFormatter.ofPattern("dd/MM/yyy"));
        System.out.println(f1);
        
        System.out.println("\nFecha 2:");
        f1 = hoy.format(DateTimeFormatter.ofPattern("dd-MM-yyy"));
        System.out.println(f1);       
    }
    
}
