
package tema5.ejercicio30_31_32.clases;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class EfectoInverso extends EfectoEspecial implements Simetrico{
    
//CONSTRUCTOR
    EfectoInverso(String n) {
        super(n);
        EfectoInverso ei = new EfectoInverso(n);
        EfectoEspecial.EFECTOS.add(ei);
    }
    
    //GETTER
    @Override
    public String aplicarEfecto(String frase) {
        StringBuilder sb = new StringBuilder(frase);
        return sb.reverse().toString();
    }
}
