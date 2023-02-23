
package daw.persona;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Reloj {
    //VALORES
    private LocalTime hora;
    
    //CONSTRUCTOR
    public Reloj(){        
        this.hora = LocalTime.now();
    }

    //GETTERS
    public boolean esNoche(){
        return this.hora.getHour()<=20&&this.hora.getHour()>=8;
    }
    @Override
    public String toString(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");
        String s = this.hora.format(dtf);
        return s;
    }
    
    //SETTERS
    public void añadir(int segundos){                
        this.hora = this.hora.plusSeconds(segundos);        
    }
    public void esperar(int segundos) throws InterruptedException{        
        Thread.sleep(segundos*1000);
        this.hora = LocalTime.now();
    }
}
