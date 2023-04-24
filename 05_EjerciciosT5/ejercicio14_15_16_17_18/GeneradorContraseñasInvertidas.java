
package tema5;

import java.io.File;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*@author usuario-tarde*/

public class GeneradorContraseñasInvertidas extends GeneradorContraseñasUnicas{
    //VALORES
    private File archivo;
    private Random random;
    private Set<String> contraseñasGeneradas;
    
    //CONSTRUCTOR
    public GeneradorContraseñasInvertidas(){
        this.random = new Random();
        this.contraseñasGeneradas = new HashSet<>();
    }
    public GeneradorContraseñasInvertidas(Random r){
        this.random = r;
        this.contraseñasGeneradas = new HashSet<>();
    }
    
    //SETTERS
    @Override
    public String generarContraseña(int longitud){
        StringBuilder contraseña = new StringBuilder(GeneradorContraseñasInvertidas.super.generarContraseña());
        contraseña = contraseña.reverse();
        String contraseña2 = "";
        for(char c : contraseña.toString().toCharArray()){
            if(Character.isLowerCase(c)){
                contraseña2 += Character.toUpperCase(c);
            }
            if(Character.isUpperCase(c)){
                contraseña2 += Character.toLowerCase(c);
            }
        }
        return contraseña2;
    }
}
