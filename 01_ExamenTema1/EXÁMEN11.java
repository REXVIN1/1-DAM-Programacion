
package exámen11;


public class EXÁMEN11 {


    public static void main(String[] args) {
        System.out.println("11. Realiza un programa en el que haya una variable entera llamada año inicializada con \n" +
"cualquier valor positivo. El programa mostrará por pantalla si el año guardado en dicha \n" +
"variable es bisiesto. Ten en cuenta que un año es bisiesto cuando se cumple alguna de estas\n" +
"dos condiciones:\n" +
" - Es múltiplo de 400\n" +
" - No es múltiplo de 400, pero es múltiplo de 4 y no es múltiplo de 100"+"\n");
        
        int año = 2022;
        
        if(año%400==0){
            System.out.println("Es bisisesto");
        }else{
            if(año%400!=0 && año%4==0 && año%100!=0){
                System.out.println("Es bisisesto");
            }else{
                System.out.println("No es bisisesto");
            }
        }
    }
    
}
