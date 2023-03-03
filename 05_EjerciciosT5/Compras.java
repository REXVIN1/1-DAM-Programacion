
package tema.pkg5;

import java.util.ArrayList;
import java.util.List;

/*@author usuario-tarde*/

public class Compras {
    //VALORES
    public double presupuesto;
    public List<Double> precios = new ArrayList<>();
    
    //CONSTRUCTOR
    public Compras(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    //GETTER
    public void registrarCompra(double dinero) throws Exception{
        if(dinero<=this.presupuesto&&dinero>=0){
            this.precios.add(dinero);
            this.presupuesto -= dinero;
        }else{
            throw new Exception("No hay suficiente presupuesto");
        }         
    }
    
    //TO STRING
    @Override
    public String toString(){
        String s = "Presupuesto: "+this.presupuesto+
                "\nPrecios: "+this.precios;
        return s;
    }
}
