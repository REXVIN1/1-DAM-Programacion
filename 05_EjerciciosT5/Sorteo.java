
package tema.pkg5;

/*@author usuario-tarde*/

public class Sorteo {
    public double dineroCupon;
    public int pagosRealizados;
    public int pagosPendientes;
    public int totalParticipantes;
    public double dineroRecogido;

    public Sorteo(double dineroCupon, int totalPersonas) {
        this.dineroCupon = dineroCupon;
        this.totalParticipantes = totalPersonas;
        this.pagosPendientes = totalPersonas;
    }

    public void registrarPago() {
        this.pagosRealizados++;
        this.pagosPendientes--;
        this.dineroRecogido += dineroCupon;
    }

    public void apuntarNuevoParticipante() {
        this.totalParticipantes++;
        this.pagosPendientes++;
    }         
}
