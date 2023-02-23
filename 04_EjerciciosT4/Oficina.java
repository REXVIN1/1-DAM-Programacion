
package daw.persona;

import java.time.LocalDate;
import java.util.ArrayList;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Oficina {
    //VALORES        
    private final String nombre;
    private final ArrayList<Persona> trabajadores;       
    
    
    //CONSTRUCTORES
    public Oficina(String n){
        this.trabajadores = new ArrayList<>();
        this.nombre = n;
        this.trabajadores.clear();      
    };
    public Oficina(String n, int t) throws IllegalArgumentException{
        this.trabajadores = new ArrayList<>();
        this.nombre = n;
        if(t==0){
            this.trabajadores.clear();
        }if(t==1){
            this.trabajadores.add(new Persona("Antonio Pérez Pérez",1111111,'H',900,LocalDate.of(2000,2,28)));
        }if(t==2){
            this.trabajadores.add(new Persona("Antonio Pérez Pérez",1111111,'H',900,LocalDate.of(2000,2,28)));            
            this.trabajadores.add(new Persona("Luis López López",2222222,'J',1000,LocalDate.of(1995,9,10)));
        }if(t==3){
            this.trabajadores.add(new Persona("Antonio Pérez Pérez",1111111,'H',900,LocalDate.of(2000,2,28)));            
            this.trabajadores.add(new Persona("Luis López López",2222222,'J',1000,LocalDate.of(1995,9,10)));
            this.trabajadores.add(new Persona("Ana Díaz Díaz",3333333,'P',1200,LocalDate.of(1985,5,21)));
        }if(t>3){
            throw new IllegalArgumentException();
        }
    };
    public Oficina(){
        this.trabajadores = new ArrayList<>();
        this.nombre = "Industrias DAW";
    };
    
    
    //GETTERS
    public int getTotalEmpleados(){
        return this.trabajadores.size();        
    }
    public int getTotalEmpleadosMileuristas(){        
        int mileuristas=0;
        for(Persona p : this.trabajadores){
            if(p.getSueldo()<=1200){
                mileuristas+=1;
            }
        }        
        return mileuristas;        
    }
    public ArrayList getMileuristas(){
        ArrayList<String> l_mileurista = new ArrayList<>();
        for(Persona p : this.trabajadores){
            if(p.getSueldo()<=1200){
               l_mileurista.add(p.getNombre());
            }
        } 
        return l_mileurista;
    }
    public boolean trabaja(Persona p){
        return this.trabajadores.contains(p);
    }
    public double getSueldoMedio() throws Exception{
        double total=0;
        if(!this.trabajadores.isEmpty()){
            for(int i=0;i<this.trabajadores.size();i++){                
                total += this.trabajadores.get(i).getSueldo();                
            }
            total = total/this.trabajadores.size();
            return total;
        }else{
            Exception e = new Exception("No hay trabajadores");
            throw e;
        }
    }
    public static Oficina getOficinaVacia(){
        Oficina f = new Oficina("",0);
        return f;
    }
    public static Oficina getOficinaPequeña(){
        Oficina f = new Oficina("",1);
        return f;
    }
    public static Oficina getOficinaMediana(){
        Oficina f = new Oficina("",2);
        return f;
    }
    public static Oficina getOficinaGrande(){
        Oficina f = new Oficina("",3);
        return f;
    }    
    
    //SETTERS
    public void añadirEmpleado(Persona p){
        this.trabajadores.add(p);
    };
    public void añadirEmpleado(String n,String dni,double sueldo,LocalDate fechaNac){
        DNI dni2 = new DNI(dni);
        this.trabajadores.add(new Persona(this.nombre,dni2,sueldo,fechaNac));
    };
    public void pagarEmpleados(){
        for(Persona p : this.trabajadores){
            p.cobrarSueldo();
        }
    }
    public void mostrarInformeEmpleados(){
        for(Persona p : this.trabajadores){ 
            System.out.println("\nNombre: "+p.getNombre()+"\n"
                    + "Sueldo: "+p.getSueldo()+"\n"
                    + "Es mileurista: "+p.esMileurista());
        }
    }
}
