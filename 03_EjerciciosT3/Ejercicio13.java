


package ejercicio13;
import static java.lang.Double.isNaN;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio13 {

    public static void main(String[] args) {
        int mes, año, lista[]={29,31,28,31,30,31,30,31,31,30,31,30,31}, dia = 1, dias_mes = 0, i = 1, x = 0;
        LocalDate fecha;
        boolean b = true;
        
        while(b){
            try {
                System.out.println("\nEcriba un numero de mes (1-12):");
                mes = new Scanner(System.in).nextInt();
                System.out.println("Escriba numero del año:");
                año = new Scanner(System.in).nextInt();
                while(mes!=i){
                    i++;
                }
                dias_mes = lista[i]; 
                while(dia<=dias_mes){
                    fecha = LocalDate.of(año, mes, dia);

                    if(lista[i]==28&&fecha.isLeapYear()==true){
                        dias_mes=29;
                    }
                    System.out.println(fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyy"))+" "+fecha.getDayOfWeek());
                    dia++;
                }
                b=false;
            } catch (Exception ex) {
                System.out.println("Escriba un numero: " + ex.getMessage());
            }
        }                 
    }
}
