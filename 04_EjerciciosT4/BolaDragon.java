
package daw.persona;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class BolaDragon {
    //VALORES
    private static final int MAXIMO_BOLAS = 7;
    private static int siguienteBola = 1;
    private int numero;
    
    //CONSTRUCTORES
    private BolaDragon(int numero){
        this.numero = numero;
    }
    
    //GETTERS
    public int getNumero(){
        return this.numero;
    }
    
    public BolaDragon crearBolaDragon() throws Exception{
        if(numero!=7){
            BolaDragon bd = new BolaDragon(siguienteBola++);
            return bd;
        }else{
            Exception e = new Exception("Ya se han creado 7 bolas de dragón");
            throw e;
        }
    }
    
    
}
