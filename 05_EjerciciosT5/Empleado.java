
package tema5;

/*@author usuario-tarde*/

public class Empleado implements Nombrable{
    //PROPIEDADES
    private String nombre;
    private double sueldo;
    private double dinero;
    
    //CONSTRUCTOR
    /*
    *@param n nombre del empleado
    *@param s sueldo del empleado
    */
    public Empleado(String n, double s){
        this.nombre = n;
        this.sueldo = s;
        this.dinero = 0;
    }
    
    //GETTERS
    public double getSueldo(){
        return this.sueldo;
    }
    
    public double getDinero(){
        return this.dinero;
    }
    
    @Override
    public String getNombre() {
        return this.nombre;
    }
    
    //SETTER
    public void cobrar(double cantidad) throws CabreoException{
        if(cantidad>=this.sueldo){
            this.dinero += cantidad;
        }else{
            this.dinero += cantidad;
            throw new CabreoException("Al empleado "+this.nombre+" no se le han pagado "+this.sueldo+" euros");
        }
    }
    
    //TO STRING
    @Override
    public String toString(){
        String s = "EMPLEADO:\nNombre: "+this.nombre+
                "\nSueldo: "+this.sueldo+
                "\nDinero: "+this.dinero;
        return s;
    }
}
