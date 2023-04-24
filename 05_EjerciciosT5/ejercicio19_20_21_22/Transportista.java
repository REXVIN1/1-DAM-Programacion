
package tema5;

import java.util.ArrayList;
import java.util.List;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Transportista {
    //VARIABLES
    private final List<Paquete> paquetes;
    private final long tiempoEntrega;
    
    //CONSTRUCTOR
    public Transportista(long te){
        this.tiempoEntrega = te*60000;
        this.paquetes = new ArrayList<>();
    }
    
    //SETTERS
    public void subirCamion(Paquete p){
        this.paquetes.add(p);
    }
    public void enviar() throws InterruptedException{
        for(Paquete p : this.paquetes){
            System.out.println("Enviando...");
            Thread.sleep(this.tiempoEntrega);
            System.out.println("El paquete "+p.getProducto()+
                    " con prioridad "+p.getPrioridad()+
                    " a llegado a: "+p.getDireccionDestino());
        }
    }
    
    //GETTERS
    public long getTiempoEspera(){
        return this.tiempoEntrega;
    }
    
    //TO STRING
    @Override
    public String toString(){
        return """
               TRANSPORTISTA:
               Tiempo de entrega (m): """+this.tiempoEntrega+
                "\nPaquetes cargados: "+this.paquetes.size();
    }
}
