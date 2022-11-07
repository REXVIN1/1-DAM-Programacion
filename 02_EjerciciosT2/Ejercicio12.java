/*
 */
package ejercicio12;
import bpc.daw.objetos.*;
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
        
        System.out.println("\u001B[32m"+"|------------------------------------------------|");
        System.out.println("\u001B[32m"+"|"+"\u001B[30m"+"Partido de Baloncesto: CB Granada vs Estudiantes"+"\u001B[32m"+"|");
        System.out.println("\u001B[32m"+"|------------------------------------------------|");
        
        MarcadorBaloncesto marcador = new MarcadorBaloncesto("CB Granada","Estudiantes");
        
        System.out.println("Equipo 1: "+marcador.getNombreLocal());
        System.out.println("Equipo 2: "+marcador.getNombreVisitante()+"\n");                
        
        int puntos_local = marcador.getPuntosLocal();
        int puntos_visitante = marcador.getPuntosVisitante();
        
        System.out.println("\u001B[32m"+"----------------------------------------------------------");
        
        boolean canasta0 = marcador.anotarCanasta('V',2 );
        
        System.out.println("Marcador: "+marcador+"\n");        
        System.out.println("Va ganando: "+marcador.getNombreEquipoGanador());
        System.out.println("Va perdiendo: "+marcador.getNombreEquipoPerdedor()+"\n");
        
        System.out.println("\u001B[32m"+"----------------------------------------------------------");
        
        boolean canasta1 = marcador.anotarCanasta('L',3 );
        
        System.out.println("Marcador: "+marcador+"\n");        
        System.out.println("Va ganando: "+marcador.getNombreEquipoGanador());
        System.out.println("Va perdiendo: "+marcador.getNombreEquipoPerdedor()+"\n");
        
        System.out.println("\u001B[32m"+"----------------------------------------------------------");
        
        boolean canasta3 = marcador.anotarCanasta('V',2 );
        
        System.out.println("Marcador: "+marcador+"\n");        
        System.out.println("Va ganando: "+marcador.getNombreEquipoGanador());
        System.out.println("Va perdiendo: "+marcador.getNombreEquipoPerdedor()+"\n");
        
        System.out.println("\u001B[32m"+"----------------------------------------------------------");
        
        boolean canasta4 = marcador.anotarCanasta('L',2 );
        
        System.out.println("Marcador: "+marcador+"\n");        
        System.out.println("Va ganando: "+marcador.getNombreEquipoGanador());
        System.out.println("Va perdiendo: "+marcador.getNombreEquipoPerdedor()+"\n");
        
        System.out.println("\u001B[32m"+"----------------------------------------------------------");
        
        boolean canasta5 = marcador.anotarCanasta('L',3 );
        
        System.out.println("Marcador: "+marcador+"\n");        
        System.out.println("Va ganando: "+marcador.getNombreEquipoGanador());
        System.out.println("Va perdiendo: "+marcador.getNombreEquipoPerdedor()+"\n");
        
        System.out.println("\u001B[32m"+"----------------------------------------------------------");
        
        boolean canasta6 = marcador.anotarCanasta('V',1 );
        
        System.out.println("Marcador: "+marcador+"\n");        
        System.out.println("Va ganando: "+marcador.getNombreEquipoGanador());
        System.out.println("Va perdiendo: "+marcador.getNombreEquipoPerdedor()+"\n");
        
        System.out.println("\u001B[32m"+"----------------------------------------------------------");
        
        boolean canasta7 = marcador.anotarCanasta('V',1 );
        
        System.out.println("Marcador: "+marcador+"\n");        
        System.out.println("Va ganando: "+marcador.getNombreEquipoGanador());
        System.out.println("Va perdiendo: "+marcador.getNombreEquipoPerdedor()+"\n");
        
        System.out.println("\u001B[32m"+"----------------------------------------------------------");
        
        boolean canasta8 = marcador.anotarCanasta('L',2 );      
        
        System.out.println("Marcador: "+marcador+"\n");        
        System.out.println("Ganador: "+marcador.getNombreEquipoGanador());
        System.out.println("Perdedor: "+marcador.getNombreEquipoPerdedor());
        
        System.out.println("\u001B[32m"+"----------------------------------------------------------");
    }
    
}
