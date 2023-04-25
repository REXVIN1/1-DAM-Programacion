
package tema5.ejercicio30_31_32.clases;

import java.util.ArrayList;
import java.util.List;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/
public abstract class EfectoEspecial {
    
    //VARIABLES
    public static List<EfectoEspecial> EFECTOS;
    private String nombre;
    
    //CONSTRUCTOR
    public EfectoEspecial(String n){
        this.nombre = n;
        EfectoEspecial.EFECTOS = new ArrayList<>();
    }
    
    //GETTER
    public String getNombre(){
        return this.nombre;
    }
    
    //SETTER
    public abstract String aplicarEfecto(String frase);
}
