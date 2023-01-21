
package ejercicio04;

import java.util.Scanner;

/*@author usuario-mañana*/

public class Ejercicio04 {

    public static void main(String[] args) {
        int alumnos, total_trimestre=0, total_trimestres, total2;
        double nota_actividad, nota, nota2, total=0;
        
        System.out.println("¿Cuantos alumnos hay en la clase?");
        alumnos = new Scanner(System.in).nextInt();
        
        for(int x=0;x<alumnos;x++){
            System.out.println("---------------------------------------");
            System.out.println("\nALUMNO "+(x+1)+": ");
            System.out.println("Nota de las 4 actividades:");
            for(int e=0;e<3;e++){
                if(e==0){
                    System.out.println("Primer trimestre:");
                }if(e==1){
                    System.out.println("Segundo trimestre:");
                }if(e==2){
                    System.out.println("Tercer trimestre");
                }

                for(int i=0;i<4;i++){
                    nota_actividad = new Scanner(System.in).nextDouble();
                    total = total +nota_actividad;
                }
                total2 = (int)total;
                total_trimestre = total_trimestre+(total2/4);
                
                total=0;
            }
            total_trimestres = total_trimestre/3;
            total_trimestres = (total_trimestres*3)/3;
            System.out.println(total_trimestres);
            
            System.out.println("\nIntroduzca la nota del examen:");
            nota = new Scanner(System.in).nextDouble();                                    
            nota = (nota*3)/3;
            
            System.out.println("\nIntroduzca la nota de actitud:");
            nota2 = new Scanner(System.in).nextDouble();
            
            System.out.println("Media: "+((total_trimestres+nota+nota2)/3));
        }
    }    
}
