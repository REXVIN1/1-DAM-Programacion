
package tema5;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Trabajador {
    //VALORES
    private final String dni;
    private final String nombre;
    protected int sueldo;
    
    //CONSTRUCTOR
    public Trabajador(String nombre, int s, int ndni, char ldni){
        this.nombre = nombre;
        this.sueldo= s;
        this.dni = Integer.toString(ndni)+ldni;
    }
    
    //GETTERS
    public int getSueldo(){
        return this.sueldo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getDNI(){
        return this.dni;
    }
    
    //TO STRING
    @Override
    public String toString(){
        String s = "TRABAJADOR:\nNombre: "+this.nombre+
                "\nSueldo: "+this.sueldo+
                "\nDNI: "+this.dni;
        return s;
    }
}
