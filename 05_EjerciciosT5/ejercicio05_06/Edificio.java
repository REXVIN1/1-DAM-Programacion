
package tema5.ejercicio05_06;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Edificio {
    //VARIABLES
    private String direccion;
    private int numeroPlantas;
    
    //CONSTRUCTOR
    public Edificio(String d, int np){
        if(np>=0){
            this.numeroPlantas = np;
            this.direccion = d;
        }       
    }
    
    //SETTERS
    public void setDirección(String d){
        this.direccion = d;
    }
    public void setNumeroPlantas(int np){
        this.numeroPlantas = np;
    }
    
    //GETTER
    public String getDireccion(){
        return this.direccion;
    }
    
    public int getNumeroPlantas(){
        return this.numeroPlantas;
    }
    
    //TO STRING
    @Override
    public String toString(){
        String s = "EDIFICIO:\nDirección: "+this.direccion+
                "\nNumero de plantas: "+this.numeroPlantas;
        return s;
    }
}
