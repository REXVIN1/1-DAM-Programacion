
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
        StringBuilder contraseña = new StringBuilder();
        int r2;
        boolean b = true;
        while(b){
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
            if(!this.contraseñasGeneradas.contains(contraseña.toString())){
                this.contraseñasGeneradas.add(contraseña.toString());
                b = false;
            }
        }
        /*
        String s;
        for(int i=0;i<contraseña.length();i++){
            String letra = Character.toString(contraseña.charAt(i));
            letra.toLowerCase();
        }
        */
        String contraseña2 = contraseña.reverse().toString().toLowerCase();
        return contraseña2;
    }
}
