/*
 */
package ejercicio05;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena = "Dabale arroz a la zorra el abad";
        System.out.println("Frase: "+cadena);
        cadena = cadena.replaceAll("\\s+", "");
        StringBuilder cadena2 = new StringBuilder(cadena);
        String cadena3 = cadena2.reverse().toString();
        
        if(cadena.equalsIgnoreCase(cadena3)==true){
            System.out.println("\nEs paríndromo");
        }else{
            System.out.println("\nNo es palíndromo");
        }
    }
    
}
