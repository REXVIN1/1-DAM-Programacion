
package tema5.ejercicio07_08_09;

import java.time.LocalDateTime;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Administrativo extends TrabajadorTecleante{
    //CONSTRUCTOR
    public Administrativo(String n, int s, int ndni, char ldni, int ppm){
        super(n, s, ndni, ldni, ppm);
    }
    
    //SETTER
    public void escribirInforme(String t){
        LocalDateTime fecha_hora = LocalDateTime.now();
        String informe = fecha_hora.toString(); 
    }
    
    //TO STRING
    @Override
    public String toString(){
        String s = "ADMINISTRATIVO:\nNombre: "+Administrativo.super.getNombre()+
                "\nSueldo: "+Administrativo.super.getSueldo()+
                "\nDNI: "+Administrativo.super.getDNI()+
                "\nPPM: "+Administrativo.super.getPulsacionesMinuto();
        return s;
    }
}
