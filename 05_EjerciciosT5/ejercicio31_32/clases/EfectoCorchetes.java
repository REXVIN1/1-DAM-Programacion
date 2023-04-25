
package tema5.ejercicio30_31_32.clases;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class EfectoCorchetes extends EfectoEspecial implements Simetrico{
    
    //CONSTRUCTOR
    EfectoCorchetes(String n) {
        super(n);
        EfectoCorchetes ec = new EfectoCorchetes(n);
        EfectoEspecial.EFECTOS.add(ec);
    } 

    //GETTER
    @Override
    public String aplicarEfecto(String frase) {
        if(frase.substring(0).equals("[") && frase.substring(frase.length()).equals("]")){
            return frase.substring(1, frase.length()-1);
        }else{
            return "["+frase+"]";
        }
    }
}
