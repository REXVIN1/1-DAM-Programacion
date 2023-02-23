
package daw.persona;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Fracción {
    //Variables
    private int numerador;
    private int denominador;
    
    //CONSTRUCTORES
    public Fracción(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    //Getters
    public int getNumerador(){
        return this.numerador;
    }
    public int getDenominador(){
        return this.denominador;
    }
    public double getValorReal(){
        double n = (double) numerador, n2 = (double) denominador;
        return n/n2;
    }
    public Fracción getInversa(){
        Fracción f = new Fracción(this.denominador, this.numerador);
        return f;
    }
    public static Fracción sumar(Fracción a, Fracción b){
        Fracción f = new Fracción(a.getNumerador()*b.getDenominador()+
                                  a.getDenominador()*b.getNumerador(), 
                                  a.getDenominador()*b.getDenominador());
        return f;
    }
    public static Fracción multiplicar(Fracción a, Fracción b){
        Fracción f = new Fracción(a.getNumerador()*b.getNumerador(), 
                                  a.getDenominador()*b.getDenominador());
        return f;
    }
    public static Fracción dividir(Fracción a, Fracción b){
        Fracción f = new Fracción(a.getNumerador()*b.getDenominador(), 
                                  a.getDenominador()*b.getNumerador());
        return f;
    }    
    
    @Override
    public String toString(){
        String s = this.numerador+"/"+this.denominador;
        return s;
    }
}
