


package ejercicio03;

import java.util.Random;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/
public class Ejercicio03 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 3: Realiza un programa que genere números "
                + "enteros aleatorios entre 0 y 10 y los muestre por pantalla. "
                + "El programa terminará cuando el número generado sea el 10.\n");
        
        Random r = new Random();  
        double n; 
        int n2;
        do{            
            n = r.nextInt(0, 11);
            n2 = (int) n;
            System.out.println("Número random: "+n2);
        }while(n2!=10);
    }

}
