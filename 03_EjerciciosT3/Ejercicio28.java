
package ejercicio28;

import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio28 {

    public static void main(String[] args) {
        String contraseña = "hola", contraseña2 = "";
        
        for(int i=0;i<=5&&!contraseña.equalsIgnoreCase(contraseña2)==true;i++){
            System.out.println("Escriba la contraseña ("+i+"/5):");
            contraseña2 = new Scanner(System.in).nextLine();
        }
        if(contraseña.equalsIgnoreCase(contraseña2)==true){
            System.out.println("Acceso permitido");
        }else{
            System.out.println("Acceso denegado");
        }
    }
}
