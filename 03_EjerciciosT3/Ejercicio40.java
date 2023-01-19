
package ejercicio40;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio40 {

    public static void main(String[] args) {
        String dias[] = {"lunes","martes","miércoles","jueves","viernes"};
        String horas[][] = {
            {"16:00-15:00","Sistemas Informaticos","Lenguaje de Marcas","Lenguaje de Marcas","Base de Datos","Programacion"},
            {"17:00-18:00","Sistemas Informaticos","Programacion","Ingles","Base de Datos","Programacion"},
            {"18:00-18:45","Sistemas Informaticos","Programacion","Ingles","Base de Datos","FOL"},
            {"19:00-20:00","Programacion","Base de Datos","FOL","Entorno de Desarrollo","FOL"},
            {"20:00-21:00","Programacion","Base de Datos","Lenguaje de Marcas","Entorno de Desarrollo","Sistemas Informaticos"},
            {"21:00-22:00","Programacion","Base de Datos","Lenguaje de Marcas","Entorno de Desarrollo","Sistemas Informaticos"}
        };
        String dia;
        int x = 0;
        
        System.out.println("Escriba un dia de la semana:");
        dia = new Scanner(System.in).nextLine();
        
        for(int e=0;e<dias.length;e++){
            if(dia.toLowerCase().equalsIgnoreCase(dias[e])==true){
                x = e;
            }
        }                                    
        for(int i=0;i<6;i++){
            System.out.println(horas[i][0]+" "+horas[i][x+1]);
        }
    }
}
