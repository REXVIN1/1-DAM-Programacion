
package tema5.ejercicio11_12_13;

/*@author usuario-tarde*/

public class CuerpoTecnico extends Empleado{
    //PROPIEDADES
    private final String puesto;
    
    //CONSTRUCTOR
    public CuerpoTecnico(String n, double s, String p) {
        super(n, s);
        this.puesto = p;
    }
    
    //GETTER
    public String getPuesto(){
        return this.puesto;
    }
    
    //TO STRING
    @Override
    public String toString(){
        String s = "CUERPO TÉCNICO:\nNombre: "+CuerpoTecnico.super.getNombre()+
                "\nSueldo: "+CuerpoTecnico.super.getSueldo()+
                "\nPuesto: "+this.puesto;
        return s;
    }
}
