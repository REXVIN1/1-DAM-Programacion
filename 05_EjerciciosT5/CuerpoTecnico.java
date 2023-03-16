
package tema5;

/*@author usuario-tarde*/

public class CuerpoTecnico extends Empleado{
    //PROPIEDADES
    private String puesto;
    
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
        String s = "CUERPO TÉCNICO:\nNombre: "+this.getNombre()+
                "\nSueldo: "+this.getSueldo()+
                "\nPuesto: "+this.puesto;
        return s;
    }
}
