
package tema5.ejercicio26_27_28_29;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public interface FiguraGeometrica extends Coloreable{
    
    //GETTERS
    public double getArea();
    public int getPerimetro();
    
    //SETTER
    public void dibujar(Graphics g);
    
    //METODO DEFAULT
    public default Cuadrado crearCuadradoIgualArea(Point esquinaSuperiorIzquierda){
        double area = this.getArea();
        double lado = Math.sqrt(area);
        return new Cuadrado (esquinaSuperiorIzquierda, (int)lado, Color.BLACK);
    }
}
