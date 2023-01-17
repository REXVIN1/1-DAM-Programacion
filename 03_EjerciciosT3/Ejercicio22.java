
package ejercicio22;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Ejercicio22 {

    public static void main(String[] args) {
        int pepe[]={9,5,4,3}, ana[]={4,8,6,5}, juan[]={2,5,10,2}, 
                guillermo[]={0,0,5,0}, roberta[]={10,10,10,9},
                total_pepe=0, total_ana=0, total_juan=0, total_guillermo=0,
                total_roberta=0;        
        for(int i=0;i<3;i++){
            total_pepe = total_pepe + pepe[i];
            total_ana = total_ana + ana[i];
            total_juan = total_juan + juan[i];
            total_guillermo = total_guillermo + guillermo[i];
            total_roberta = total_roberta + roberta[i];                        
        }
        System.out.println("Media de Pepe: "+total_pepe/4);
        System.out.println("Media de Ana: "+total_ana/4);
        System.out.println("Media de Juan: "+total_juan/4);
        System.out.println("Media de Guillermo: "+total_guillermo/4);
        System.out.println("Media de Roberta: "+total_roberta/4);
    }
}
