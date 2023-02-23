
package daw.persona;

import java.util.ArrayDeque;
import java.util.Optional;
import java.util.Queue;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Bombo {
    //VALORES
    private Queue<Bola> bolas;
    
    //CONSTRUCTOR
    public Bombo(int totalBolas){
        this.bolas = new ArrayDeque<>();
        if(totalBolas<101&&totalBolas>0){         
            for(int i=0;i<totalBolas;i++){
                Bola b = new Bola(i);
                this.bolas.add(b);
            }                    
        }else{
            System.out.println("Introduciste un valor incorrecto, por favor eliga entre 1 y 100");
        }       
    }
    
    //GETTERS
    public int getNumeroBolas(){
        return this.bolas.size();
    }
    public Optional<Bola> sacarBola(){
        Optional<Bola> b = Optional.of(this.bolas.poll());
        return b;
    }        
}
