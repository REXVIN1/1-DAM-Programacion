/*
 */
package ejercicio08;
import bpc.daw.objetos.*;
/**
 *
 * @author Kevin Gómez <kgomval118@g.educaand.es>
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 8 : Haz un programa en el que haya dos depósitos de agua de capacidad máxima 20\n" +
"litros y con capacidades iniciales 15 y 5 litros respectivamente. Retira del primero cinco litros\n" +
"de agua y añádelos al segundo. Dibuja los depósitos antes y después de la operación."+"\n");
        
        DepositoAgua d1,d2 = null;
        
        d1 = new DepositoAgua(15,20);
        d2 = new DepositoAgua(5,20);
        
        System.out.println("Antes:");
        
        d1.dibujar();
        d2.dibujar();         
        
        int ca1 = d1.getCantidadActual();
        int cm1 = d1.getCapacidadMaxima();
        
        int ca2 = d2.getCantidadActual();
        int cm2 = d2.getCapacidadMaxima();
        
        System.out.println("Capacidad actual: "+ca1);
        System.out.println("Capacidad máxima: "+cm1);
        System.out.println("Capacidad actual: "+ca2);
        System.out.println("Capacidad máxima: "+cm2);
        
        System.out.println("\n"+"Después:");
        
        d1.retirarLitro();
        d1.retirarLitro();
        d1.retirarLitro();
        d1.retirarLitro();
        d1.retirarLitro();
        
        d2.añadirLitro();
        d2.añadirLitro();
        d2.añadirLitro();
        d2.añadirLitro();
        d2.añadirLitro();
        
        d1.dibujar();
        d2.dibujar();
        
        ca1 = d1.getCantidadActual();
        cm1 = d1.getCapacidadMaxima();        
        ca2 = d2.getCantidadActual();
        cm2 = d2.getCapacidadMaxima();
        
        System.out.println("Capacidad actual: "+ca1);
        System.out.println("Capacidad máxima: "+cm1);
        System.out.println("Capacidad actual: "+ca2);
        System.out.println("Capacidad máxima: "+cm2);        
    }
    
}
