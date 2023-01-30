
package cafetera;

/*@author usuario-mañana*/

public class Cafetera {

    public static void main(String[] args) {
        //VARIABLES
    private int _capacidadMaxima;
    private int _cantidadActual;
    
    //CONSTRUCTORES
    public Cafetera(){
        _capacidadMaxima = 1000;
        _cantidadActual = 0;
    };
    public Cafetera(int cmax){
        _capacidadMaxima = cmax;
        _cantidadActual = _capacidadMaxima;
    };
    public Cafetera(int cmax, int cact){
        if(cact>cmax){
            cact = cmax;
        }        
        _capacidadMaxima = cmax;
        _cantidadActual = cact;
    };
    
    //GETTERS
    public int getCapacidadMax(){
        return _capacidadMaxima;
    }
    public int getCapacidadActual(){
        return _cantidadActual;
    }
    

    //SETTERS  
    public void setCapacidadActual(int capacidad){
        _cantidadActual = capacidad;
    }
    public void setCapacidadMax(int cm){
        _capacidadMaxima = cm;
    }
    public void llenarCafetera(){
        _cantidadActual=_capacidadMaxima;
    }        
    public void servirTaza(int servir){        
        if(servir>=_cantidadActual){
            _cantidadActual=0; 
        }
    }        
    public void vaciarCafetera(){
        _cantidadActual=0;
        _capacidadMaxima=0;
    }
    public void agregarCafe(int cafe){
        _cantidadActual+=cafe;
    }
}
