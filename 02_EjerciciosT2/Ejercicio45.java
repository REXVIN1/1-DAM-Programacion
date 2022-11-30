/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio45;
import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author usuario-mañana
 */
public class Ejercicio45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 45 : Consulta el pdf de la librería “java time” y busca las clases LocalDate y\n" +
"DayOfWeek. Haz un programa que muestre por pantalla el nombre del día de la semana que\n" +
"será el 28 de febrero de 2100.\n");
        
        LocalDate hoy = LocalDate.of(2100, Month.FEBRUARY, 28);
        
        System.out.println("El dia de la semana es: "+hoy.getDayOfWeek());
    }
    
}
