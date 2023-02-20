
package daw.persona;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Banco implements Adinerado{
    //VALORES
    private double dinero;
    
    //CONSTRUCTOR
    public Banco(){
        this.dinero = 0;
    }    

    @Override
    public double getDineroTotal() {
        return this.dinero;
    }

    @Override
    public boolean añadirDinero(int cantidad) {
        boolean b = cantidad<=1000;
        if(b){
            this.dinero+=cantidad;            
        }
        return b;
    }

    @Override
    public boolean retirarDinero(int cantidad) {
        boolean b = cantidad<=this.dinero;
        if(b){
            this.dinero-=cantidad;            
        }
        return b;
    }
}
