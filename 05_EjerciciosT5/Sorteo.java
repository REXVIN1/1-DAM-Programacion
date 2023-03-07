

package tema5;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Sorteo {
    //VALORES
    private double dineroCupon;
    private int pagosRealizados;
    private int pagosPendientes;
    private int totalParticipantes;
    private double dineroRecogido;
    
    //CONSTRUCTOR
    public Sorteo(double dineroCupon, int totalPersonas) {
        this.dineroCupon = dineroCupon;
        this.totalParticipantes = totalPersonas;
        this.pagosPendientes = totalPersonas;
    }

    //SETTERS
    public void registrarPago() {
        this.pagosRealizados++;
        this.pagosPendientes--;
        this.dineroRecogido += dineroCupon;
    }
    public void apuntarNuevoParticipante() {
        this.totalParticipantes++;
        this.pagosPendientes++;
    }
    public void setDineroCupon(double dinero_cupon){
        this.dineroCupon = dinero_cupon;
    }
    
    //GETTERS
    public double getDineroCupon(){
        return this.dineroCupon;
    }
    public double getPagosRealizados(){
        return this.pagosRealizados;
    }
    public double getPagosPendientes(){
        return this.pagosPendientes;
    }
    public double getTotatParticipantes(){
        return this.totalParticipantes;
    }
    public double getRecogido(){
        return this.dineroRecogido;
    }
    
    //CONSTRUCTOR
    @Override
    public String toString(){
        String s = "SORTEO:\nTotal de participantes: "+this.totalParticipantes+
                "\nPagos pendientes: "+this.pagosPendientes+
                "\nPagos realizados: "+this.pagosRealizados+
                "\nDinero cupón: "+this.dineroCupon+
                "\nDinero recogido: "+this.dineroRecogido;
        return s;
    }
}
