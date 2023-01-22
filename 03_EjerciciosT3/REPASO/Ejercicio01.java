
package ejercicio01;

/*@author usuario-mañana*/

public class Ejercicio01 {

    public static void main(String[] args) {
        int total=0, suma=0, n=5;
        
        System.out.println("Multiplos del 5:");
        for(int i=0;total!=10;i++){
            if(i%n==0){
                total = total + 1;
                suma = suma + i;
                System.out.println(i);
            }
        }
        System.out.println("\nSuma: "+suma);
    }  
}
