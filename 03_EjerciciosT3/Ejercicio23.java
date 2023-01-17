
package ejercicio23;
import java.util.ArrayList;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio23 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        boolean b = true, b2 = true;
        int r,mensaje,lista_cantidad;      
        String texto, mensaje2;
        
        while(b){
            try {                
                System.out.println("\n1. Añadir mensaje a la lista\n"
                        + "2. Consultar el número de mensajes de la lista\n"
                        + "3. Consultar mensaje\n4. Comprobar mensaje\n"
                        + "5. Consultar todos los mensajes\n6. Borrar toda la lista\n"
                        + "7. Salir\n\nEliga una opción:");
                r = new Scanner(System.in).nextInt();
                if(r==1){
                    System.out.println("\nEscriba un texto:");
                    texto = new Scanner(System.in).nextLine();
                    al.add(texto);
                    System.out.println("El texto se a añadido a la lista correctamente");
                }if(r==2){
                    System.out.println("Numero de elementos: "+(al.size()));
                }if(r==3){
                    lista_cantidad = al.size();
                    if(lista_cantidad==0){
                        System.out.println("No hay mensajes");
                    }else{
                        System.out.println("Eliga el mensaje que quiere consultar, eliga entre 1 y "+al.size()+":");
                        mensaje = new Scanner(System.in).nextInt();                    
                        if(mensaje<=lista_cantidad){
                            mensaje = mensaje-1;
                            System.out.println("Mensaje: "+al.get(mensaje));
                        }else{
                            System.out.println("Por favor, introduzca un valor dentro del rango");
                        }         
                    }
                }if(r==4){
                    System.out.println("Escriba un mensaje:");
                    mensaje2 = new Scanner(System.in).nextLine();
                    if(al.contains(mensaje2)==true){
                        System.out.println("Está en la lista\nMensaje: "+al.get(al.indexOf(mensaje2)));
                    }else{
                        System.out.println("No esta en la lista");                
                    }                  
                }if(r==5){
                    for(int x=0;x<al.size();x++){
                        System.out.println("El mensaje de la posicion "+(x+1)+" es "+al.get(x));
                    }
                }if(r==6){
                    break;
                }
            }catch(Exception e) {
                System.out.println("Escriba un valor adecuado: "+e.getMessage());
            }
        }        
    }
}
