
package tema5;

import java.util.ArrayList;
import java.util.List;

/*@author usuario-tarde*/

public class EquipoFutbol implements Nombrable{
    
    //PROPIEDADES
    public final String nombre;
    public List<Empleado> empleados;
    public double presupuesto;
    
    //CONSTRUCTOR
    public EquipoFutbol(String n, double p){
        this.nombre = n;
        this.presupuesto = p;
        this.empleados = new ArrayList<>();
    }
    
    //GETTERS
    public List<Empleado> getEmpleados(){
        return this.empleados;
    }
    
    public double getPresupuesto(){
        return this.presupuesto;
    }
    
    @Override
    public String getNombre() {
        return this.nombre;
    }
    
    //SETTERS  (CORREGIR)
    public void addEmpleado(Empleado e) throws IllegalArgumentException{
        if(this.empleados.size()<26){
            if(this.empleados.isEmpty()){
                this.empleados.add(e);
            }else{
                int entr=0;
                for(Empleado e2 : this.empleados){
                    if(e2 instanceof Entrenador){
                        entr++;
                    }
                }
                if(entr==0){
                    if(e instanceof Entrenador){
                        this.empleados.add(e);
                    }else{
                        if(this.empleados.size()<26){
                            this.empleados.add(e);
                        }else{
                           throw new IllegalArgumentException("No se pueden añadir mas empleados"); 
                        }
                    }
                }
                if(entr==1){
                    if(e instanceof Entrenador){
                        throw new IllegalArgumentException("No se pueden añadir mas entrenadores");
                    }else{
                        if(this.empleados.size()<26){
                            this.empleados.add(e);
                        }
                    }
                }
            }
        }else{
            throw new IllegalArgumentException("No se pueden añadir mas empleados"); 
        }
    }
    
    public void pagarSueldoEmpleados() throws CabreoException{
        double presupuesto_partido = 0;
        int total_pagados = 0;
        for(Empleado e2 : this.empleados){
            if(e2 instanceof EmpleadoPrimable){
                double s = e2.getSueldo()*1.1;
                if(this.presupuesto>=s){
                    e2.cobrar(s);
                    this.presupuesto-=s;
                }else{
                    if(presupuesto_partido==0){
                        presupuesto_partido = this.presupuesto/this.empleados.size()-total_pagados;
                    }
                    e2.cobrar(presupuesto_partido);
                    this.presupuesto-=presupuesto_partido;
                }
            }else{
                if(this.presupuesto<e2.getSueldo()){
                    if(presupuesto_partido==0){
                        presupuesto_partido = this.presupuesto/this.empleados.size()-total_pagados;
                    }
                    e2.cobrar(presupuesto_partido);
                    this.presupuesto-=presupuesto_partido;
                }else{
                    e2.cobrar(e2.getSueldo());
                    this.presupuesto-=e2.getSueldo();
                }
            }
            total_pagados++;
        }
    }
    
    //TO STRING
    @Override
    public String toString(){
        String s = "EQUIPO FUTBOL:\nNombre: "+this.getNombre()+
                "\nEmpleados: "+this.getEmpleados().size()+
                "\nPresupuesto: "+this.getPresupuesto();
        return s;
    }
}
