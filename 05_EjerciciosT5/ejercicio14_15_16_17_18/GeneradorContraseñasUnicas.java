
package tema5;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*@author usuario-tarde*/

public class GeneradorContraseñasUnicas extends GeneradorContraseñas{
    //VALORES
    private Set<String> contraseñasGeneradas;
    private Random random;
    
    //CONSTRUCTOR
    public GeneradorContraseñasUnicas(){
        this.random = new Random();
        this.contraseñasGeneradas = new HashSet<>();
    }
    public GeneradorContraseñasUnicas(Random r){
        super(r);
        this.contraseñasGeneradas = new HashSet<>();
    }
    
    //SETTERS
    @Override
    public String generarContraseña(int longitud){
        StringBuilder contraseña = new StringBuilder();
        char caracter;
        for(int i=0;i<longitud;i++){
            switch(this.random.nextInt(0, 2)){
                case 0 -> {
                    caracter = (char) this.random.nextInt(48, 57);
                    contraseña.append(caracter);
                }
                case 1 -> {
                    caracter = (char) this.random.nextInt(65, 90);
                    contraseña.append(caracter);
                }
                case 2 -> {
                    caracter = (char) this.random.nextInt(97, 122);
                    contraseña.append(caracter);
                }
            }
        }
        this.contraseñasGeneradas.add(contraseña.toString());
        return contraseña.toString();
    }
    
    @Override
    public String generarContraseña(){
        StringBuilder contraseña = new StringBuilder();
        char caracter;
        for(int i=0;i<12;i++){
            switch(this.random.nextInt(0, 2)){
                case 0 -> {
                    caracter = (char) this.random.nextInt(48, 57);
                    contraseña.append(caracter);
                }
                case 1 -> {
                    caracter = (char) this.random.nextInt(65, 90);
                    contraseña.append(caracter);
                }
                case 2 -> {
                    caracter = (char) this.random.nextInt(97, 122);
                    contraseña.append(caracter);
                }
            }
        }
        this.contraseñasGeneradas.add(contraseña.toString());
        return contraseña.toString();
    }
}
