
package tema5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class EmpresaLowCost implements EmpresaPaqueteria{
    //VARIABLES
    private final Transportista[] transportistas;
    private int siguienteTransportista;
    
    //CONSTRUCTOR
    public EmpresaLowCost(int n){
        this.transportistas = new Transportista[n];
        Transportista t;
        Random r = new Random();
        for(int i=0;i<n;i++){
            t = new Transportista(r.nextInt(40, 80));
            this.transportistas[i] = t;
        }
        this.siguienteTransportista = -1;
    }
    
    //GETTER
    @Override
    public List<Transportista> getTransportista() {
        List<Transportista> transportista = new ArrayList<>();
        transportista.addAll(Arrays.asList(this.transportistas));
        return transportista;
    }
    
    //SETTERS
    @Override
    public void registrarPedido(Paquete p) {
        this.siguienteTransportista++;
        this.transportistas[this.siguienteTransportista].subirCamion(p);
    }

    @Override
    public void enviarPaquetes() {
        try {
            this.transportistas[this.siguienteTransportista].enviar();
        } catch (InterruptedException ex) {}
    }
    
    //TO STRING
    @Override
    public String toString(){
        String trabajadores = "\n";
        for(Transportista t : this.transportistas){
            trabajadores += t+"\n";
        }
        return """
               EMPRESA LOW COST:
               Transportistas: """+trabajadores;
    }
}
