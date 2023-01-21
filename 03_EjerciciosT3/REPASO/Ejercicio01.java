
package ejercicio01;

/*@author usuario-mañana*/

public class Ejercicio01 {

    public static void main(String[] args) {
        int n=5, total=0;
        boolean b = (total==10), b2;
        
        for(int i=0;b==false;i++){
            b =(total==10);
            b2 = (i%n)==0;
            if(b2==true){
                total = total +1;
                System.out.println(i);
            }
        }
    }  
}
