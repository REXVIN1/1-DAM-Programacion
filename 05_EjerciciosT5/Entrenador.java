
package tema5;

/*@author usuario-tarde*/

public class Entrenador extends EmpleadoPrimable{
    
    //CONSTRUCTOR
    public Entrenador(String n, double s){
        super(n, s);
    }
    
    //TO STRING
    @Override
    public String toString(){
        String s = "ENTRENADOR:\nNombre: "+this.getNombre()+
                "\nSueldo: "+this.getSueldo();
        return s;
    }
}
