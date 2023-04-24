
package tema5.ejercicio26_27_28_29;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public interface Apoyable extends FiguraGeometrica{
    
    //GETTERS
    public int getLongitudBase();
    public int getLongitudAltura();
    
    //METODOS DEFAULT
    public default boolean esHorizontal(){
        return Apoyable.this.getLongitudBase()>Apoyable.this.getLongitudAltura();
    }
    public default boolean esVertical(){
        return Apoyable.this.getLongitudBase()<Apoyable.this.getLongitudAltura();
    }
}
