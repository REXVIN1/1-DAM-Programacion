
package tema5.ejercicio26_27_28_29;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Rectangulo implements Centrable, Apoyable, FiguraGeometrica{
    
    //VARIABLES
    protected Point esquinaSuperiorIzquierda;
    protected Point esquinaInferiorDerecha;
    private Color color;
    
    //CONSTRUCTOR
    public Rectangulo(Point esi, Point esd, Color c) {
        this.esquinaSuperiorIzquierda = esi;
        this.esquinaInferiorDerecha = esd;
        this.color = c;
    }
    
    //GETTER
    @Override
    public Point getCentro() {
        int x = (this.esquinaSuperiorIzquierda.x+this.esquinaInferiorDerecha.x)/2;
        int y = (this.esquinaSuperiorIzquierda.y+this.esquinaInferiorDerecha.y)/2;
        Point centro = new Point(x,y);
        if (centro == null) {
           throw new IllegalArgumentException("No se pudo calcular el punto medio del rect�ngulo");
        }
        return centro;
    } 

    @Override
    public int getLongitudBase() {
        Point p1 = new Point(this.esquinaInferiorDerecha.x, this.esquinaSuperiorIzquierda.y);
        return (int) this.esquinaSuperiorIzquierda.distance(p1);
    }

    @Override
    public int getLongitudAltura() {
        int altura;
        altura = (int) (this.esquinaSuperiorIzquierda.getY() - this.esquinaInferiorDerecha.getY());
        return altura;
        /*
        return(int) Math.sqrt(
                    Math.pow(this.esquinaSuperiorIzquierda.distance(esquinaInferiorDerecha), 2)- 
                    Math.pow(Rectangulo.this.getLongitudBase(), 2));
        */
}

    @Override
    public double getArea() {
        return Rectangulo.this.getLongitudBase()*Rectangulo.this.getLongitudAltura();
    }

    @Override
    public int getPerimetro() {
        return Rectangulo.this.getLongitudBase()*Rectangulo.this.getLongitudAltura()*2;
    }

    @Override
    public void dibujar(Graphics g) {
        g.create();
    }

    @Override
    public Color getColor() {
        return this.getColor(); 
    }
}
