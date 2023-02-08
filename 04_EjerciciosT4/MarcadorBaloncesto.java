/*
 */
package daw.persona;

import java.time.LocalDate;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class MarcadorBaloncesto {
    private String nombreLocal;
    private String nombreVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    LocalDate fecha;
    
    public MarcadorBaloncesto(String nL, String nV){
        nombreLocal = nL;
        nombreVisitante = nV;
        fecha = LocalDate.now();
        puntosLocal = 0;
        puntosVisitante = 0;
    }
    public MarcadorBaloncesto(String nL, String nV, LocalDate f){
        nombreLocal = nL;
        nombreVisitante = nV;
        fecha = f;
        puntosLocal = 0;
        puntosVisitante = 0;
    }
    private MarcadorBaloncesto(String nL, int pL, String nV, int pV, LocalDate f){
        nombreLocal = nL;
        nombreVisitante = nV;
        puntosLocal = pL;
        puntosVisitante = pV;
        fecha = f;        
    }
    
    //SETTERS
    public void añadirCanasta(char equipo,int puntos){
        if(puntos>0&&puntos<=3){
            if(equipo=='L'){
                puntosLocal+=puntos;
            }if(equipo=='V'){
                puntosVisitante+=puntos;
            }            
        }
    }
    public void reset(){
        puntosLocal = 0;
        puntosVisitante = 0;        
    }
    
    //GETTERS
    public int getPuntosLocal(){
        return puntosLocal;
    }
    public int getPuntosVisitante(){
        return puntosVisitante;
    }
    public boolean ganaLocal(){
        return puntosLocal>puntosVisitante;
    }
    public boolean ganaVisitante(){
        return puntosLocal<puntosVisitante;
    }
    public boolean hayEmpate(){
        return puntosLocal==puntosVisitante;
    }
}
