
package daw.persona;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class MarcadorBaloncesto {
    //VALORES
    private String nombreLocal;
    private String nombreVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    public LocalDate fecha;
    
    //CONSTRUCTORES
    public MarcadorBaloncesto(String nL, String nV){
        this.nombreLocal = nL;
        this.nombreVisitante = nV;
        this.fecha = LocalDate.now();
        this.puntosLocal = 0;
        this.puntosVisitante = 0;
    }
    public MarcadorBaloncesto(String nL, String nV, LocalDate f){
        this.nombreLocal = nL;
        this.nombreVisitante = nV;
        this.fecha = f;
        this.puntosLocal = 0;
        this.puntosVisitante = 0;
    }
    private MarcadorBaloncesto(String nL, int pL, String nV, int pV, LocalDate f){
        this.nombreLocal = nL;
        this.nombreVisitante = nV;
        this.puntosLocal = pL;
        this.puntosVisitante = pV;
        this.fecha = f;        
    }
    
    //SETTERS
    public void añadirCanasta(char equipo,int puntos) throws IllegalArgumentException{
        try{
            if(puntos>0&&puntos<=3){
                if(equipo=='L'){
                    this.puntosLocal+=puntos;
                }if(equipo=='V'){
                    this.puntosVisitante+=puntos;
                }            
            }            
        }catch(IllegalArgumentException e){}
    }
    public void reset(){
        this.puntosLocal = 0;
        this.puntosVisitante = 0;        
    }
    public void guardar(String ruta) throws IOException{
        File f = new File(ruta);
        f.createNewFile();
        PrintWriter pw = new PrintWriter(f);
        pw.println(this.nombreLocal);
        pw.println(this.puntosLocal);
        pw.println(this.nombreVisitante);
        pw.println(this.puntosVisitante);
        pw.close();    
    }
    
    
    //GETTERS
    public int getPuntosLocal(){
        return this.puntosLocal;
    }
    public int getPuntosVisitante(){
        return this.puntosVisitante;
    }
    public boolean ganaLocal(){
        return this.puntosLocal>this.puntosVisitante;
    }
    public boolean ganaVisitante(){
        return this.puntosLocal<this.puntosVisitante;
    }
    public boolean hayEmpate(){
        return this.puntosLocal==this.puntosVisitante;
    }
}
