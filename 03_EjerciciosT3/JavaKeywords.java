
package javakeywords;
import java.util.*;
/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/
public class JavaKeywords {    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String keywords[] = {"abstract","assert","boolean","break","byte","case","catch","char","class","continue","default","do","double","else","enum","extends","final","finally","float","for","if","implements","import","instanceof","int","interface","long","native","new","null","package","private","protected","public","return","short","static","strictfp","super","switch","synchronized","this","throw","throws","transient","try","void","volatile","while"};   
        int repetido[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};     
        int acertadas = 0,i = 0;
         
        System.out.println("Escriba las palabras reservadas de java que te sepas: ");
        String palabra = new Scanner(System.in).nextLine(); 
            
        while(acertadas<=keywords.length){                  
            if(keywords[i].equals(palabra.toLowerCase().replaceAll("\\s+", ""))){
                if(repetido[i]==0){
                   repetido[i]=1;                         
                   acertadas ++;                    
                }else{
                    System.out.println("Esta repetida");
                }             
                if(acertadas<keywords.length){
                    System.out.println("CORRECTO ("+acertadas+"/"+keywords.length+")");
                    System.out.println("\nEscriba otras palabras reservadas en java");
                    palabra = new Scanner(System.in).nextLine();  
                    i=0;
                }else{
                    i = keywords.length + 1;
                }
            }else{
                i++;
                if(i==keywords.length){
                    System.out.println("Incorrecto ("+acertadas+"/"+keywords.length+")");
                    System.out.println("\nEscriba otras palabras reservadas en java");
                    palabra = new Scanner(System.in).nextLine();
                    i=0;
                }
            }
        }
        System.out.println("\nERES UN CRACK, HAS ACERTADO TODAS");                            
    }
}
