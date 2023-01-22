
package ejercicio04;

import java.util.Scanner;

/*@author usuario-mañana*/

public class Ejercicio04 {

    public static void main(String[] args) {
        int n;
        double a_nota, a_total=0, t_total=0, t_media, e_nota, e_media, c_nota, n_final;
        
        System.out.println("\nCuantos alumnos hay en el aula: ");
        n = new Scanner(System.in).nextInt();
        for(int y=1;y<=n;y++){
            System.out.println("-----------------------\nAlumno "+y+":");
            for(int i=1;i<4;i++){
                System.out.println("\nTrimestre "+(i)+":");

                for(int x=1;x<5;x++){
                    System.out.println("Actividad "+x+":");
                    a_nota = new Scanner(System.in).nextDouble();
                    a_total = a_total + a_nota;                
                }
                t_total = a_total/4;
            }
            t_media = ((t_total/3)*3)/3;

            System.out.println("\nNota del examen: ");
            e_nota = new Scanner(System.in).nextDouble();
            e_media = (e_nota*6)/6;

            System.out.println("\nNota de clase: ");
            c_nota = new Scanner(System.in).nextDouble();
            
            n_final = (t_media+e_media+c_nota)/3;
            System.out.println("\nMedia final: "+n_final);
            
            a_total = 0;
        }
    }    
}
