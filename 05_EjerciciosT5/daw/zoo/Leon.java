
package tema5.daw.zoo;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Leon extends Animal{
    
    //CONSTRUCTOR
    public Leon(String n, int p) {
        super(n, p);
    }

    //SETTER
    @Override
    public void emitirSonido() {
        System.out.println("grrrr");
    }
}
