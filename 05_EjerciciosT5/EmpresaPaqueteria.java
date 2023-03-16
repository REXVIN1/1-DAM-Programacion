
package tema5;

import java.util.List;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public interface EmpresaPaqueteria {
    
    //GETTER
    public List<Transportista> getTransportista();
    
    //SETTERS
    public void registrarPedido(Paquete p);
    public void enviarPaquetes();
}
