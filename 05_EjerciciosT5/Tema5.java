
package tema.pkg5;

/*@author usuario-tarde*/

public class Tema5 {

    public static void main(String[] args) {        
        
        Sorteo s = new Sorteo(100, 100);
        System.out.println("SORTEO:");
        for(int i=0;i<10;i++){
            s.registrarPago();
        }
        for(int i=0;i<10;i++){
            s.apuntarNuevoParticipante();
        }
        System.out.println("Dinero cupon: "+s.dineroCupon);
        System.out.println("Dinero recogido: "+s.dineroRecogido);
        System.out.println("Pagos pendientes: "+s.pagosPendientes);
        System.out.println("Pagos realizados: "+s.pagosRealizados);
        System.out.println("Total de participantes: "+s.totalParticipantes);
        
        
        
        Compras c = new Compras(1500);
        System.out.println("\nCOMPRAS:");
        try {
            c.registrarCompra(200.0);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("presupuesto: "+c.presupuesto);
        System.out.println("Precios: "+c.precios);
        
        
        Rectangulo r = new Rectangulo(200, 100);
        System.out.println("\nRECTANGULO:");
        System.out.println("Base: "+r.base);
        System.out.println("Altura: "+r.altura);
        System.out.println("Area: "+r.area+" m^2");
    }   
}
