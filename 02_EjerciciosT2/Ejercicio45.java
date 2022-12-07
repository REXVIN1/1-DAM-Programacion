/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio45;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.Month;

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
        
        //Opción 1
        LocalDate hoy = LocalDate.of(2100, Month.FEBRUARY, 28);
        System.out.println(hoy.getDayOfWeek());
        
        //Opción 2
        DayOfWeek dia = DayOfWeek.from(hoy);
        System.out.println(dia);  
    }
    
}
