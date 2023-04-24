
package tema5.daw.zoo;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public abstract class Animal {
    
    //VARIABLES
    private final String nombre;
    private final int peso;
    private boolean encerrado;
    
    //CONSTRUCTOR
    public Animal(String n, int p) {
        this.nombre = n;
        this.peso = p;
    }
    
    //GETTERS
    public String getNombre() {
        return this.nombre;
    }

    public int getPeso() {
        return this.peso;
    }

    public boolean isEncerrado() {
        return this.encerrado;
    }
    
    
    //SETTERS
    public void setEncerrado(boolean b) {
        this.encerrado = b;
    }
    
    //TO STRING
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+"\nPeso: "+this.peso;
    }
    
    //EQUALS
    @Override
    public boolean equals(Object o){
        if(4*this.nombre.hashCode() + 7*this.peso == o.hashCode()){
            if(o instanceof Leon leon){
                return this.nombre.equalsIgnoreCase(leon.getNombre());
            }if(o instanceof Tigre tigre){
                return this.nombre.equalsIgnoreCase(tigre.getNombre());
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    //HASHCODE
    @Override
    public int hashCode(){
        return 4*this.nombre.hashCode() + 7*this.peso;
    }
    
    //Método abstracto
    public abstract void emitirSonido();
}
