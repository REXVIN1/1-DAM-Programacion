
package tema5.ejercicio07_08_09;

import java.util.HashMap;
import java.util.Map;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Programador extends TrabajadorTecleante{
    //VALORES
    private final Map<String, String> lenguajes = new HashMap<>();
    
    //CONSTRUCTOR
    public Programador(String n, int s, int ndni, char ldni, int ppm){
        super(n, s, ndni, ldni, ppm);
    }
    
    //SETTERS
    public void aprenderLenguaje(String lenguaje, String holaMundo){
        this.lenguajes.put(lenguaje, holaMundo);
    }
    public String programarHolaMundo(String lenguaje){
        if(lenguajes.containsKey(lenguaje)){
            return this.lenguajes.get(lenguaje);
        }else{
            throw new IllegalStateException("No existe dicho lenguaje en la lista");
        }
        
    }
    
    //TO STRING
    @Override
    public String toString(){
        String s = "PROGRAMADOR:\nNombre: "+Programador.super.getNombre()+
                "\nSueldo: "+Programador.super.getSueldo()+
                "\nDNI: "+Programador.super.getDNI()+
                "\nPPM: "+Programador.super.getPulsacionesMinuto();
        return s;
    }
}
