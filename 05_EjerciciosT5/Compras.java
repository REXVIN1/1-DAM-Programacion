
package tema.pkg5;

import java.util.List;

/*@author usuario-tarde*/

public class Compras {
    public double presupuesto;
    public List<Double> precios;

    public Compras(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    public void registrarCompra(double dinero) throws Exception{
        if(dinero>this.presupuesto){
            this.precios.add(dinero);
        }else{
            throw new Exception("No hay suficiente presupuesto");
        }         
    }
}
