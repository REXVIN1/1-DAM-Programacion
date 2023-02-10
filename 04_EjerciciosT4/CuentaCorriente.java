
package daw.persona;

import java.util.Random;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class CuentaCorriente {
    private int numero;
    private double saldo;
    
    
    public CuentaCorriente(){
        Random r = new Random();
        numero = r.nextInt(0, 1000);
    }
    public CuentaCorriente(int numero2){
        numero=numero2;
    }
    public CuentaCorriente(int numero2,double saldo2){
        numero=numero2;
        saldo=saldo2;
    }
    
    //SETTERS
    public int getNumeroCuenta(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }

    //GETTERS
    public void añadirDinero(double cantidad){
        saldo += cantidad;
    }
    public void retirarDinero(double cantidad){
        saldo -= cantidad;
    }
    public void setNumCuenta(int c){
        if(c<=1000&&c>=0){
            numero = c;
        }        
    }
}
