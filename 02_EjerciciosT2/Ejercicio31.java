
package ejercicio31;
import bpc.daw.musica.*;

/*Kevin Gómez Valderas*/

public class Ejercicio31 {

    /* @param args the command line arguments*/
    
    public static void main(String[] args) {
        System.out.println("Ejercicio 31 : En la librería Música se encuentran clases para reproducir una sencilla partitura\n" +
"en un instrumento musical. Haz un programa que reproduzca en un piano la siguiente\n" +
"canción. Modifica el programa para que al finalizar, se vuelva a reproducir con una guitarra.\n");
        
        Cancion c = new Cancion("Canción");
        Piano piano = new Piano();
        Guitarra guitarra = new Guitarra();
        
        NotaMusical DO = new NotaMusical(0,2);
        NotaMusical SOL = new NotaMusical(4,2);
        NotaMusical LA = new NotaMusical(5,2);
        
        NotaMusical SOL_2 = new NotaMusical(4,1);
        
        NotaMusical FA = new NotaMusical(3,3);
        NotaMusical MI = new NotaMusical(2,3);
        
        NotaMusical RE = new NotaMusical(1,4);
        NotaMusical MI_2 = new NotaMusical(2,4);
        NotaMusical FA_2 = new NotaMusical(3,4);
        
        System.out.println("\nCanción: ");
        System.out.println("Número de notas: "+c.getNumeroNotasMusicales());
        System.out.println("Instrumento: "+piano.getNombre());        
        System.out.println("\nInstrumento 2: "+guitarra.getNombre()); 
        
        c.añadir(DO);
        c.añadir(DO);
        c.añadir(SOL);
        c.añadir(SOL);
        c.añadir(LA);
        c.añadir(LA);
        c.añadir(SOL_2);
        c.añadir(FA);
        c.añadir(FA);
        c.añadir(MI);
        c.añadir(MI);
        c.añadir(RE);
        c.añadir(MI_2);
        c.añadir(FA_2);
        c.añadir(RE);  
        c.añadir(DO);
        
        piano.reproducir(c);
        guitarra.reproducir(c);                     
        
    }
    
}
