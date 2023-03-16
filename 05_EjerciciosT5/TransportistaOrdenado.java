
package tema5;

import java.util.ArrayList;
import java.util.List;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class TransportistaOrdenado extends Transportista{
    //VARIABLES
    private final List<Paquete> paquetes;
    
    //CONSTRUCTOR
    public TransportistaOrdenado(long te){
        super(te);
        this.paquetes = new ArrayList<>();
    }
    
    //SETTERS
    @Override
    public void subirCamion(Paquete p){
        this.paquetes.add(p);
    }
    
    @Override
    public void enviar() throws InterruptedException{
        this.paquetes.sort((o1, o2) -> o1.compareTo(o2));
        for(Paquete p : this.paquetes){
            System.out.println("Enviando...");
            Thread.sleep(super.getTiempoEspera());
            System.out.println("El paquete "+p.getProducto()+
                    " con prioridad "+p.getPrioridad()+
                    " a llegado a: "+p.getDireccionDestino());
        }
    }
     
    //TO STRING
    @Override
    public String toString(){
        return """
               TRANSPORTISTA ORDENADO:
               Tiempo de entrega (m): """+super.getTiempoEspera()+
                "\nPaquetes cargados: "+this.paquetes.size();
    }
}
