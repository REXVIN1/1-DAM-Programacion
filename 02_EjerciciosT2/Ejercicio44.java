
package ejercicio44;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio44 {

    /*@param args the command line arguments*/
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 44 : Consulta el pdf de la librería “java time” y busca las clases LocalDate y\n" +
"DateTimeFormatter. Haz un programa que muestre por pantalla la fecha actual en formato\n" +
"día/mes/año y después en formato día-mes-año.\n");
        
        LocalDate hoy = LocalDate.now();
        
        System.out.println("Fecha 1:");
        System.out.println(hoy.format(DateTimeFormatter.ofPattern("dd/MM/yyy")));
        
        System.out.println("\nFecha 2:");
        System.out.println(hoy.format(DateTimeFormatter.ofPattern("dd-MM-yyy")));       
    }
    
}
