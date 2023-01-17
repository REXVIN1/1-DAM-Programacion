
package ejercicio11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio11 {

    public static void main(String[] args) {
        
        FileInputStream fis;
        InputStreamReader ipr;
        BufferedReader br;
        long telefono;
        int r;                
        String dni, nombre, direccion, linea, ruta = "C:/Users/kevin/Desktop/poner_el_dni.txt";
        File f = new File(ruta);
        boolean b = true;
        PrintWriter pw;
        try {
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio11.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        do{
            System.out.println("\n1. Añadir nuevo alumno\n2. Ver los datos de un "
                + "alumno\n3. Salir");
            r = new Scanner(System.in).nextInt();   

            if(r==1){
                System.out.println("\nEscriba el DNI:");
                dni = new Scanner(System.in).nextLine();
                System.out.println("\nEscriba el nombre:");
                nombre = new Scanner(System.in).nextLine();
                System.out.println("\nEscribe la dirección:");
                direccion = new Scanner(System.in).nextLine();
                System.out.println("\nEscriba el telefono:");
                telefono = new Scanner(System.in).nextLong();
                try {
                    pw = new PrintWriter(ruta);
                    pw.println(nombre);
                    pw.println(direccion);
                    pw.println(telefono);
                    pw.close();
                } catch (FileNotFoundException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }                        
            }if(r==2){
                System.out.println("Escriba el DNI:");
                dni = new Scanner(System.in).nextLine();
                try {
                    fis = new FileInputStream(ruta);
                    ipr = new InputStreamReader(fis);
                    br = new BufferedReader(ipr);
                    while((linea = br.readLine()) != null){                    
                        System.out.println(linea); 
                    }                
                } catch (IOException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }   
            }if(r==3){
                b = false;
            }
        }while(b);
    }
}
