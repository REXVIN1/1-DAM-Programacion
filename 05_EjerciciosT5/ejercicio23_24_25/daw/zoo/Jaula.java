
package tema5.daw.zoo;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Jaula extends ContenedorAnimales{
    
    //VARIABLES
    private final int capacidadMaxima;
    private final int pesoMaximo;
    
    //CONSTRUCTOR
    public Jaula(int cm, int pm) {
        this.capacidadMaxima = cm;
        this.pesoMaximo = pm;
    }
    
    //GETTERS
    public int getCapacidadMaxima() {
        return this.capacidadMaxima;
    }
    public int getPesoMaximo() {
        return this.pesoMaximo;
    }

    @Override
    protected boolean comprobarDisponibilidadPlaza(Animal a) {
        return Jaula.super.getPesoActual()+a.getPeso()<=this.pesoMaximo&&Jaula.super.getNumeroAnimales()+1<=this.capacidadMaxima;
    }
}
