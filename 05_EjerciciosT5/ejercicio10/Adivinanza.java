
package tema5.ejercicio10;

import java.time.Instant;

/*@author usuario-tarde*/

public class Adivinanza{
    //PROPIEDADES
    private final String enunciado;
    private final String respuestaCorrecta;
    private Instant inicio;
    
    /*
    *CONSTRUCTOR
    *
    *@param e enunciado
    *@param rc respuesta correcta
    */
    public Adivinanza(String e, String rc){
        this.enunciado = e;
        this.respuestaCorrecta = rc;
        this.inicio = null;
    }
    
    //GETTER
    public String getEnunciado(){
        this.inicio = Instant.now();
        return this.enunciado;
    }
    
    //SETTER
    public void comprobar(String respuesta) throws TiempoSuperadoException, AdivinanzaIncorrectaException{
        Instant i = Instant.now();
        if(i.getEpochSecond()-this.inicio.getEpochSecond()>30){
            throw new TiempoSuperadoException("Se ha alcanzado el tiempo máximo");
        }
        
        if(!respuesta.equalsIgnoreCase(this.respuestaCorrecta)){
            throw new AdivinanzaIncorrectaException("La respuesta es incorrecta");
        }
    }
    
    //TO STRING
    @Override
    public String toString(){
        return "ADIVINANZA\nEnunciado: "+this.enunciado;
    }
}
