/*
 */
package ejercicio12;
import bpc.daw.objetos.MarcadorBaloncesto;
/**
 *
 * @author Kevin Gómez Valderas<kgomval118@g.educaand.es>
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejercicio 12 : En la librería ObjetosSencillos.jar se encuentra la clase MarcadorBaloncesto. Haz\n" +
"un programa en el que se cree un partido de baloncesto para el partido que van a jugar el\n" +
"Estudiantes y el CB Granada. Registra las siguientes canastas y muestra el nombre de los\n" +
"equipos, los puntos que tiene cada uno, el nombre del equipo que va ganando y el que va\n" +
"perdiendo."+"\n");
         
        MarcadorBaloncesto marcador = new MarcadorBaloncesto("CB Granada","Estudiantes");
        
        int puntos[] = {2,3,2,2,3,1,1,2};
        char equipos[] = {'V','L','V','L','L','V','V','L'};
        int p = 0,e = 0;
        
        System.out.println("--------EMPIEZA EL PARTIDO---------");
        System.out.println(marcador);
        System.out.println("-----------------------------------");
        while(p<puntos.length){
            System.out.println("\n-----------------------------------");
            marcador.anotarCanasta(equipos[e], puntos[p]);
            System.out.println(marcador);
            System.out.println("Va ganando: "+marcador.getNombreEquipoGanador());
            System.out.println("Va perdiendo: "+marcador.getNombreEquipoPerdedor());
            p++;
            e++;
            System.out.println("-----------------------------------");
        }
        System.out.println("\n-----------RESULTADO---------------");
        System.out.println("Equipo ganador: "+marcador.getNombreEquipoGanador());
        System.out.println("Equipo ganador: "+marcador.getNombreEquipoPerdedor());
        System.out.println("-----------------------------------");
    }
    
}
