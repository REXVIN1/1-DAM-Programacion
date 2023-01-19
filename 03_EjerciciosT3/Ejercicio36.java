
package ejercicio36;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio36 {

    public static void main(String[] args) {
        char abecedario[] = {'a','b','c','d','e','f','g','h','i','j','k','l',
            'm','n','o','p','q','r','s','t','u','v','w','y','z'};
        char numeros[] ={'0','1','2','3','4','5','6','7','8','9'};
        String NIF, nif;
        boolean b = true;
        char n;
        int aparece = 0, aparece2 = 0;
        
        System.out.println("Escriba su NIF:");
        NIF = new Scanner(System.in).nextLine();
        nif = NIF.toLowerCase();
        if(nif.length()>9||nif.length()<9){
            System.out.println("Introduzca un NIF existente 1");
        }else{
            for(int i=0;i<8;i++){
                n = nif.charAt(i);
                for(int e=0;e<9;e++){
                    if(n==numeros[e]){
                        aparece = aparece + 1;                        
                    }
                }                                        
            }
            if(aparece==8){
                for(int e=0;e<=24;e++){
                    if(nif.charAt(8)==abecedario[e]){
                        aparece2 = aparece2 + 1;
                    }
                }
                if(aparece2==1){
                    System.out.println("Su NIF es correcto");
                    b=false;
                }else{
                    System.out.println("Introduzca un NIF existente 2");
                }
            }else{
                System.out.println("Introduzca un NIF existente 3");
                b=false;
            }                              
        }        
    }
}
