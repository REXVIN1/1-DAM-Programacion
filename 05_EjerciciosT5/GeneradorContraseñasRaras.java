
package tema5;

import java.io.File;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*@author usuario-tarde*/

public class GeneradorContraseñasRaras {
    //VALORES
    private File archivo;
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
        int r2;
        boolean b = true;
        while(b){
            for(int i=0;i<longitud;i++){
                r2 = this.random.nextInt(0, 2);
                if(r2==0){
                    int c2 = 0;
                    while(c2>255){
                        char c = (char)this.random.nextInt(48, 57);
                        c2 = (int) c+122;
                        if(c2<=255){
                            char c3 = (char) c2;
                            contraseña.append(c3);
                        }
                    }
                }
                if(r2==1){
                    int c2 = 0;
                    while(c2>255){
                        char c = (char)this.random.nextInt(65, 90);
                        c2 = (int) c+122;
                        if(c2<=255){
                            char c3 = (char) c2;
                            contraseña.append(c3);
                        }
                    }
                }
                if(r2==2){
                    int c2 = 0;
                    while(c2>255){
                        char c = (char)this.random.nextInt(97, 122);
                        c2 = (int) c+122;
                        if(c2<=255){
                            char c3 = (char) c2;
                            contraseña.append(c3);
                        }
                    }
                }
            }
            if(!this.contraseñasGeneradas.contains(contraseña.toString())){
                this.contraseñasGeneradas.add(contraseña.toString());
                b = false;
            }
        }
        return contraseña.toString();
    }
}
