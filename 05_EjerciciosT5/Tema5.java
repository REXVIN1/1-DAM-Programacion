


package tema5;

import java.time.Instant;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/
public class Tema5 {
 
    public static void main(String[] args) throws AdivinanzaIncorrectaException, TiempoSuperadoException, InterruptedException {
            
            /*
            PAQUETES
        
            Paquete p1 = new Paquete("rueda", "Emperatriz Eugenia 21", 1);
            Paquete p2 = new Paquete("tuberia", "Emperatriz Eugenia 50", 2);
            Paquete p3 = new Paquete("tuberia", "Emperatriz Eugenia 50", 3);
            Paquete p4 = new Paquete("tuberia", "Emperatriz Eugenia 50", 1);
            
            System.out.println(p1);
            System.out.println(p1.equals(p2));
            System.out.println(p1.hashCode());
            System.out.println(p1.compareTo(p2)+"\n");
            
            Transportista t = new Transportista(1);
            t.subirCamion(p1);
            t.subirCamion(p2);
            t.subirCamion(p3);
            t.subirCamion(p4);
            t.enviar();
            System.out.println(t+"\n");
        
            TransportistaOrdenado t2 = new TransportistaOrdenado(1);
            t2.subirCamion(p1);
            t2.subirCamion(p2);
            t2.subirCamion(p3);
            t2.subirCamion(p4);
            t2.enviar();
            System.out.println("\n"+t2);
                
            PaquetesPepe pp = new PaquetesPepe();
            pp.registrarPedido(p1);
            pp.registrarPedido(p2);
            pp.registrarPedido(p3);
            pp.registrarPedido(p4);
            pp.enviarPaquetes();
            System.out.println("\n"+pp+"\n");
        
            EmpresaPremium ep = new EmpresaPremium();
            ep.registrarPedido(p1);
            ep.registrarPedido(p2);
            ep.registrarPedido(p3);
            ep.registrarPedido(p4);
            ep.enviarPaquetes();
            System.out.println("\n"+ep);
        
            EmpresaLowCost elc = new EmpresaLowCost(4);
            elc.registrarPedido(p1);
            elc.registrarPedido(p2);
            elc.registrarPedido(p3);
            elc.registrarPedido(p4);
            elc.enviarPaquetes();
            System.out.println("\n"+elc);
            */
            
        
            /*
            GENERADOR CONTRASEÑAS
        
            */
            GeneradorContraseñas gc = new GeneradorContraseñas();
            GeneradorContraseñasUnicas gcu = new GeneradorContraseñasUnicas();
            GeneradorContraseñasArchivo gca = new GeneradorContraseñasArchivo("C:/Users/kevin/Desktop/PRUEBA.docx");
            GeneradorContraseñasInvertidas gci = new GeneradorContraseñasInvertidas();
            GeneradorContraseñasRaras gcr = new GeneradorContraseñasRaras();
            
            System.out.println(gc.generarContraseña(7));
            System.out.println(gcu.generarContraseña());
            System.out.println(gca.generarContraseña());
            System.out.println(gci.generarContraseña());
            System.out.println(gcr.generarContraseña(20));
            
            String contraseña = "hola";
            String s;
            
            /*
            ADIVINANZAS
            
            Adivinanza a = new Adivinanza("a","b");
            System.out.println(a.getEnunciado());
            Thread.sleep(33000);
            System.out.println("Escriba la respuesta: ");
            String s = new Scanner(System.in).nextLine();
            a.comprobar(s);
            */
            
            /*
            CLASES EMPLEADO
            
            CuerpoTecnico ct = new CuerpoTecnico("manolo", 1300, "entrenador");
            System.out.println(ct+"\n");
            Futbolista f = new Futbolista("Ronaldo", 2000, 9);
            System.out.println(f+"\n");
            Entrenador en = new Entrenador("antonio", 1200);
            System.out.println(en+"\n");
            
            EquipoFutbol eq = new EquipoFutbol("Real Madrid", 200000);
            Futbolista e1 = new Futbolista("Kevin", 1200, 1);
            Futbolista e2 = new Futbolista("Kevin", 1200, 1);
            Futbolista e3 = new Futbolista("Kevin", 1200, 1);
            Futbolista e4 = new Futbolista("Kevin", 1200, 1);
            Futbolista e5 = new Futbolista("Kevin", 1200, 1);
            Futbolista e6 = new Futbolista("Kevin", 1200, 1);
            Futbolista e7 = new Futbolista("Kevin", 1200, 1);
            Futbolista e8 = new Futbolista("Kevin", 1200, 1);
            Futbolista e9 = new Futbolista("Kevin", 1200, 1);
            Futbolista e10 = new Futbolista("Kevin", 1200, 1);
            Futbolista e11= new Futbolista("Kevin", 1200, 1);
            Futbolista e12 = new Futbolista("Kevin", 1200, 1);
            Futbolista e13 = new Futbolista("Kevin", 1200, 1);
            Futbolista e14 = new Futbolista("Kevin", 1200, 1);
            Futbolista e15 = new Futbolista("Kevin", 1200, 1);
            Futbolista e16 = new Futbolista("Kevin", 1200, 1);
            Futbolista e17 = new Futbolista("Kevin", 1200, 1);
            Futbolista e18 = new Futbolista("Kevin", 1200, 1);
            Futbolista e19 = new Futbolista("Kevin", 1200, 1);
            Futbolista e20 = new Futbolista("Kevin", 1200, 1);
            Futbolista e21 = new Futbolista("Kevin", 1200, 1);
            Futbolista e22 = new Futbolista("Kevin", 1200, 1);
            Futbolista e23 = new Futbolista("Kevin", 1200, 1);
            Futbolista e24 = new Futbolista("Kevin", 1200, 1);
            Futbolista e25 = new Futbolista("Kevin", 1200, 1);
            Futbolista e26 = new Futbolista("Kevin", 1200, 1);
            Futbolista en1 = new Futbolista("Kevin", 1200, 1);
            Futbolista en2 = new Futbolista("Kevin", 1200, 1);
            eq.addEmpleado(e1);
            eq.addEmpleado(e2);
            eq.addEmpleado(e3);
            eq.addEmpleado(e4);
            eq.addEmpleado(e5);
            eq.addEmpleado(e6);
            eq.addEmpleado(e7);
            eq.addEmpleado(e8);
            eq.addEmpleado(e9);
            eq.addEmpleado(e10);
            eq.addEmpleado(e11);
            eq.addEmpleado(e12);
            eq.addEmpleado(e13);
            eq.addEmpleado(e14);
            eq.addEmpleado(e15);
            eq.addEmpleado(e16);
            eq.addEmpleado(e17);
            eq.addEmpleado(e18);
            eq.addEmpleado(e19);
            eq.addEmpleado(e20);
            eq.addEmpleado(e21);
            eq.addEmpleado(e22);
            eq.addEmpleado(e23);
            eq.addEmpleado(e24);
            eq.addEmpleado(e25);
            eq.addEmpleado(en1);
            
            System.out.println("\n"+eq+"\n");
            
            try {
                eq.pagarSueldoEmpleados();
            } catch (CabreoException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("Presupuesto: "+eq.getPresupuesto());
            */
            
            
            /*
            CLASES TRABAJADOR
            
            Trabajador t = new Trabajador("kevin", 1200, 48134118, 'V');
            System.out.println(t+"\n");
            System.out.println("Nombre: "+t.getNombre());
            System.out.println("DNI: "+t.getDNI());
            System.out.println("Sueldo: "+t.getSueldo());
            System.out.println("------------------------------------");
            TrabajadorTecleante tt = new TrabajadorTecleante("manolo", 1200, 48134118, 'V', 120);
            System.out.println(tt+"\n");
            tt.setTeclado();
            System.out.println("Teclado: "+tt.getTeclado());
            System.out.println("Pulsaciones: "+tt.getPulsacionesMinuto());
            System.out.println("------------------------------------");
            Programador p = new Programador("pepe", 1200, 48134118, 'V', 120);
            System.out.println(p+"\n");
            p.aprenderLenguaje("Java", "holaMundo");
            System.out.println(p.programarHolaMundo("Java"));
            System.out.println("------------------------------------");
            Administrativo a = new Administrativo("juan", 1200, 48134118, 'V', 120);
            System.out.println(a);
            a.escribirInforme("eso es un informe");
            */ 
            
            /*
            CLASES EDIFICIO
            
            Edificio e = new Edificio("Emperatriz Eugenia 20", 8);
            System.out.println(e+"\n");
            Hotel h = new Hotel("Emperatriz Eugenia 21", 10, 200);
            h.añadirCliente("manolo");
            System.out.println(h);
            h.retirarCliente("manolo");
            System.out.println("Clientes actuales: "+h.getNumeroClientes()+"\n");
            Rascacielos r = new Rascacielos("Emperatriz Eugenia 22",5,5);
            System.out.println(r+"\n");
            CasaRural cr = new CasaRural("Emperatriz Eugenia 23",5,5);
            System.out.println(cr);
            Instant i = Instant.now();
            try {
            Thread.sleep(1000);
            } catch (InterruptedException ex) {
            System.out.println("Error: "+ex.getMessage());
            }
            Instant i2 = Instant.now();
            System.out.println(i2.compareTo(i));
            */ 
            
            /*
            EJERCICIO 3
            
            Rectangulo r = new Rectangulo(200, 100);
            System.out.println(r);
            */ 
            
            /*
            EJERCICIO 2
            
            Compras c = new Compras(1500);
            try {
            c.registrarCompra(200.0);
            } catch (Exception ex) {
            System.out.println(ex.getMessage());
            }
            System.out.println(c);
            */ 
            
            /*
            EJERCICIO 1
            
            Sorteo s = new Sorteo(100, 100);
            for(int i=0;i<10;i++){
            s.registrarPago();
            }
            for(int i=0;i<5;i++){
            s.apuntarNuevoParticipante();
            }
            System.out.println(s+"\n");
            */
    }
}
