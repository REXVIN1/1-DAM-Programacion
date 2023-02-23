
package daw.persona;

import java.util.HashMap;
import java.util.Map;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class CajeroAutomatico implements Adinerado{
    //VALORES
    private Map<Integer, Integer> billetes = new HashMap<>();
    
    //CONSTRUCTOR
    public CajeroAutomatico(){
        this.billetes.put(1, 0);
        this.billetes.put(5, 0);
        this.billetes.put(10, 0);
        this.billetes.put(20, 0);
        this.billetes.put(50, 0);
    }
    
    @Override
    public boolean añadirDinero(int cantidad) {
        this.billetes.replace(50, 0, cantidad/50);
        this.billetes.replace(20, 0, (cantidad%50)/20);
        this.billetes.replace(10, 0, ((cantidad%50)%20)/10);
        this.billetes.replace(5, 0, (((cantidad%50)%20)%10)/5);
        this.billetes.replace(1, 0, (((cantidad%50)%20)%10)%5/1);
        return cantidad<=1000;
    }
    @Override
    public boolean retirarDinero(int cantidad) {
        this.billetes.replace(50, 0, cantidad/50);
        this.billetes.replace(20, 0, (cantidad%50)/20);
        this.billetes.replace(10, 0, ((cantidad%50)%20)/10);
        this.billetes.replace(5, 0, (((cantidad%50)%20)%10)/5);
        this.billetes.replace(1, 0, (((cantidad%50)%20)%10)%5/1);
        return cantidad<=1000;
    }

    @Override
    public double getDineroTotal() {
        double total=0;
        total += 50*billetes.get(50);
        total += 20*billetes.get(20);
        total += 10*billetes.get(10);
        total += 5*billetes.get(5);
        total += 1*billetes.get(1);
        return total;
    }
    @Override
    public String toString() {
        String s = "Billetes 50€: "+billetes.get(50)+"\n"+
                "Billetes de 20€: "+billetes.get(20)+"\n"+
                "Billetes de 10€: "+billetes.get(10)+"\n"+
                "Billetes de 5€: "+billetes.get(5)+"\n"+
                "Monedas de 1€:"+billetes.get(1);        
        return s;
    }
    
}
