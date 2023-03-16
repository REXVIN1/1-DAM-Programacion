
package tema5;

import java.util.ArrayList;
import java.util.List;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Compras {
    //VALORES 
    private double presupuesto;
    private List<Double> precios = new ArrayList<>();
    
    //CONSTRUCTOR
    public Compras(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    //SETTER
    public void registrarCompra(double dinero) throws Exception{
        if(dinero<=this.presupuesto&&dinero>=0){
            this.precios.add(dinero);
            this.presupuesto -= dinero;
        }else{
            throw new Exception("No hay suficiente presupuesto");
        }         
    }
    public void setPresupuesto(double p){
        this.presupuesto = p;
    }
    
    //GETTERS
    public double getPresupuesto(){
        return this.presupuesto;
    }
    public int getTotalArticulosComprados(){
        return this.precios.size();
    }
    
    //TO STRING
    @Override
    public String toString(){
        String s = "COMPRA:\nPresupuesto: "+this.presupuesto+
                "\nPrecios: "+this.precios;
        return s;
    }
}
