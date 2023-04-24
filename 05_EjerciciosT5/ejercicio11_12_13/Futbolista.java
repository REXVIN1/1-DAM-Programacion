
package tema5.ejercicio11_12_13;

/*@author usuario-tarde*/

public class Futbolista extends EmpleadoPrimable{
    
    //PROPIEDADES
    private final int dorsal;
    
    //CONSTRUCTOR
    public Futbolista(String n, double s, int d){
        super(n, s);
        this.dorsal = d;
    }
    
    //GETTERS
    public int getDorsal(){
        return this.dorsal;
    }
    
    //TO STRING
    @Override
    public String toString(){
        String s = "FUTBOLISTA:\nNombre: "+Futbolista.super.getNombre()+
                "\nSueldo: "+Futbolista.super.getSueldo()+
                "\nDorsal: "+this.dorsal;
        return s;
    }
}
