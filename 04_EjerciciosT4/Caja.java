
package daw.persona;

/*@author Kevin Gómez <kgomval118@g.educaand.es>*/

public class Caja {
    private boolean abierto=false;
    private String mensaje;
    
    public Caja(String m){
        mensaje = m;
    };
    public Caja(boolean a,String m){
        abierto = a;
        mensaje = m;
    };
    public Caja(){
        mensaje = "Viva el tema 7";
    };
    
    
    //SETTERS
    public void setMensaje(String m){
        if(abierto){
            mensaje = m;            
        }
    }
    public void pasarMayusculas(){
        mensaje = mensaje.toUpperCase();
    }
    public void abrir(){
        abierto = true;
    }
    public void cerrar(){
        abierto = false;
    }
    
    
    //GETTERS
    public String getMensaje(){
        if(abierto){
           return mensaje; 
        }else{
            return null;
        }        
    }
    public boolean getCajaAbierta(){
        return abierto;
    }
}
