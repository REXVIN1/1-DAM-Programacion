
package tema5.ejercicio26_27_28_29;

import java.awt.Color;
import java.awt.Point;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Cuadrado extends Rectangulo{
    
    //VARIABLE
    private int longitudLado;
    
    //CONSTRUCTOR
    public Cuadrado(Point esquinaSuperiorIzquierda, int longitudLado, Color color){
        super(esquinaSuperiorIzquierda,new Point((int)esquinaSuperiorIzquierda.getX()+longitudLado,(int)esquinaSuperiorIzquierda.getY()+longitudLado),color);
        this.longitudLado = longitudLado; 
    }
}
