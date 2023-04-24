
package tema5.daw.zoo;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Tigre extends Animal{
    
    //CONSTRUCTOR
    public Tigre(String n, int p) {
        super(n, p);
    }
    
    //SETTER
    @Override
    public void emitirSonido() {
        System.out.println("wraar");
    }
}
