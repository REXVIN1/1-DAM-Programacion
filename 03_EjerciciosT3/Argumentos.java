
package prueba3;

/*@author Kevin Gómez <kgomval118@g.educaand.es>*/
 
public class Argumentos {

    /*@param args the command line arguments*/
     
    public static void main(String[] args) {
        System.out.println("ARGUMENTOS");
        System.out.println("-------------------------------------------");
        
        System.out.println("Argumento 1: " + args[0]);
        System.out.println("Argumento 2: " + args[1]);        
        
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        
        int suma = n1 * n2;
        
        System.out.println("\nLa suma de los argumentos son: "+suma);
    }

}
