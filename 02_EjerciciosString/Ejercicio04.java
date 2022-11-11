/*
 */
package ejercicio4.string.pyhton;
import java.util.*;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio4StringPyhton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Codificador de cadenas: el resultado será una cadena que se ha obtenido cambiando cada carácter por el carácter cuyo código ASCII es n unidades mayor."+"\n");  
        
        System.out.println("Escriba 5 codigos del 1 al 255:");
        String caracteres = new Scanner(System.in).nextLine(); 
        
        String[] fragmento = caracteres.split(" ");
        
        if(fragmento.length==1){
            String f0 = fragmento[0];
            int f0_1 = Integer.parseInt(f0);
            char f0_2 = (char)f0_1;
            System.out.println("\n"+f0_2);
        }
        if(fragmento.length==2){
            String f0 = fragmento[0];
            int f0_1 = Integer.parseInt(f0);
            char f0_2 = (char)f0_1;
            System.out.println("\n"+f0_2);
            
            String f1 = fragmento[1];
            int f1_1 = Integer.parseInt(f1);
            char f1_2 = (char)f1_1;
            System.out.println("\n"+f1_2);
        }
        
        if(fragmento.length==3){
            String f0 = fragmento[0];
            int f0_1 = Integer.parseInt(f0);
            char f0_2 = (char)f0_1;
            System.out.println("\n"+f0_2);
            
            String f1 = fragmento[1];
            int f1_1 = Integer.parseInt(f1);
            char f1_2 = (char)f1_1;
            System.out.println("\n"+f1_2);
            
            String f2 = fragmento[2];
            int f2_1 = Integer.parseInt(f2);
            char f2_2 = (char)f2_1;
            System.out.println("\n"+f2_2);
        }
        
        if(fragmento.length==4){
            String f0 = fragmento[0];
            int f0_1 = Integer.parseInt(f0);
            char f0_2 = (char)f0_1;
            System.out.println("\n"+f0_2);
            
            String f1 = fragmento[1];
            int f1_1 = Integer.parseInt(f1);
            char f1_2 = (char)f1_1;
            System.out.println("\n"+f1_2);
            
            String f2 = fragmento[2];
            int f2_1 = Integer.parseInt(f2);
            char f2_2 = (char)f2_1;
            System.out.println("\n"+f2_2);
            
            String f3 = fragmento[3];
            int f3_1 = Integer.parseInt(f3);
            char f3_2 = (char)f3_1;
            System.out.println("\n"+f3_2);
        }
        
        if(fragmento.length==5){
            String f0 = fragmento[0];
            int f0_1 = Integer.parseInt(f0);
            char f0_2 = (char)f0_1;
            System.out.println("\n"+f0_2);
            
            String f1 = fragmento[1];
            int f1_1 = Integer.parseInt(f1);
            char f1_2 = (char)f1_1;
            System.out.println("\n"+f1_2);
            
            String f2 = fragmento[2];
            int f2_1 = Integer.parseInt(f2);
            char f2_2 = (char)f2_1;
            System.out.println("\n"+f2_2);
            
            String f3 = fragmento[3];
            int f3_1 = Integer.parseInt(f3);
            char f3_2 = (char)f3_1;
            System.out.println("\n"+f3_2);
            
            String f4 = fragmento[4];
            int f4_1 = Integer.parseInt(f4);
            char f4_2 = (char)f4_1;
            System.out.println("\n"+f4_2);
        }
        
        if(fragmento.length==6){
            String f0 = fragmento[0];
            int f0_1 = Integer.parseInt(f0);
            char f0_2 = (char)f0_1;
            System.out.println("\n"+f0_2);
            
            String f1 = fragmento[1];
            int f1_1 = Integer.parseInt(f1);
            char f1_2 = (char)f1_1;
            System.out.println("\n"+f1_2);
            
            String f2 = fragmento[2];
            int f2_1 = Integer.parseInt(f2);
            char f2_2 = (char)f2_1;
            System.out.println("\n"+f2_2);
            
            String f3 = fragmento[3];
            int f3_1 = Integer.parseInt(f3);
            char f3_2 = (char)f3_1;
            System.out.println("\n"+f3_2);
            
            String f4 = fragmento[4];
            int f4_1 = Integer.parseInt(f4);
            char f4_2 = (char)f4_1;
            System.out.println("\n"+f4_2);
            
            String f5 = fragmento[5];  
            int f5_1 = Integer.parseInt(f5);
            char f5_2 = (char)f5_1;
            System.out.println("\n"+f5_2);
        }
        
    }
    
}
