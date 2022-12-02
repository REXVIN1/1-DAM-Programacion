
package ejercicio48;
import bpc.daw.objetos.*;

/*@author usuario-mañana*/
public class Ejercicio48 {

    /*@param args the command line arguments*/
    public static void main(String[] args) {
        System.out.println("Ejercicio 48 : En la librería “Objetos Sencillos” está la clase MarcadorMejorado. Haz un\n" +
"programa en el que se cree un partido de baloncesto para el partido que van a jugar el\n" +
"Estudiantes y el CB Granada. Registra las siguientes canastas y muestra el nombre de los\n" +
"equipos, los puntos que tiene cada uno, el nombre del equipo que va ganando y el que va\n" +
"perdiendo. Compara el código con el del ejercicio 12. ¿Cuál crees que es mejor?\n");
        
        MarcadorMejorado m = new MarcadorMejorado("CB Granada","Estudiantes");
        
        final int VISITANTE = 697259;
        final int LOCAL = 782507;
        final int NORMAL = 266;
        final int TIRO_LIBRE = 522;
        final int TRIPLE = 778;
        
        System.out.println("Marcador:");
        System.out.println(m+"\n");
        
        try{
            Thread.sleep(1000);
            m.anotarCanasta(VISITANTE, NORMAL);
            System.out.println(m);
            Thread.sleep(1000);
            m.anotarCanasta(LOCAL, TRIPLE);
            System.out.println(m);
            Thread.sleep(1000);
            m.anotarCanasta(VISITANTE, NORMAL);
            System.out.println(m);
            Thread.sleep(1000);
            m.anotarCanasta(LOCAL, NORMAL);
            System.out.println(m);
            Thread.sleep(1000);
            m.anotarCanasta(LOCAL, TRIPLE);
            System.out.println(m);
            Thread.sleep(1000);
            m.anotarCanasta(VISITANTE, TIRO_LIBRE);
            System.out.println(m);
            Thread.sleep(1000);
            m.anotarCanasta(VISITANTE, TIRO_LIBRE);
            System.out.println(m);
            Thread.sleep(1000);
            m.anotarCanasta(LOCAL, NORMAL);
        }catch(Exception e){
            System.out.println("Tipo de error: "+e.getMessage());
        }
        
        System.out.println("\n"+"Marcador final:"+m);
        System.out.println("Equipo ganador: "+m.getNombreEquipoGanador());
    }
    
}
