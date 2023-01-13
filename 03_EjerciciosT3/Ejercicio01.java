
package ejercicio01;
import java.util.Scanner;
import bpc.daw.reproductor.ArchivoMP3;
import bpc.daw.reproductor.Reproductor;

/*@author usuario-mañana*/
public class Ejercicio01_Ampliación{

    /*@param args the command line arguments*/
    public static void main(String[] args) {
        try{           
            ArchivoMP3 c1 = new ArchivoMP3("C:/Users/usuario-mañana/Desktop/PaquitoChocolatero.mp3");
            ArchivoMP3 c2 = new ArchivoMP3("C:/Users/usuario-mañana/Desktop/PaquitoChocolatero.mp3");
            ArchivoMP3 c3 = new ArchivoMP3("C:/Users/usuario-mañana/Desktop/PaquitoChocolatero.mp3");
            ArchivoMP3 c4 = new ArchivoMP3("C:/Users/usuario-mañana/Desktop/PaquitoChocolatero.mp3");
            ArchivoMP3 c5 = new ArchivoMP3("C:/Users/usuario-mañana/Desktop/PaquitoChocolatero.mp3");
            
            boolean a=true, b=true;
            Reproductor r1 = new Reproductor(c1, a, b);
            Reproductor r2 = new Reproductor(c1, a, b);
            Reproductor r3 = new Reproductor(c1, a, b);
            Reproductor r4 = new Reproductor(c1, a, b);
            Reproductor r5 = new Reproductor(c1, a, b);
            
            System.out.println("=================================================");
            System.out.println("|                  CANCIONES                    |");
            System.out.println("=================================================");
            System.out.println(" 1 - "/*+c1.getCover()+" "*/+c1.getTitulo()+" - "+c1.getAutor()+" - "+c1.getDuracion());
            System.out.println(" 2 - "/*+c2.getCover()+" "*/+c2.getTitulo()+" - "+c2.getAutor()+" - "+c2.getDuracion());
            System.out.println(" 3 - "/*+c3.getCover()+" "*/+c3.getTitulo()+" - "+c3.getAutor()+" - "+c3.getDuracion());
            System.out.println(" 4 - "/*+c4.getCover()+" "*/+c4.getTitulo()+" - "+c4.getAutor()+" - "+c4.getDuracion());
            System.out.println(" 5 - "/*+c5.getCover()+" "*/+c5.getTitulo()+" - "+c5.getAutor()+" - "+c5.getDuracion());
            System.out.println("=================================================");
                             
            System.out.println("\nEliga una canción:");
            int n1 = new Scanner(System.in).nextInt();
            
            switch(n1){
                case 1:
                    System.out.println("\nCanción elegida: "+c1.getTitulo());
                    r1.play();
                    break;
                case 2:
                    System.out.println("\nCanción elegida: "+c2.getTitulo());
                    r2.play();
                    break;
                case 3:
                    System.out.println("\nCanción elegida: "+c3.getTitulo());
                    r3.play();
                    break;
                case 4:
                    System.out.println("\nCanción elegida: "+c4.getTitulo());
                    r4.play();
                    break;
                case 5:
                    System.out.println("\nCanción elegida: "+c5.getTitulo());
                    r5.play();
                    break;
                default:
                    System.out.println("\nNinguna canción escogida");
            }
        }catch(Exception error){
            System.out.println("\nEliga un número entre 1 y 5");
        }
    }    
}
