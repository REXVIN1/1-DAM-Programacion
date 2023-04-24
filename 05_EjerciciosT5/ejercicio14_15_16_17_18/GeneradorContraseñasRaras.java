
package tema5;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*@author usuario-tarde*/

public class GeneradorContraseñasRaras extends GeneradorContraseñasUnicas{
    //VALORES
    private Random random;
    private Set<String> contraseñasGeneradas;
    
    //CONSTRUCTOR
    public GeneradorContraseñasRaras(){
        this.random = new Random();
        this.contraseñasGeneradas = new HashSet<>();
    }
    public GeneradorContraseñasRaras(Random r){
        this.random = r;
        this.contraseñasGeneradas = new HashSet<>();
    }
    
    //SETTERS
    public String generarContraseña(int longitud){
        StringBuilder contraseña = new StringBuilder();
        char caracter;
        int caracter2;
        for(int i=0;i<longitud;i++){
            switch(this.random.nextInt(0, 2)){
                case 0 -> {
                    caracter = (char) this.random.nextInt(48, 57);
                    caracter2 = (int) caracter+122;
                    caracter = (char) caracter2;
                    contraseña.append(caracter);
                }
                case 1 -> {
                    caracter = (char) this.random.nextInt(65, 90);
                    caracter2 = (int) caracter+122;
                    caracter = (char) caracter2;
                    contraseña.append(caracter);
                }
                case 2 -> {
                    caracter = (char) this.random.nextInt(97, 122);
                    caracter2 = (int) caracter+122;
                    caracter = (char) caracter2;
                    contraseña.append(caracter);
                }
            }
        }
        this.contraseñasGeneradas.add(contraseña.toString());
        return contraseña.toString();
    }
}
