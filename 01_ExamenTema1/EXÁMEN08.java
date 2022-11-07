
package exámen08;


public class EXÁMEN08 {


    public static void main(String[] args) {
        System.out.println("8. Declara una lista con las cinco vocales. Otra con 5 valores decimales. Otra con los nombres \n" +
"de los lenguajes de programación que conoces. Muestra por pantalla la ultima posición de \n" +
"cada una de las listas. Asígnale a la primera posición de la lista de lenguajes de \n" +
"programación el valor “Cobol”. Muestra por pantalla el valor de la primera posición después\n" +
"de modificarlo."+"\n");
        
        String vocal[] = {"a", "e", "i", "o", "u"};
        double valor[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        String lenguaje[] ={"java", "python"};
        
        System.out.println("Última vocal: "+vocal[4]);
        System.out.println("Último decimal"+valor[4]);
        System.out.println("Último lenguaje: "+lenguaje[1]); 
        
        lenguaje[0]="Cobol";
        
        System.out.println("Primer lenguaje: "+lenguaje[0]);
    }
}
