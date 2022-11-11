/*
 */
package ejercicio6.strinf.python;

/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio6StrinfPython {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Se trata de leer dos líneas que contienen cadenas e imprimir la unión de las cadenas contenidas en las líneas. Línea1: hola caballo casa; Línea2: teclado cuadro coche; Resultado: hola caballo casa teclado cuadro coche."+"\n");
        
        String linea1 = "tio hola buenos dias como estas";
        System.out.println("Frase 1: "+linea1);
        String parte_frase1 = linea1.substring(linea1.indexOf("hola"),linea1.indexOf("como"));
        System.out.println(parte_frase1);
        
        String linea2 = "tio hola buenas noches como estas";
        System.out.println("\n"+"Frase 2: "+linea2);
        String parte_frase2 = linea2.substring(linea2.indexOf("hola"),linea2.indexOf("como"));
        System.out.println(parte_frase2);
        
        System.out.println("\n"+parte_frase1+parte_frase2);
    }
    
}
