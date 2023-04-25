
package tema5.ejercicio30_31_32.programa;

import java.util.Scanner;
import tema5.ejercicio30_31_32.clases.EfectoEspecial;
import tema5.ejercicio30_31_32.clases.Simetrico;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Programaa {

    public static void main(String[] args) {
        boolean b = true;
        while(b){
            System.out.println("Escriba una frase:");
            String frase = new Scanner(System.in).nextLine();
            
            System.out.println("1) Aplicar todos los efectos a la frase");
            System.out.println("2) Aplicar solo los efectos simétricos");
            int n = new Scanner(System.in).nextInt();
            
            if(n==1){
                for(EfectoEspecial ef : EfectoEspecial.EFECTOS){
                    frase = ef.aplicarEfecto(frase);
                }
                System.out.println(frase);
            }if(n==2){
                for(EfectoEspecial ef : EfectoEspecial.EFECTOS){
                    if(ef instanceof Simetrico){
                        frase = ef.aplicarEfecto(frase);
                    }
                }
                System.out.println(frase);
            }else{
                System.out.println("Por favor, elija una opcion correcta.");
            }
        }
    }
}
