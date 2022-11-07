/*
 */
package ejercicio03;
import bpc.daw.mario.*;

/**
 *
 * @author Kevin Gómez <kgomval118@g.educaand.es>
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 3 : Haz un programa en el que se vea un muñeco de Mario, un Luigi, una seta, tres\n" +
"plantas y un cañón situados donde quieras. Realiza con los muñecos las siguientes acciones:"+"\n");
                
        

        
        
        System.out.println("a) La seta debe moverse hacia la esquina superior izquierda de la pantalla."+"\n");
        Seta s1 = new Seta(900,500);
        s1.andarHacia(0, 0);
        
        System.out.println("b) El muñeco de Mario debe pegar un salto."+"\n");
        Mario m1 = new Mario(700,500);
        m1.saltar();
        
        System.out.println("c) El cañón debe disparar al muñeco de Luigi."+"\n");
        Cañon c1 = new Cañon(300,500);
        Disparo d1 = new Disparo(300,500,900,500);
        Luigi l1 = new Luigi(500,500);
        
        System.out.println("d) Las plantas tienen que estar comiendo.");
        Planta p1,p2,p3 = null;
        p1 = new Planta(750,500);
        p2 = new Planta(800,500);
        p3 = new Planta(850,500);
        
        p1.comer(true);
        p2.comer(true);
        p3.comer(true);
    }
    
}
