
package tema5.ejercicio26_27_28_29;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Circulo implements FiguraGeometrica, Centrable{
    
    //VARIABLES
    private Point centro;
    private int radio;
    private Color color;
    
    //CONSTRUCTOR
    public Circulo(Point centro, int radio, Color color) {
        this.centro = centro;
        this.radio = radio;
        this.color = color;
    }

    //GETTERS
    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.radio, 2);
    }

    @Override
    public int getPerimetro() {
        int p = (int) Math.PI*(this.radio*2);
        return p;
    }

    @Override
    public Point getCentro() {
        return this.centro;
    }
    
    //SETTERS
    @Override
    public void dibujar(Graphics g) {
        g.create();
    }
}
