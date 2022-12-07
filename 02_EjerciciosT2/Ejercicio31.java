
package ejercicio31;
import bpc.daw.musica.Cancion;
import bpc.daw.musica.Piano;
import bpc.daw.musica.Guitarra;
import bpc.daw.musica.NotaMusical;

/*Kevin Gómez Valderas*/

public class Ejercicio31 {

    /* @param args the command line arguments*/
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 31 : En la librería Música se encuentran clases para reproducir una sencilla partitura\n" +
"en un instrumento musical. Haz un programa que reproduzca en un piano la siguiente\n" +
"canción. Modifica el programa para que al finalizar, se vuelva a reproducir con una guitarra.\n");
        
        Cancion c = new Cancion("n");
        Piano p = new Piano();
        Guitarra g = new Guitarra();
        
        System.out.println("\nCanción: ");
        System.out.println("Número de notas: "+c.getNumeroNotasMusicales());
        System.out.println("Instrumento: "+piano.getNombre());        
        System.out.println("\nInstrumento 2: "+guitarra.getNombre()); 
        
        NotaMusical DO = new NotaMusical(0,2);
        NotaMusical SOL = new NotaMusical(4,2);
        NotaMusical LA = new NotaMusical(5,2);
        NotaMusical SOL2 = new NotaMusical(4,1);
        NotaMusical FA = new NotaMusical(3,3);
        NotaMusical MI = new NotaMusical(2,3);
        NotaMusical RE = new NotaMusical(1,4);
        NotaMusical MI2 = new NotaMusical(2,4);
        NotaMusical FA2 = new NotaMusical(3,4);
        
        c.añadir(DO);
        c.añadir(DO);
        c.añadir(SOL);
        c.añadir(SOL);
        c.añadir(LA);
        c.añadir(LA);
        c.añadir(SOL2);
        c.añadir(FA);
        c.añadir(FA);
        c.añadir(MI);
        c.añadir(MI);
        c.añadir(RE);
        c.añadir(MI2);
        c.añadir(FA2);
        c.añadir(RE);
        c.añadir(DO);
        
        p.reproducir(c);
        g.reproducir(c);
                           
        
    }
    
}
