/*
 */
package tema5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class GeneradorContraseñasUnicasArchivo extends GeneradorContraseñasUnicas{
    //VALORES
    private File archivo;
    private Random random;
    private Set<String> contraseñasGeneradas;
    
    //CONSTRUCTOR
    public GeneradorContraseñasUnicasArchivo(String ruta){
        this.archivo = new File(ruta);
        this.random = new Random();
        this.contraseñasGeneradas = new HashSet<>();
    }
    public GeneradorContraseñasUnicasArchivo(String ruta, Random r){
        this.archivo = new File(ruta);
        this.random = r;
        this.contraseñasGeneradas = new HashSet<>();
    }
    
    //SETTERS
    @Override
    public String generarContraseña(int longitud){
        String contraseña = GeneradorContraseñasUnicasArchivo.super.generarContraseña();
        try {
            FileWriter fw = new FileWriter(this.archivo);
            if(this.archivo.exists()){
                fw.write(contraseña);
                fw.close();
            }else{
                this.archivo.createNewFile();
            }
        } catch (IOException ex) {}
        return contraseña;
    }
}
