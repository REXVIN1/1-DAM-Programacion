
package tema5;

/*@author usuario-tarde*/

public class AdivinanzaException extends Exception {
   
   //CONSTRUCTOR POR DEFECTO
    public AdivinanzaException(){}
    
    //CONSTRUCTOR
    public AdivinanzaException(String mensaje){
        super(mensaje);
    }
}
