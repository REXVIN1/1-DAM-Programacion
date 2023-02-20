
package daw.persona;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Bombo {
    private Queue<Bola> bolas;
    
    //CONSTRUCTOR
    public Bombo(int totalBolas){
        this.bolas = new ArrayDeque<>();
        if(totalBolas<101&&totalBolas>0){         
            for(int i=0;i<totalBolas;i++){
                Bola b = new Bola(i);
                bolas.add(b);
            }                    }else{
            System.out.println("Introduiciste un valor incorrecto, por favor eliga entre 1 y 100");
        }       
    }
    
//VALORES
        //GETTERS
    public int getNumeroBolas(){
        return bolas.size();
    }
    public Optional<Bola> sacarBola(){
        Optional<Bola> b = Optional.of(bolas);
        return b;
    }
        
}
