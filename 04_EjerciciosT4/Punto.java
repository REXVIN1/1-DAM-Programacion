
package daw.persona;

import java.awt.Dimension;
import java.awt.Toolkit;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Punto {
    private int x;
    private int y;
    
    public Punto(){
        x=0;
        y=0;
    };
    public Punto(int x, int y){
        Toolkit tol = Toolkit.getDefaultToolkit();
        Dimension d = tol.getScreenSize();
        x = d.width;
        y = 0;
    };
    public Punto(Punto p){
        x = (p.x+0)/2;
        y = (p.y+0)/2;        
    };
    public Punto(double angulo, double distancia){
        double x1 = Math.sin(angulo)*distancia;
        int x2 = (int) x1;
        x = x2;
        double y1 = Math.cos(angulo)*distancia;
        int y2 = (int) y1;
        y = y2;
    };
    
    
    //SETTERS
    
    public void setX(int x1){
        x = x1;
    }
    public void setY(int y1){
        y = y1;
    }
    
    //GETTERS
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
