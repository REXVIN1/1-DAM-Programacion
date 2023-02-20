
package daw.persona;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Altavoz {
    //VALORES
    public static final int VOL_MAX = 255;
    public static final int VOL_MIN = 0;
    private int volumen;
    
    //CONSTRUCTOR
    public Altavoz(){
        this.volumen = 0;
    }
    
    //SETTERS
    public void ponerVolumenMaximo(){
        this.volumen = VOL_MAX;
    }
    public void setVolumen(int v){
        this.volumen = v;
    }
    
    //GETTERS
    public int getVolumen(){
        return volumen;
    }
    @Override
    public String toString(){        
        String s = "["+this.volumen+"]";
        if(this.volumen==0){
            s += "----------";
        }if(this.volumen>0&&this.volumen<=25.5){
            s += "*---------";
        }if(this.volumen>25.5&&this.volumen<=51){
            s += "**--------";
        }if(this.volumen>51&&this.volumen<=76.5){
            s += "***-------";
        }if(this.volumen>76.5&&this.volumen<=102){
            s += "****------";
        }if(this.volumen>102&&this.volumen<=127.5){
            s += "*****-----";
        }if(this.volumen>127.5&&this.volumen<=153){
            s += "******----";
        }if(this.volumen>153&&this.volumen<=178.5){
            s += "*******---";
        }if(this.volumen>178.5&&this.volumen<=204){
            s += "********--";
        }if(this.volumen>204&&this.volumen<=229.5){
            s += "*********-";
        }if(this.volumen>229.5&&this.volumen<=255){
            s += "**********";
        }            
        return s;
    }
}
