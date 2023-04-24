
package tema5;

import java.util.ArrayList;
import java.util.List;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class PaquetesPepe implements EmpresaPaqueteria{
    //VARIABLES
    private final TransportistaOrdenado pepe;
    
    //CONSTRUCTOR
    public PaquetesPepe(){
        this.pepe = new TransportistaOrdenado(30);
    }

    //GETTER
    @Override
    public List<Transportista> getTransportista() {
        List<Transportista> transportista = new ArrayList<>();
        transportista.add(this.pepe);
        return transportista;
    }
    
    //SETTERS
    @Override
    public void registrarPedido(Paquete p) {
        System.out.println("Pedido aceptado");
        this.pepe.subirCamion(p);
    }

    @Override
    public void enviarPaquetes() {
        try {
            this.pepe.enviar();
        } catch (InterruptedException ex) {}
    }
    
    //TO STRING
    @Override
    public String toString(){
        return """
               PAQUETES PEPE:
               Transportista: """+this.pepe;
    }
}
