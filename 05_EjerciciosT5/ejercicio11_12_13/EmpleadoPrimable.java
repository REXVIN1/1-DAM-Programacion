
package tema5.ejercicio11_12_13;

/*@author usuario-tarde*/

public class EmpleadoPrimable extends Empleado{
    //PROPIEDADES
    private boolean primado;
    
    //CONSTRUCTOR
    public EmpleadoPrimable(String n, double s) {
        super(n, s);
        this.primado = false;
    }
    
    //SETTER
    public void primar(){
        this.primado = true;
    }
    
    //GETTERS
    public boolean esPrimado(){
        return this.primado;
    }
    
    //TO STRING
    @Override
    public String toString(){
        String s = "EMPLEADO PRIMABLE:\nNombre: "+this.getNombre()+
                "\nSueldo: "+this.getSueldo()+
                "\nPrimado: "+this.primado;
        return s;
    }
}

