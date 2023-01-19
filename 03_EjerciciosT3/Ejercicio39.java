
package ejercicio39;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio39 {

    public static void main(String[] args) {
        String nombres[] = {"Pepe", "Ana", "Juan", "Guillermo", "Roberta"};
        int notas[][] = {{9,5,4,3},{4,8,6,5},{2,5,10,2},{0,0,5,0},{10,10,10,9}};
        int total = 0;
        
        for(int i=0;i<5;i++){          
            for(int x=0;x<5;x++, i++){
                System.out.println("\nAlumno: "+nombres[i]);
                for(int e=0;e<4;e++){
                    System.out.println("Nota "+(e+1)+": "+notas[x][e]);
                    total = total + notas[x][e];
                }
                System.out.println("Media: "+(total/4));
                total = 0;
            }            
        }
    }
}
