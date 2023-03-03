
package tema.pkg5;

/*@author usuario-tarde*/

public class Sorteo {
    //VALORES
    public double dineroCupon;
    public int pagosRealizados;
    public int pagosPendientes;
    public int totalParticipantes;
    public double dineroRecogido;
    
    //CONSTRUCTOR
    public Sorteo(double dineroCupon, int totalPersonas) {
        this.dineroCupon = dineroCupon;
        this.totalParticipantes = totalPersonas;
        this.pagosPendientes = totalPersonas;
    }

    //GETTERS
    public void registrarPago() {
        this.pagosRealizados++;
        this.pagosPendientes--;
        this.dineroRecogido += dineroCupon;
    }
    public void apuntarNuevoParticipante() {
        this.totalParticipantes++;
        this.pagosPendientes++;
    }
    
    //CONSTRUCTOR
    @Override
    public String toString(){
        String s = "Total de participantes: "+this.totalParticipantes+
                "\nPagos pendientes: "+this.pagosPendientes+
                "\nPagos realizados: "+this.pagosRealizados+
                "\nDinero cupón: "+this.dineroCupon+
                "\nDinero recogido: "+this.dineroRecogido;
        return s;
    }
}
