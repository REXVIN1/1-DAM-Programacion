
package tema5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/*@author usuario-tarde*/

public class GeneradorContraseñasArchivo extends GeneradorContraseñas{
    //VALORES
    private File archivo;
    private Random random;
    
    //CONSTRUCTOR
    public GeneradorContraseñasArchivo(String ruta){
        this.archivo = new File(ruta);
        this.random = new Random();
    }
    public GeneradorContraseñasArchivo(String ruta, Random r){
        this.archivo = new File(ruta);
        this.random = r;
    }
    
    //SETTERS
    @Override
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
        try {
            FileWriter fw = new FileWriter(this.archivo);
            if(this.archivo.exists()){
                fw.write(contraseña.toString());
            }else{
                this.archivo.createNewFile();
            }
        } catch (IOException ex) {}
        return contraseña.toString();
    }
}