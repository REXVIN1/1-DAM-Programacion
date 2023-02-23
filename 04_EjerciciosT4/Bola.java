
package daw.persona;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Bola {
    //VALORES
    private int numero;
    
    //CONSTRUCTOR
    public Bola(int numero){
        this.numero = numero;
    }
    
    //GETTERS
    public int getNumero(){
        return this.numero;
    } 
    
    @Override
    public String toString(){
        String s = "bola";
        return s;
    }
}
