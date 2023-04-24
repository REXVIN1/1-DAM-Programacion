
package tema5.ejercicio26_27_28_29;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Triangulo implements Apoyable{
    
    //VARIABLES
    private final Point[] vertices;
    
    //CONSTRUCTOR
    public Triangulo(Point v1, Point v2, Point v3) {
        this.vertices = new Point[3];
        this.vertices[0] = v1;
        this.vertices[1] = v2;
        this.vertices[2] = v3;
    }
    
    //GETTER
    private double getLongitud(Point a, Point b){
        return a.distance(b);
    }

    @Override
    public int getLongitudBase() {
        if(this.vertices[0].distance(this.vertices[1]) > this.vertices[0].distance(this.vertices[2])){
            if(this.vertices[0].distance(this.vertices[1]) > this.vertices[1].distance(this.vertices[2])){
                return(int) this.vertices[0].distance(this.vertices[1]);
            }else{
                return(int)this.vertices[1].distance(this.vertices[2]);
            }
        }else{
            if(this.vertices[0].distance(this.vertices[2]) > this.vertices[1].distance(this.vertices[2])){
                return(int) this.vertices[0].distance(this.vertices[2]);
            }else{
                return(int)this.vertices[1].distance(this.vertices[2]);
            }
        }
    }

    @Override
    public int getLongitudAltura() {
        int altura = 0;
        if(this.vertices[0].distance(this.vertices[1])==Triangulo.this.getLongitudBase()){
            altura = (int) Math.sqrt(Math.pow(Triangulo.this.getLongitudBase(), 2)+Math.pow(this.vertices[0].distance(this.vertices[2]), 2));
        }
        if(this.vertices[0].distance(this.vertices[2])==Triangulo.this.getLongitudBase()){
            altura = (int) Math.sqrt(Math.pow(Triangulo.this.getLongitudBase(), 2)+Math.pow(this.vertices[0].distance(this.vertices[1]), 2));
        }
        if(this.vertices[1].distance(this.vertices[2])==Triangulo.this.getLongitudBase()){
            altura = (int) Math.sqrt(Math.pow(Triangulo.this.getLongitudBase(), 2)+Math.pow(this.vertices[0].distance(this.vertices[1]), 2));
        }
        return altura;
    }

    @Override
    public boolean esHorizontal() {
        return Triangulo.this.getLongitudBase()>Triangulo.this.getLongitudAltura();
    }

    @Override
    public boolean esVertical() {
        return Triangulo.this.getLongitudBase()<Triangulo.this.getLongitudAltura();
    }

    @Override
    public double getArea() {
        return (Triangulo.this.getLongitudBase()*Triangulo.this.getLongitudAltura())/2;
    }

    @Override
    public int getPerimetro() {
        int p = 0;
        p += this.vertices[0].distance(this.vertices[1]);
        p += this.vertices[0].distance(this.vertices[2]);
        p += this.vertices[2].distance(this.vertices[1]);
        return p;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(Color.BLUE);
        g.create();
    }

    @Override
    public Color getColor() {
        return Color.BLUE;
    }
}
