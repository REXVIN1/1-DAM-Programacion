/*
 */
package ejercicio04;
import bpc.daw.mario.*;
/**
 *
 * @author Kevin Gómez <kgomval118@g.educaand.es>
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 4 : Haz un programa en el que se cree un muñeco de Luigi situado a una distancia en\n" +
"diagonal, de 500 píxeles a partir de la esquina superior izquierda de la pantalla, y un muñeco\n" +
"de Mario a su lado. El programa deberá mostrar por pantalla las coordenadas (x,y) en la que se\n" +
"encuentran los dos muñecos."+"\n");
        
        Luigi l1 = new Luigi(354 ,354);
        Mario m1 = new Mario(l1,0);
        
        double distancia = l1.getDistanciaOrigen();
        int xl = l1.getX();
        int yl = l1.getY();
        
        System.out.println("Luigi:");
        System.out.println("Distancia: "+distancia);
        System.out.println("Coordenada x:"+xl);
        System.out.println("Coordenada y:"+yl+"\n");
        
        int xm = m1.getX();
        int ym = m1.getY();
        
        System.out.println("Mario:");
        System.out.println("Coordenada x:"+xm);
        System.out.println("Coordenada y:"+ym);
    }
    
}
