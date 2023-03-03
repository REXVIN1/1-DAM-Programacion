
package tema.pkg5;

/*@author usuario-tarde*/

public class Rectangulo {    
    //VALORES
    public int base;
    public int altura;
    public int area;
    
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
        String s = "Base: "+this.base+
                "\nAltura: "+this.altura+
                "\nArea: "+this.area;
        return s;
    }
}
