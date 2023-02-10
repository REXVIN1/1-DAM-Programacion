
package daw.persona;

import java.time.LocalDate;
import java.util.ArrayList;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Oficina {        
    //VALORES        
    private final String nombre;
    private final ArrayList<Persona> trabajadores;       
    
    
    //CLASES
    public Oficina(String n){
        this.trabajadores = new ArrayList<>();
        nombre = n;
        trabajadores.clear();      
    };
    public Oficina(String n, int t){
        this.trabajadores = new ArrayList<>();
        nombre = n;
        if(t==0||t>3){
            trabajadores.clear();
        }if(t==1){
            trabajadores.add(new Persona("Antonio Pérez Pérez",1111111,'H',900,LocalDate.of(2000,2,28)));
        }if(t==2){
            trabajadores.add(new Persona("Antonio Pérez Pérez",1111111,'H',900,LocalDate.of(2000,2,28)));            
            trabajadores.add(new Persona("Luis López López",2222222,'J',1000,LocalDate.of(1995,9,10)));
        }if(t==3){
            trabajadores.add(new Persona("Antonio Pérez Pérez",1111111,'H',900,LocalDate.of(2000,2,28)));            
            trabajadores.add(new Persona("Luis López López",2222222,'J',1000,LocalDate.of(1995,9,10)));
            trabajadores.add(new Persona("Ana Díaz Díaz",3333333,'P',1200,LocalDate.of(1985,5,21)));
        }
    };
    public Oficina(){
        this.trabajadores = new ArrayList<>();
        nombre = "Industrias DAW";
    };
    
    
    //GETTERS
    public int getTotalEmpleados(){
        return trabajadores.size();        
    }
    public int getTotalEmpleadosMileuristas(){        
        int mileuristas=0;
        for(Persona p : trabajadores){
            if(p.getSueldo()<=1200){
                mileuristas+=1;
            }
        }        
        return mileuristas;        
    }
    public ArrayList getMileuristas(){
        ArrayList<String> l_mileurista = new ArrayList<>();
        for(Persona p : trabajadores){
            if(p.getSueldo()<=1200){
               l_mileurista.add(p.getNombre());
            }
        } 
        return l_mileurista;
    }
    public boolean trabaja(Persona p){
        return trabajadores.contains(p);
    }    
    
    
    //SETTERS
    public void añadirEmpleado(Persona p){
        trabajadores.add(p);
    };
    public void añadirEmpleado(String n,String dni,double sueldo,LocalDate fechaNac){
        DNI dni2 = new DNI(dni);
        trabajadores.add(new Persona(nombre,dni2,sueldo,fechaNac));
    };
    public void pagarEmpleados(){
        for(Persona p : trabajadores){
            p.cobrarSueldo();
        }
    }
    public void mostrarInformeEmpleados(){
        for(Persona p : trabajadores){ 
            System.out.println("\nNombre: "+p.getNombre()+"\n"
                    + "Sueldo: "+p.getSueldo()+"\n"
                    + "Es mileurista: "+p.esMileurista());
        }
    }
}
