
package tema5;

import java.util.ArrayList;
import java.util.List;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class EmpresaPremium implements EmpresaPaqueteria{
    //VARIABLES
    private final Transportista rapido;
    private final Transportista medio;
    private final Transportista lento;
    
    //CONSTRUCTOR
    public EmpresaPremium(){
        this.rapido = new Transportista(10);
        this.medio = new Transportista(25);
        this.lento = new Transportista(50);
    }
    
    //GETTER
    @Override
    public List<Transportista> getTransportista() {
        List<Transportista> transportista = new ArrayList<>();
        transportista.add(this.rapido);
        transportista.add(this.medio);
        transportista.add(this.lento);
        return transportista;
    }

    //SETTER
    @Override
    public void registrarPedido(Paquete p) {
        if(p.getPrioridad()==1){
            System.out.println("Pedido aceptado");
            this.lento.subirCamion(p);
        }
        if(p.getPrioridad()==2){
            System.out.println("Pedido aceptado");
            this.medio.subirCamion(p);
        }
        if(p.getPrioridad()==3){
            System.out.println("Pedido aceptado");
            this.rapido.subirCamion(p);
        }
    }

    @Override
    public void enviarPaquetes() {
        try {
            this.rapido.enviar();
            this.medio.enviar();
            this.lento.enviar();
        } catch (InterruptedException ex) {}
    }
    
    //TO STRING
    @Override
    public String toString(){
        return "EMPRESA PREMIUM:\n1 "+this.rapido+
                "\n2 "+this.medio+
                "\n3 "+this.lento;
    }
}
