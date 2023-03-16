
package tema5;

/*@author usuario-tarde*/

public class Futbolista extends EmpleadoPrimable{
    
    //PROPIEDADES
    private final int dorsal;
    
    //CONSTRUCTOR
    public Futbolista(String n, double s, int d){
        super(n, s);
        this.dorsal = d;
    }
    
    //TO STRING
    @Override
    public String toString(){
        String s = "FUTBOLISTA:\nNombre: "+this.getNombre()+
                "\nSueldo: "+this.getSueldo()+
                "\nDorsal: "+this.dorsal;
        return s;
    }
}
