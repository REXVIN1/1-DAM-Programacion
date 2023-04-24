
package tema5.examen1;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Coche {
    //VALORES
    private int numeroPuertas; 
    private String color; 
    private String marca; 
    private String modelo;
    private boolean arrancado;
    private int velocidad;
    
    //CONSTRUCTOR
    public Coche(String m, String c, int np, String ma){
        this.numeroPuertas = np;
        this.color = c;
        this.marca = ma;
        this.modelo = m;
        this.arrancado = false;
        this.velocidad = 0;
    }
    
    //GETTERS
    public int getNumPuertas(){
        return this.numeroPuertas;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public int getVelocidad(){
        return this.velocidad;
    }
    
    //SETTERS
    public void arrancar(){
        this.arrancado = true;
    }
    
    public void acelerar(int velocidad) throws Exception{
        if(this.arrancado){
            this.velocidad = velocidad;
        }else{
            throw new Exception("Debes arrancar primero el coche ");
        }
    }
    
    public void frenar() throws Exception{
        if(this.arrancado){
            this.velocidad = 0;
        }else{
            throw new Exception("Debes arrancar primero el coche ");
        }
    }
    
    public void parar(){
        this.arrancado = false;
    }
    
    public void setColor(String c){
        this.color = c;
    }
    
    public void setMarca(String m){
        this.marca = m;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public void setNumeroPuertas(int p){
        this.numeroPuertas = p;
    }
    
    //TO STRING
    @Override
    public String toString(){
        String s = "COCHE:\nMarca: "+this.marca+
                "\nModelo: "+this.modelo+
                "\nColor: "+this.color+
                "\nNumero de Puertas: "+this.numeroPuertas+
                "\nArrancado: "+this.arrancado+
                "\nVelocidad: "+this.velocidad;
        return s;
    }
}
