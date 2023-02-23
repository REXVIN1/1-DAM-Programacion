
package daw.persona;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Notas {
    //VALORES
    private List<Double>notas = new ArrayList<>();
    private static double total;
    
    //CONSTRUCTOR
    public Notas(){};
    
    //SETTERS
    public void añadirNota(double n){
        this.notas.add(n);
    }
    
    //GETTERS
    public int getTotalNotas(){        
        return notas.size();
    }
    public OptionalDouble calcularNotaMedia(){        
        for(int i=0;i<notas.size();i++){
            total+=notas.get(i);
        }
        OptionalDouble od = OptionalDouble.of(total/notas.size());
        return od;
    }
    public OptionalDouble calcularNotaMaxima(){        
        double nmaxima=0;
        for(int i=0, x=1;x<notas.size();i++){           
            if(notas.get(i)>notas.get(x)){
                nmaxima=notas.get(i);
            }else{
                nmaxima=notas.get(x);
            }
        }
        OptionalDouble od = OptionalDouble.of(nmaxima);
        return od;
    }
}
