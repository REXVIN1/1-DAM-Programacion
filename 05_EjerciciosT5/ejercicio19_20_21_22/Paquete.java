
package tema5;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Paquete {
    //VARIABLES
    public static final int ALTA=1;
    public static final int MEDIA=2;
    public static final int BAJA=3;
    private final String producto;
    private final String direccionDestino;
    private int prioridad;
    
    //CONSTRUCTOR
    public Paquete(String pro, String dd, int pri){
        this.producto = pro;
        this.direccionDestino = dd;
        if(pri==BAJA||pri==MEDIA||pri==ALTA){
            this.prioridad = pri;
        }else{
            throw new IllegalArgumentException("Indica un nivel de prioridad apropiado, entre 1 y 3");
        }
    }
    
    //GETTERS
    public String getProducto(){
        return this.producto;
    }
    
    public String getDireccionDestino(){
        return this.direccionDestino;
    }
    
    public int getPrioridad(){
        return this.prioridad;
    }
    
    @Override
    public boolean equals(Object o){
        boolean b = false;
        if(o instanceof Paquete p){
            b = this.producto.equals(p.producto)&&this.direccionDestino.equals(p.direccionDestino);
        }
        return b;
    }
    
    @Override
    public int hashCode(){
        return 3*producto.hashCode() + 7*direccionDestino.hashCode();
    }
    
    public int compareTo(Paquete p){
        return this.getPrioridad() - p.prioridad;
    }
    
    //TOSTRING
    @Override
    public String toString(){
        String s = "PAQUETE:\nProducto: "+this.producto+
                "\nDirección de destino: "+this.direccionDestino+
                "\nPrioridad: "+this.prioridad;
        return s;
    }
}
