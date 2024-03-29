
package tema5.ejercicio05_06;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class CasaRural extends Hotel{
    //CONSTRUCTOR
    public CasaRural(String d, int np, int m){
        super(d, 3, 6);
    }
    
    //TO STRING
    @Override
    public String toString(){
        String s = "CASA RURAL:\nDirección: "+CasaRural.this.getDireccion()+
                "\nNumero de pisos: "+CasaRural.this.getNumeroPlantas()+
                "\nNumero de metros: "+CasaRural.this.getMaximo();
        return s;
    }
}
