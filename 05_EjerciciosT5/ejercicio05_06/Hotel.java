
package tema5.ejercicio05_06;

import tema5.ejercicio05_06.Edificio;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Hotel extends Edificio{
    //VALORES
    private final List<String> clientes;
    private int maximo;
    
    /*
    *CONSTRUCTOR
    *@param d direccion de el hotel
    *@param np numero de planats del hotel
    *@param m maximo de clientes
    *
    */
    public Hotel(String d, int np, int m){
        super(d,np);
        if(m>=0){
            this.maximo = m;
            this.clientes = new ArrayList<>();
        }else{
            throw new IllegalArgumentException("Introduzca un valor positivo");
        }
    }
    
    //SETTERS
    public void añadirCliente(String c){
        if(clientes.size()<this.maximo){
            clientes.add(c);
        }else{
            throw new IllegalStateException("Se alcanzo el limite de clientes");
        }
    }
    
    public void retirarCliente(String c){
        if(clientes.contains(c)){
            clientes.remove(c);
        }else{
            throw new NoSuchElementException("El cliente que desea limitar ");
        }
    }
    
    //GETTER    
    public int getMaximo(){
        return this.maximo;
    }
    public int getNumeroClientes(){
        return this.clientes.size();
    }
    
    //TO STRING
    @Override
    public String toString(){
        String s = "HOTEL:\nDirección: "+Hotel.this.getDireccion()+
                "\nNumero de plantas: "+Hotel.this.getNumeroPlantas()+
                "\nMaximo de clientes: "+this.maximo+
                "\nClientes actuales: "+Hotel.this.getNumeroClientes();
        return s;
    }
}
