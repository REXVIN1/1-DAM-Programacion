 /*
 */
package ejercicio2.string.python;
import java.lang.*;
import java.io.*;

/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio2StringPython {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String cadena = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam purus nibh, placerat a imperdiet in, blandit quis neque. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nam quis nulla semper mi finibus ornare. Ut cursus felis ut ligula lacinia, eget mollis purus pellentesque. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Aenean tempus mi eleifend neque sodales interdum quis in elit. Nullam mattis ac est ac mattis. Morbi consequat nisi sodales bibendum consectetur. Nam fermentum dapibus dignissim. Nullam bibendum sed metus ut vulputate. In imperdiet felis ligula, vel pretium nunc condimentum et. Donec quis faucibus erat. Suspendisse potenti. Vestibulum et arcu in augue volutpat tempor id ut urna.";
        
        System.out.println("Cadena normal: "+cadena);
        
        cadena = cadena.replaceAll(" ", "");
        
        System.out.println("Cadena sin espacios: "+cadena);
                                                                                                                                      
        /*
        String espacio = " ";       
               
        int posicion = cadena.indexOf(espacio);
        char letra = cadena.charAt(cadena.indexOf(espacio));   
        int letra1 = letra;
                
        System.out.println("Posicion:"+posicion);
        System.out.println("Letra char:"+letra);
        System.out.println("Letra en numero:"+letra1);
        
        if(letra1==32){
            String cadena1 = cadena.substring(0, posicion).trim();
            String cadena2 = cadena.substring(posicion).trim();  
            
            int posicion2 = cadena2.indexOf(espacio); 
            String palabra = cadena2.substring(0, posicion2);
            String extracion = cadena2.substring(posicion2).trim();            
            
            System.out.println("\n"+"Cadena normal:"+cadena);
            System.out.println("Cadena junta:"+cadena1+palabra+extracion.trim());   
        */
        }                        
        
    }
    
}
