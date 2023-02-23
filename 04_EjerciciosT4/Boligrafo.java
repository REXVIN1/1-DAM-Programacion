
package daw.persona;

import java.awt.Color;
import static java.awt.Color.blue;
import static java.awt.Color.green;
import static java.awt.Color.red;
import static java.awt.Color.white;
import static java.awt.Color.yellow;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Boligrafo {
    //VALORES
    private static final Color[] COLORES = {red, green, blue, white, yellow};
    private int color;
    private CapaTexto ct;
    
    //CONSTRUCTOR
    public Boligrafo(CapaTexto ct){
        this.ct = ct;
    }
    
    //SETTERS
    public void setColor(int n){
        
    }
    public void escribir(String texto){
        
    }
    public void escribirGuay(String texto){
        
    }
}
