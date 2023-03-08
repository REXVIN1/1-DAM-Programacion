
package tema5;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Rascacielos extends Edificio{
    //VALORES
    private int altura;
    
    //CONSTRUCTOR
    public Rascacielos(String d, int np, int a){
        super(d,np);
        if(a>=0){
            this.altura = a;
        }else{
            throw new IllegalArgumentException("Introduzca un valor positivo");
        }
    }
    
    //GETTER
    public int getAltura(){
        return this.altura+3*Rascacielos.super.getNumeroPlantas();
    }
    
    ///TO STRING
    @Override
    public String toString(){
        String s = "RASCACIELOS:\nDirección: "+Rascacielos.this.getDireccion()+
                "\nAltura: "+this.altura+
                "\nNumero de plantas: "+Rascacielos.this.getNumeroPlantas();
        return s;
    }
}
