/*
 */
package ejercicio02;
import bpc.daw.mario.*;
/**
 *
 * @author Kevin Gómez <kgomval118@g.educaand.es>
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Ejercicio 2 : Consulta la documentación de la librería Mario Bros y haz un programa que cree\n" +
"los siguientes objetos en la pantalla:"+"\n");
        
        System.out.println("a) Dos muñecos de Mario, uno a 100 píxeles de distancia de la esquina superior izquierda\n" +
"de la pantalla y otro en las coordenadas (640,320)"+"\n");
        Mario m1,m2 = null;        
        m1 = new Mario(100.0);
        m2 = new Mario(640,320);
        
        System.out.println("b) Una Seta en la esquina superior izquierda de la pantalla"+"\n");       
        Seta s1 = new Seta(0,0);
        
        System.out.println("c) Un cañón en las coordenadas (100,320)"+"\n");
        Cañon c1 = new Cañon(100,320);
        
        System.out.println("d) Tres plantas en las coordenadas (400,500), (450,500) y (500,500)"+"\n");
        Planta p1,p2,p3 = null;    
        p1 = new Planta(400,500);
        p2 = new Planta(450,500);
        p3 = new Planta(500,500);
        
        System.out.println("e) Un muñeco de Luigi situado a 200 píxeles de la esquina superior izquierda de la\n" +
"pantalla y uno de Mario situado a 50 píxeles horizontales de él."+"\n");
        Luigi l1 = new Luigi(200,0);
        Mario m3 = new Mario(200,50);
    }
    
}
