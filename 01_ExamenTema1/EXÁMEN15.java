
package exámen15;


public class EXÁMEN15 {


    public static void main(String[] args) {
        System.out.println("15. Si X, Y y Z son variables de tipo boolean con valores X = true, Y = false, Z = true, determina \n" +
"el valor de las siguientes expresiones lógicas, muestra un mensaje por pantalla con el valor:"+"\n");
        
        boolean x =  true;
        boolean y =  false;
        boolean z =  true;
        
        boolean o1 = x||x||y||x&&!z&&!y;
        boolean o2 = ((x || !y) && (!x || z));
        boolean o3 = !x || !y || z && x && !y;
        
        System.out.println("Valor1:"+o1);
        System.out.println("Valor2:"+o2);
        System.out.println("Valor3:"+o3);
    }
    
}
