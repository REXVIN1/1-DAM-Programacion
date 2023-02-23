
package ejercicio36;

import java.util.Random;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Persona implements Comparable<Persona>{
    
    //VALORES
    private final String nombre;
    private final double altura;
    
    //CONSTRUCTOR
    public Persona(String nombre){
        Random r = new Random();
        this.nombre = nombre;
        this.altura = r.nextDouble(1.5, 2.1);
    }
    
    //GETTER
    public String getNombre(){
        return this.nombre;
    }
    public double getAltura(){
        return this.altura;
    }        
    
    @Override
    public int compareTo(Persona o) {
        return Double.compare(this.altura, o.altura);
    }
    
    @Override
    public String toString(){
        String s = "Nombre: "+this.nombre+"\n"+this.altura+"\n\n";
        return s;
    }
}
