
package daw.persona;
import java.time.LocalDate;
import java.util.Random;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Persona {
    private String nombre;
    private DNI dni;
    private Double sueldo;
    private LocalDate fechaNacimiento;
    private CuentaCorriente cuenta = new CuentaCorriente();
        
    private Random r = new Random();
        
    public Persona(String n, DNI d, double s, LocalDate fn){        
        this.nombre = n;
        this.dni = d;
        this.sueldo = s;
        this.fechaNacimiento = fn;
        this.cuenta = new CuentaCorriente(r.nextInt(0, 1000),0);          
    }
    public Persona(String n, int numDNI,char letraDNI, double s, LocalDate fn){
        this.nombre = n;
        this.sueldo = s;
        this.fechaNacimiento = fn;
        this.dni = new DNI(numDNI, letraDNI);
        this.cuenta = new CuentaCorriente(this.r.nextInt(0, 1000),0);        
    }
    public Persona(String n, DNI d){
        LocalDate f = LocalDate.now();
        this.nombre = n;
        this.dni = d;
        this.sueldo = 900.0;
        this.fechaNacimiento = f.minusYears(20);
        this.cuenta = new CuentaCorriente(this.r.nextInt(0, 1000),0);
    }
    public Persona(String n, int numDNI,char letraDNI){
        LocalDate f = LocalDate.now();
        this.nombre = n;
        this.sueldo = 900.0;
        this.dni = new DNI(numDNI, letraDNI);
        this.fechaNacimiento = f.minusYears(20);
        this.cuenta = new CuentaCorriente(r.nextInt(0, 1000),0);
    }
    
    
    public String getNombre(){
        return nombre;
    }
    public DNI getDNI(){
        return dni;
    }
    public Double getSueldo(){
        return sueldo;
    }
    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }
    public CuentaCorriente getCuentaCorriente(){
        return cuenta;
    }
    
    
    public int getnumDNI(){
        return dni.getNumero();
    }
    public char getLetraDNI(){
        return dni.getLetra();
    }
    public boolean esMayorEdad (){
        LocalDate f = LocalDate.now();
        return f.compareTo(fechaNacimiento)>=18;
    }
    public boolean tieneDinero (){
        return cuenta.getSaldo()>0;
    }
    public boolean esMileurista (){
        return sueldo<=1200;
    }    
    
    public void setNombre(String n){
        nombre = n;
    }
    public void setDNI(DNI d){
        dni = d;
    } 
    public void setSueldo(Double s){
        sueldo = s;
    }
    public void setFechaNacimiento (LocalDate fn){
        fechaNacimiento = fn;
    }
    public void aumentarSueldo (int porcentaje){
        double sp = sueldo*porcentaje/100;
        sueldo = sp;
    }
    public void cobrarSueldo (){
        cuenta.añadirDinero(sueldo);
    }
}
