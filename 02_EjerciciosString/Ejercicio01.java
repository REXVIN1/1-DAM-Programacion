/*
 */
package ejercicio01;

/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Consiste en eliminar los espacios en blanco iniciales en una cadena. Por ejemplo, la cadena ' Python rocks!' quedaría 'Python rocks!'"+"\n");        
        
        String cadena = "       hola        "; 
        
        System.out.println("\nCadena normal: "+cadena);
                
        String cadena2 = cadena.substring(0, cadena.lastIndexOf(" "));
        String cadena2_1 = cadena2;
                
        System.out.println("\nCadena sin espacios delanteros:"+cadena2_1.trim());
    }
    
}
