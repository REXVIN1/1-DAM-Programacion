
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
        String contraseña = GeneradorContraseñasArchivo.super.generarContraseña();
        try {
            FileWriter fw = new FileWriter(this.archivo);
            if(this.archivo.exists()){
                fw.write(contraseña);
            }else{
                this.archivo.createNewFile();
            }
        } catch (IOException ex) {}
        return contraseña;
    }
}