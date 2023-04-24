
package tema5.daw.zoo;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class TransporteAnimales extends Jaula{
    
    //CONSTRUCTOR
    public TransporteAnimales(){
        super(6,500);
    }
    
    @Override
    protected boolean comprobarDisponibilidadPlaza(Animal a) {
        return TransporteAnimales.super.comprobarDisponibilidadPlaza(a);
    }
}
