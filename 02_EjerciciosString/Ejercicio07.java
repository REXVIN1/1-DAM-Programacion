/*
 */
package ejercicio7.string.python;
import java.util.Scanner;

/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio7StringPython {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduzca una cadena (máximo 6 caracteres):");
        String cadena = new Scanner(System.in).nextLine();        
        
                String p1 = cadena;
                int l2 = p1.length();
                if(l2==1){
                    System.out.println("Escribe mas de un caracter");
                }else{
                    if(l2==2){
                        char letra0 = p1.charAt(0);                        
                        char letra1 = p1.charAt(1);
                        System.out.println(letra1+""+letra0);
                    }else{
                        if(l2==3){
                            char letra0 = p1.charAt(0);                        
                            char letra1 = p1.charAt(1);
                            char letra2 = p1.charAt(2);
                            System.out.println(letra1+""+letra0+""+letra2);
                        }else{
                            if(l2==4){
                                char letra0 = p1.charAt(0);                        
                                char letra1 = p1.charAt(1);
                                char letra2 = p1.charAt(2);
                                char letra3 = p1.charAt(3);
                                System.out.println(letra1+""+letra0+""+letra3+""+letra2);
                            }else{
                                if(l2==5){
                                    char letra0 = p1.charAt(0);                        
                                    char letra1 = p1.charAt(1);
                                    char letra2 = p1.charAt(2);
                                    char letra3 = p1.charAt(3);
                                    char letra4 = p1.charAt(4);
                                    System.out.println(letra1+""+letra0+""+letra3+""+letra2+""+letra4);
                                }else{
                                    if(l2==6){
                                        char letra0 = p1.charAt(0);                        
                                        char letra1 = p1.charAt(1);
                                        char letra2 = p1.charAt(2);
                                        char letra3 = p1.charAt(3);
                                        char letra4 = p1.charAt(4);
                                        char letra5 = p1.charAt(5);
                                        System.out.println(letra1+""+letra0+""+letra3+""+letra2+""+letra4+""+letra5);
                                    }else{
                                        System.out.println("Te pasaste de caracteres");
                                    }
                                }                                
                            }
                        }
                    }                                                                
                }
        
        
    }
    
}
