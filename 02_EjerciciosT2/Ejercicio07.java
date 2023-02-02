/*
 */
package ejercicio07;
import bpc.daw.objetos.DepositoAgua;

/**
 *
 * @author Kevin Gómez <kgomval118@g.educaand.es>
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 7 : Haz un proyecto nuevo y añade la librería “ObjetosSencillos.jar”. En dicha librería\n" +
"encontrarás la clase DepósitoAgua. Haz un programa en el que haya un depósito de agua con\n" +
"capacidad máxima 50 litros y capacidad inicial 15 litros. Dibújalo en la pantalla y calcula el\n" +
"tanto por ciento de ocupación del depósito."+"\n");
        
        DepositoAgua d1 = new DepositoAgua(15,50);
        
        d1.dibujar();
        
        int cantidad = d1.getCantidadActual();        
        int porcentaje = (cantidad*100)/50;
        
        System.out.println("\n"+"Porcentaje de agua: "+porcentaje+"%"); 
    }
    
}
