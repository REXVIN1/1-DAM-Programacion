/*
 */
package ejercicio04;
import java.util.Scanner;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Codificador de cadenas: el resultado será una cadena que se ha obtenido cambiando cada carácter por el carácter cuyo código ASCII es n unidades mayor."+"\n");  
        
        System.out.println("\nIntroduzca un código char: (con un valor o valores del 1 y 255)");
        String n1 = new Scanner(System.in).nextLine();
        System.out.println("\nCadena: ("+n1+")\n");
        StringBuilder n2 = new StringBuilder(n1.trim());
        String n3 = n2.append(" ").toString();
        
        int f = n3.indexOf(" ")+1;
        int i = 0;
        
        String e;
        
        while(f<=n3.length()){ 
            e = n3.substring(i,f).trim(); 
            int e2 = Integer.parseInt(e);
            if(e2>255){
                System.out.println("\nSelecionaste un numero muy elevado");
                char e3 = (char) e2;
                System.out.println("ASCII: ("+e3+")");
                n3 = n3.substring(f, n3.length());
            }else{
                char e3 = (char) e2;
                System.out.println("ASCII: ("+e3+")");
                n3 = n3.substring(f, n3.length());
            }
            
        }
        
    }
    
}
