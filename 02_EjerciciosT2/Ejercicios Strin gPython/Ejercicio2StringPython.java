/*
 */
package ejercicio2.string.python;
import java.util.*;
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
       
        String cadena = "Texto de ejemplo";
        
        String espacio = " ";       
               
        int posicion = cadena.indexOf(espacio);
        char letra = cadena.charAt(cadena.indexOf(espacio));   
        int letra1 = letra;
        char zero = 0;
                
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
        }                        
        
    }
    
}
