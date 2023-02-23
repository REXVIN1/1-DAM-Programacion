
package daw.persona;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class EquipoMusica {
    //VALORES
    private Altavoz[] altavoces;
    
    //CONSTRUCTOR
    public EquipoMusica(int numeroAltavoces){
        this.altavoces = new Altavoz[numeroAltavoces];
        for(int i=0;i<numeroAltavoces;i++){
            Altavoz a = new Altavoz();  
            this.altavoces[i] = a;
        }
    }
    
    //GETTERS
    public Altavoz getAltavoz(int posicion){
        return this.altavoces[posicion];
    }
      
    //SETTERS
    public void setVolumen(int numeroAltavoz, int volumen){
        this.altavoces[numeroAltavoz].setVolumen(volumen); 
    }
}
