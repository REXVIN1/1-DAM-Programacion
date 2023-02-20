
package daw.persona;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Monedero implements Adinerado{
    //VALORES
    private double dinero;
    
    //CONSTRUCTOR
    public Monedero(){
        this.dinero = 0;
    }

    @Override
    public double getDineroTotal() {
        return this.dinero;
    }

    @Override
    public boolean añadirDinero(int cantidad) {
        if(cantidad<=1000){
            this.dinero+=cantidad;            
        }
        return cantidad<=1000;
    }

    @Override
    public boolean retirarDinero(int cantidad) {
        if(cantidad<=dinero){
            this.dinero-=cantidad;            
        }
        return cantidad>=this.dinero;
    }
}
