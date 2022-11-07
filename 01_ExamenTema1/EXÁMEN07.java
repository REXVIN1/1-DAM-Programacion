
package exámen07;


public class EXÁMEN07 {

    public static void main(String[] args) {
        System.out.println("7. Realiza un programa con las variables que aparecen a continuación, y a continuación\n" +
"muestre por pantalla su suma, su producto, división, multiplicación y resto de la división."+"\n");
        
        String n1 = "123";
        String n2 = "69";
        
        int n11 = Integer.parseInt(n1);
        int n22 = Integer.parseInt(n2);
        
        int suma = n11 + n22;
        int división = n11 / n22;
        int multiplicación = n11 * n22;
        int resto = n11 % n22;
        
        System.out.println("Suma: "+suma);
        System.out.println("División: "+división);
        System.out.println("Multiplicación: "+multiplicación);
        System.out.println("Resto: "+resto);
    }
    
}
