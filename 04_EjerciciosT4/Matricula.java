
package daw.persona;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Matricula {
    //VALORES
    private static int siguienteNúmeroMatricula = 1;
    private int numeroMatricula;
    private String nombreAlumno;
    private String nombreAsignatura;
    
    //CONSTRUCTORES
    public Matricula(String nombreAlumno, String nombreAsignatura){
        this.nombreAlumno = nombreAlumno;
        this.nombreAsignatura = nombreAsignatura;
        this.numeroMatricula = siguienteNúmeroMatricula++;
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombreAlumno;
    }
    public String getNombreAsignatura(){
        return this.nombreAsignatura;
    }
    public int getNumeroMatricula(){
        return this.numeroMatricula;
    }
}
