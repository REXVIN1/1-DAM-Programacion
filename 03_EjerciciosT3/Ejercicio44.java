


package ejercicio44;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/
public class Ejercicio44 {

    public static void main(String[] args) {
        String ruta = "C:/Users/kevin/Desktop/palabras.txt";
        File f = new File(ruta);
        String palabras[] = {"string","int","double","char","byte","file",
            "prinwriter","try catch","IOException","FileNotFoundException"};       
        FileInputStream fis;
        InputStreamReader ipr;
        BufferedReader br;
        PrintWriter pw;
        String palabra;       
        List<String> palabras2;
        try {
            f.createNewFile();
            try {
                pw = new PrintWriter(ruta);
                fis = new FileInputStream(ruta);
                ipr = new InputStreamReader(fis);
                br = new BufferedReader(ipr);
                palabras2 = new ArrayList<String>();
                
                for(int i=0;i<10;i++){
                    pw.println(palabras[i]);
                }
                pw.close();                               
                for(int e=0;e<10;e++){
                    palabra = br.readLine();
                    palabras2.add(palabra);
                }
                System.out.println("Lista: "+palabras2+"\n");
                for(String palabras3:palabras2){
                    System.out.println(palabras3);
                }
            }catch(FileNotFoundException ex) {
                System.out.println("Error: "+ex.getMessage());
            }            
        }catch(IOException ex) {
            System.out.println("Error: "+ex.getMessage());
        }                                
    }
}
