
package tema5.examen1;

import java.util.ArrayList;
import java.util.List;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Procesador {
    //VALORES
    public int totalprocesos = 0;
    
    //CONSTRUCTOR
    public Procesador(){}
    
    //GETTERS    
    public List<Object> procesar() throws ProcesadorException{
        List<Object> enteros = new ArrayList();
        for(Object e : enteros){
            if(e instanceof String string){
                enteros.add(this.procesarCadena(string));
            }else if(e instanceof Coche coche){
                enteros.add(this.procesarCoche(coche));
            }else if(e instanceof Integer integer){
                enteros.add(this.procesarInteger(integer));
            }else{
                throw new ProcesadorException("Tipo de dato NO válido");
            }
        }
        this.totalprocesos++;
        return enteros;
    }
    
    public int procesarCadena(String cadena){
        this.totalprocesos++;
        return cadena.length();
    }
    
    public int procesarInteger(int entero){
        this.totalprocesos++;
        return entero;
        
    }
    public int procesarCoche(Coche car){
        this.totalprocesos++;
        return car.getNumPuertas();
    }

    public int getTotalProcesos(){
        return this.totalprocesos;
    }
    
    //TOSTRING
    public String toString(){
        String s = "PROCESADOR:\nProcesos: "+this.totalprocesos;
        return s;
    }
}
