
package tema5.ejercicio30_31_32.clases;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class EfectoMayusculas extends EfectoEspecial{
    
    //CONSTRUCTOR
    EfectoMayusculas(String n) {
        super(n);
        EfectoMayusculas em = new EfectoMayusculas(n);
        EfectoEspecial.EFECTOS.add(em);
    } 
    
    //GETTER
    @Override
    public String aplicarEfecto(String frase) {
        return frase.toUpperCase();
    }
}
