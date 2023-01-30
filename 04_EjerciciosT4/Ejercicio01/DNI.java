
package daw.persona;

/*@author usuario-mañana*/

public class DNI {
    private int numero;
    private char letra;
    char letra2;
    String digitos;
    
    public DNI(int n, char c){
        numero = n;
        letra = c;
    };
    public DNI(String s){
        letra2 = s.charAt(9);
        digitos = s.substring(0, 8);        
        letra = letra2;
        numero = Integer.parseInt(digitos);               
    };
}
