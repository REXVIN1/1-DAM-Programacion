package daw.persona;

import java.util.Optional;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Caja {
    //VALORES
    private boolean abierto=false;
    private String mensaje;
    
    //CONSTRUCTORES
    public Caja(String m) throws IllegalArgumentException{
        if(m==null){
            IllegalArgumentException e = new IllegalArgumentException();
            throw e;
        }else{
            this.mensaje = m;
        }
    }
    public Caja(boolean a,String m){
        abierto = a;
        mensaje = m;
    };
    public Caja(){
        this.mensaje = "Viva el tema 7";
    };
    
    
    //SETTERS
    public void setMensaje(String m){
        if(abierto){
            this.mensaje = m;            
        }
    }
    public void pasarMayusculas(){
        this.mensaje = mensaje.toUpperCase();
    }
    public void abrir(){
        this.abierto = true;
    }
    public void cerrar(){
        this.abierto = false;
    }
    public Optional<String> getMensaje2(){
        if(abierto){
            Optional<String> o = Optional.of(this.mensaje);
            return o; 
        }else{
            Optional<String> o = Optional.empty();
            return o;
        }  
    }
    
    
    //GETTERS
    public String getMensaje(){
        if(abierto){
           return this.mensaje; 
        }else{
            return null;
        }        
    }
    public boolean getCajaAbierta(){
        return this.abierto;
    }
}
