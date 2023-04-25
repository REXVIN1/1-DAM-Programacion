
package tema5.ejercicio30_31_32.clases;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class EfectoGuiones extends EfectoEspecial{
    
//CONSTRUCTOR
    EfectoGuiones(String n) {
        super(n);
        EfectoGuiones eg = new EfectoGuiones(n);
        EfectoEspecial.EFECTOS.add(eg);
    }
    
    //GETTER
    @Override
    public String aplicarEfecto(String frase) {
        return frase.replaceAll("\\s+", "_");
    }
}
