
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
        int r2;
        for(int i=0;i<longitud;i++){
            r2 = this.random.nextInt(0, 2);
            if(r2==0){
                char c = (char)this.random.nextInt(48, 57);
                contraseña.append(c);
            }
            if(r2==1){
                char c = (char)this.random.nextInt(65, 90);
                contraseña.append(c);
            }
            if(r2==2){
                char c = (char)this.random.nextInt(97, 122);
                contraseña.append(c);
            }
        }
        return contraseña.toString();
    }
    public String generarContraseña(){
        StringBuilder contraseña = new StringBuilder();
        int r2;
        for(int i=0;i<8;i++){
            r2 = this.random.nextInt(0, 2);
            if(r2==0){
                char c = (char)this.random.nextInt(48, 57);
                contraseña.append(c);
            }
            if(r2==1){
                char c = (char)this.random.nextInt(65, 90);
                contraseña.append(c);
            }
            if(r2==2){
                char c = (char)this.random.nextInt(97, 122);
                contraseña.append(c);
            }
        }
        return contraseña.toString();
    }
}
