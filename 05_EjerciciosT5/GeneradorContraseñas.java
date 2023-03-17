
package tema5;

import java.util.Random;

/*@author usuario-tarde*/

public class GeneradorContraseñas {
    
    //VALORES
    private Random random;
    
    //CONSTRUCTOR
    public GeneradorContraseñas(){
        this.random = new Random();
    }
    public GeneradorContraseñas(Random r){
        this.random = r;
    }
    
    //SETTERS
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
        return contraseña.toString();
    }
    public String generarContraseña(){
        StringBuilder contraseña = new StringBuilder();
        char caracter;
        for(int i=0;i<8;i++){
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
        return contraseña.toString();
    }
}
