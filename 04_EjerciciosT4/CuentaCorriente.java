
package daw.persona;

import java.util.Random;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class CuentaCorriente {
    private int numero;
    private double saldo;    
    
    public CuentaCorriente(){
        Random r = new Random();
        this.numero = r.nextInt(0, 1000);
    }
    public CuentaCorriente(int numero2){
        this.numero=numero2;
    }
    public CuentaCorriente(int numero2,double saldo2){
        this.numero=numero2;
        this.saldo=saldo2;
    }
    
    //SETTERS
    public int getNumeroCuenta(){
        return this.numero;
    }
    public double getSaldo(){
        return this.saldo;
    }

    //GETTERS
    public void añadirDinero(double cantidad){
        this.saldo += cantidad;
    }
    public void retirarDinero(double cantidad){
        this.saldo -= cantidad;
    }
    public void setNumCuenta(int c){
        if(c<=1000&&c>=0){
            this.numero = c;
        }        
    }
    public void retirarDinero(int cantidad) throws Exception{
        if(cantidad<=this.saldo){
            this.saldo -= cantidad;
        }else{
            Exception e = new Exception("Dinero insuficiente");
            throw e;
        }
    }
}
