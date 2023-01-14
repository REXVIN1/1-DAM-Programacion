


package ejercicio04;

import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 4: Realiza un programa que pregunte al "
                + "usuario '¿Eres mayor de edad (si/no)?'. Si el usuario escribe"
                + " 'Si', el ordenador mostrará un mensaje 'El usuario es mayor "
                + "de edad'. Si el usuario escribe 'No', el ordenador mostrará "
                + "'El usuario es menor de edad'. Si el usuario escribe cualquier "
                + "otra cosa, el ordenador mostrará 'No te entiendo' y volverá a "
                + "hacer la pregunta hasta que el usuario escriba lo correcto.\n");
        
        String r1;
        
        do{
            System.out.println("\n¿Eres mayor de edad?");
            r1 = new Scanner(System.in).nextLine();
            if(r1.equalsIgnoreCase("si")){
                System.out.println("El usuario es mayor de edad");
            }else if(r1.equalsIgnoreCase("no")){
                System.out.println("El usuario es menor de edad");
            }else{
                System.out.println("No te entiendo");
            }
        }while(!r1.equalsIgnoreCase("si")&&!r1.equalsIgnoreCase("no"));
        
        
        
        
    }

}
