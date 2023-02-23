
package daw.persona;

import java.util.Random;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Persona2 {
    //VALORES
    private String nombre;
    private double altura;
    
    //CONSTRUCTOR
    public Persona2(String nombre){
        Random r = new Random();
        this.nombre = nombre;
        this.altura = r.nextDouble(1.5, 2.1);
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    public double getAltura(){
        return this.altura;
    }
}
