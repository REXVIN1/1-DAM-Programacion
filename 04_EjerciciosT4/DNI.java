
package daw.persona;

import java.util.HashMap;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class DNI {
    //VALORES
    private int numero;
    private char letra;       
    
    //CONSTRUCTORES
    public DNI(){}
    public DNI(int n){
        this.numero = n;
        DNI dni = new DNI();
        this.letra = dni.calcularLetra(n);
    }
    public DNI(int n, char c){
        this.numero = n;
        this.letra = c;
    }
    public DNI(String s){
        char letra2;
        if(s.length()==9){
            letra2 = s.charAt(8);
            String digitos = s.substring(0, 8);       
            this.letra = letra2;
            this.numero = Integer.parseInt(digitos);                           
        }
    }
    
    //GETTERS
    public int getNumero(){
        return this.numero;
    }
    public char getLetra(){
        return this.letra;
    }
    private char calcularLetra(int n){
        HashMap hm = new HashMap();
        int op = n%23;
        hm.put(0, 'T');
        hm.put(1, 'R');
        hm.put(2, 'W');
        hm.put(3, 'A');
        hm.put(4, 'G');
        hm.put(5, 'M');
        hm.put(6, 'Y');
        hm.put(7, 'F');
        hm.put(8, 'P');
        hm.put(9, 'D');
        hm.put(10, 'X');
        hm.put(11, 'B');
        hm.put(12, 'N');
        hm.put(13, 'J');
        hm.put(14, 'Z');
        hm.put(15, 'S');
        hm.put(16, 'Q');
        hm.put(17, 'V');
        hm.put(18, 'H');
        hm.put(19, 'L');
        hm.put(20, 'C');
        hm.put(21, 'K');
        hm.put(22, 'E');
        char tochar = (char)hm.get(op);
        this.letra = tochar;
        return this.letra;
    }
}
