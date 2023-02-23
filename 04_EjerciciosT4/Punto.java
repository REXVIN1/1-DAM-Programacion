
package daw.persona;

import java.awt.Dimension;
import java.awt.Toolkit;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Punto {
    //VALORES
    private int x;
    private int y;
    
    //CONSTRUCTORES
    public Punto(){
        this.x=0;
        this.y=0;
    };
    public Punto(int x, int y){
        Toolkit tol = Toolkit.getDefaultToolkit();
        Dimension d = tol.getScreenSize();
        x = d.width;
        y = 0;
    };
    public Punto(Punto p){
        this.x = (p.x+0)/2;
        this.y = (p.y+0)/2;        
    };
    public Punto(double angulo, double distancia){
        double x1 = Math.sin(angulo)*distancia;
        int x2 = (int) x1;
        this.x = x2;
        double y1 = Math.cos(angulo)*distancia;
        int y2 = (int) y1;
        this.y = y2;
    };    
    
    //SETTERS    
    public void setX(int x1){
        this.x = x1;
    }
    public void setY(int y1){
        this.y = y1;
    }
    
    //GETTERS    
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}
