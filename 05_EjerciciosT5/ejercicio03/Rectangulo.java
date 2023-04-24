
package tema5.ejercicio03;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Rectangulo {
    //VALORES 
    private int base;
    private int altura;
    private final int area;
    
    //CONSTRUCTOR
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        this.area = base*altura;
    }
    
    //SETTERS
    public void setBase(int b){
        this.base = b;
    }
    public void setAltura(int a){
        this.altura = a;
    }
    
    //GETTERS
    public int getArea(){
        return this.area;
    }
    public int getBase(){
        return this.base;
    }
    public int getAltura(){
        return this.altura;
    }
    
    //TO STRING
    @Override
    public String toString(){
        String s = "RECTANGULO (en centimetros):\nBase: "+this.base+" cm"+
                "\nAltura: "+this.altura+" cm"+
                "\nArea: "+this.area+" cm^2";
        return s;
    }
}
