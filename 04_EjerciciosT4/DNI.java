
package daw.persona;

import java.util.HashMap;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class DNI {
    private int numero;
    private char letra;
    char letra2;
    String digitos;
    HashMap hm = new HashMap();
    
    private DNI(){}
    public DNI(int n){
        numero = n;
        DNI dni2 = new DNI();
        letra = dni2.calcularLetra(n);
    }
    public DNI(int n, char c){
        numero = n;
        letra = c;
    };
    public DNI(String s){
        letra2 = s.charAt(8);
        digitos = s.substring(0, 8);        
        letra = letra2;
        numero = Integer.parseInt(digitos);               
    };
    
    
    //GETTERS
    public int getNumero(){
        return numero;
    }
    public char getLetra(){
        return letra;
    }
    private char calcularLetra(int n){
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
        letra = tochar;
        return letra;
    }
}
