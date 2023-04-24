
package tema5.daw.zoo;

import java.util.HashSet;
import java.util.Set;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public abstract class ContenedorAnimales {
    
    //VARIABLES
    protected Set<Animal> animales;
    
    //CONSTRUCTOR
    public ContenedorAnimales() {
        this.animales = new HashSet();
    }
    
    //GETTERS
    public boolean añadir(Animal a){
        if(ContenedorAnimales.this.comprobarDisponibilidadPlaza(a)){
            this.animales.add(a);
            a.setEncerrado(true);
            return true;
        }
        return false;
    }
    public boolean retirar(Animal a){
        if(this.animales.contains(a)){
            this.animales.remove(a);
            return true;
        }
        return false;
    }
    public int getPesoActual(){
        int peso_total = 0;
        for(Animal a : this.animales){
            peso_total += a.getPeso();
        }
        return peso_total;
    }
    public int getNumeroAnimales(){
        return this.animales.size();
    }
    
    protected abstract boolean comprobarDisponibilidadPlaza(Animal a);
}
