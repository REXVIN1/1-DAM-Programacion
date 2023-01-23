
package ejercicio11;
import java.util.Random;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio11 {

    public static void main(String[] args) {
        Random r = new Random();
        int longitud, n_contraseña, r1, r2;
        String tipo_l, n, simbolo, contraseña="";
        
        String[] abecedario = {"A","B","C","D","E","F","G","H","I","J","K","L",
            "M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int numeros[] = {1,2,3,4,5,6,7,8,9};
        String simbolos[] = {"º","ª","!","|","@","","·","#","$","~","%","€",
            "&","¬","/","(",")","=","?","¿","¡","'","`","^","[","+","*","]","´"
                ,"¨","{","}",",",";",":",".","-","_"};
        
        boolean may=true, numero=true, sim=true;                
        
        do{
            System.out.println("\nEliga la longitud (8-16):");
            longitud = new Scanner(System.in).nextInt();
            if(longitud>16||longitud<8){
                System.out.println("Por favor introduzca un numero entre 8 y 16, "
                    + "incluyendo a estos");
            }              
        }while(longitud>16||longitud<8);
        
        do{
            System.out.println("\nEliga como quiere la letra (mayuscula/minuscula):");
            tipo_l = new Scanner(System.in).nextLine();
            if(tipo_l.equalsIgnoreCase("minuscula")){
                may=false;
                System.out.println("Ha escogido minuscula");
            }if(tipo_l.equalsIgnoreCase("mayuscula")){
                may=true;
                System.out.println("Ha escogido mayuscula");
            }if(!tipo_l.equalsIgnoreCase("mayuscula")&&!tipo_l.equalsIgnoreCase("minuscula")){
                System.out.println("Introduzca un valor adecuado (mayuscula/minuscula)");
            }                               
        }while(!tipo_l.equalsIgnoreCase("mayuscula")&&!tipo_l.equalsIgnoreCase("minuscula"));
        
        do{
            System.out.println("\nDesea que tenga numeros (si/no):");
            n = new Scanner(System.in).nextLine();
            if(n.equalsIgnoreCase("no")){
                numero=false;
                System.out.println("Ha escogido sin numeros");
            }if(n.equalsIgnoreCase("si")){
                numero=true;
                System.out.println("Ha escogido con numeros");
            }if(!n.equalsIgnoreCase("si")&&!n.equalsIgnoreCase("no")){
                System.out.println("Introduzca un valor adecuado (si/no)");
            }             
        }while(!n.equalsIgnoreCase("si")&&!n.equalsIgnoreCase("no"));
        
        do{
            System.out.println("\nCon o sin simbolos: (con/sin):");
            simbolo = new Scanner(System.in).nextLine();
            if(simbolo.equalsIgnoreCase("sin")){
                sim=false;
                System.out.println("Ha escogido sin simbolos");
            }if(simbolo.equalsIgnoreCase("con")){
                sim=true;
                System.out.println("Ha escogido con simbolos");
            }if(!simbolo.equalsIgnoreCase("con")&&!simbolo.equalsIgnoreCase("sin")){
                System.out.println("Introduzca un valor adecuado (con/sin)");
            }             
        }while(!simbolo.equalsIgnoreCase("con")&&!simbolo.equalsIgnoreCase("sin"));
               
        System.out.println("\nCuantas contraseñas desea generar:");
        n_contraseña = new Scanner(System.in).nextInt();        
                
        for(int i=0;i<n_contraseña;i++){
            while(contraseña.length()<longitud){
                if(may==true){
                    contraseña = contraseña +abecedario[r.nextInt(0, abecedario.length)];
                }else{
                    contraseña = contraseña +abecedario[r.nextInt(0, abecedario.length)].toLowerCase();
                }
                if(numero==true){
                    contraseña = contraseña +numeros[r.nextInt(0, numeros.length)];
                }
                if(sim==true){
                    contraseña = contraseña +simbolos[r.nextInt(0, simbolos.length)];
                }        
            }
            System.out.println(contraseña);  
            contraseña = "";
        }
    }
}
