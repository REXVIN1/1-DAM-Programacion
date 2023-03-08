
package tema5;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class TrabajadorTecleante extends Trabajador implements Teclado{
    //VALORES
    private final int pulsacionesMinuto;
    protected Teclado teclado;
    
    //CONSTRUCTOR
    public TrabajadorTecleante(String n, int s, int ndni, char ldni, int ppm){
        super(n,s,ndni,ldni);
        this.pulsacionesMinuto = ppm;
    }
    
    //SETTER
    public void setTeclado(Teclado t){
        this.teclado = t;
    }
    
    //GETTERS
    public Teclado getTeclado(){
        return this.teclado;
    }
    public int getPulsacionesMinuto(){
        return this.pulsacionesMinuto;
    }

    @Override
    public void escribirTexto(String mensaje) {
        
    }
    
    //TO STRING
    @Override
    public String toString(){
        String s = "TRABAJADOR TECLEANTE:\nNombre: "+TrabajadorTecleante.super.getNombre()+
                "\nSueldo: "+TrabajadorTecleante.super.getSueldo()+
                "\nDNI: "+TrabajadorTecleante.super.getDNI()+
                "\nPPM: "+this.pulsacionesMinuto;
        return s;
    }
}
