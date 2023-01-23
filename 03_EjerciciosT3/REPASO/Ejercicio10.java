
package ejercicio10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio10 {

    public static void main(String[] args) {
        
        List<String> normal = new ArrayList<>();
        List<String> leet = new ArrayList<>();
        String texto, letra;
        int x=0, y=1;
        boolean b;
        
        String[] abecedario = {"A","B","C","D","E","F","G","H","I","J","K","L",
            "M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] abecedario_leet = {"4","13","[",")","3","|=","&","#","1",",_|",">|","1",
            "^^","^/","0","|*","(_,)","12","5","7","(_)","|/","vv","><","j","2"};
        
        for(int h=0;h<abecedario.length;h++){
            normal.add(abecedario[h]);
            leet.add(abecedario_leet[h]);
        }
                        
        System.out.println(normal);
        System.out.println(leet);
        
        System.out.println("\nEscriba un texto:");
        texto = new Scanner(System.in).nextLine();
        
        for(int i=0;i<texto.length();i++){
            letra = texto.substring(x, y);
            for(int e=0;e<normal.size();e++){
                if(letra.equalsIgnoreCase(normal.get(e))){
                    texto = texto.replaceAll(letra, leet.get(e)); 
                }                                                                 
            }                       
            x++;
            y++;
        } 
        System.out.println(texto);        
    }
}
