
package programa;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tema5.ejercicio26_27_28_29.Circulo;
import tema5.ejercicio26_27_28_29.Cuadrado;
import tema5.ejercicio26_27_28_29.FiguraGeometrica;
import tema5.ejercicio26_27_28_29.Triangulo;
import tema5.ejercicio26_27_28_29.Rectangulo;

/* @author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Programa {

    public static void main(String[] args) {
        List<FiguraGeometrica> lista = new ArrayList<>();
        
        boolean b = true;
        while(b){
            System.out.println("1 Añadir un rectángulo");
            System.out.println("2 Añadir un cuadrado");
            System.out.println("3 Añadir un círculo");
            System.out.println("4 Añadir un triángulo");
            System.out.println("5 Dibujar todo");
            
            int opcion = new Scanner(System.in).nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("Escriba las cordenadas de la esquina superior izquierda (x,y):");
                    int x1 = new Scanner(System.in).nextInt();
                    int y1 = new Scanner(System.in).nextInt();
                    Point p1 = new Point(x1,y1);
                    System.out.println("Escriba las cordenadas de la esquina superior derecha (x,y):");
                    int x2 = new Scanner(System.in).nextInt();
                    int y2 = new Scanner(System.in).nextInt();
                    Point p2 = new Point(x2,y2);
                    System.out.println("Escriba el color:");
                    int rgb1 = new Scanner(System.in).nextInt();
                    Color c1 = new Color(rgb1);
                    Rectangulo rectangulo = new Rectangulo(p1, p2, c1);
                    lista.add(rectangulo);
                  break;
                case 2:
                    System.out.println("Escriba las cordenadas de la esquina superior izquierda (x,y):");
                    int x3 = new Scanner(System.in).nextInt();
                    int y3 = new Scanner(System.in).nextInt();
                    Point p3 = new Point(x3,y3);
                    System.out.println("Escriba la longitud del lado:");
                    int l1 = new Scanner(System.in).nextInt();
                    System.out.println("Escriba el color:");
                    int rgb2 = new Scanner(System.in).nextInt();
                    Color c2 = new Color(rgb2);
                    Cuadrado cuadrado = new Cuadrado(p3, l1, c2);
                    lista.add(cuadrado);
                            
                    break;
                case 3:
                    System.out.println("Escriba el punto central (x,y):");
                    int x4 = new Scanner(System.in).nextInt();
                    int y4 = new Scanner(System.in).nextInt();
                    Point p4 = new Point(x4,y4);
                    System.out.println("Escriba la longitud del radio:");
                    int l2 = new Scanner(System.in).nextInt();
                    System.out.println("Escriba el color:");
                    int rgb3 = new Scanner(System.in).nextInt();
                    Color c3 = new Color(rgb3);
                    Circulo circulo = new Circulo(p4, l2, c3);
                    lista.add(circulo);
                    break;
                case 4:
                  
                    System.out.println("Escriba el punto central (x,y):");
                    int x5 = new Scanner(System.in).nextInt();
                    int y5 = new Scanner(System.in).nextInt();
                    Point p5 = new Point(x5,y5);
                    System.out.println("Escriba el punto central (x,y):");
                    int x6 = new Scanner(System.in).nextInt();
                    int y6 = new Scanner(System.in).nextInt();
                    Point p6 = new Point(x6,y6);
                    System.out.println("Escriba el punto central (x,y):");
                    int x7 = new Scanner(System.in).nextInt();
                    int y7 = new Scanner(System.in).nextInt();
                    Point p7 = new Point(x7,y7);
                    Triangulo triangulo = new Triangulo(p5, p6,  p7);
                    lista.add(triangulo);
                    break;
                case 5:
                    System.out.println("Donde desea dibujarlo:\n1 PDF\n2 ConsolaDAW:");
                    int dibujar = new Scanner(System.in).nextInt();
                    if(dibujar==1){
                        System.out.println("Imprimiendo en PDF...");
                        for(FiguraGeometrica fg : lista){
                            Graphics g = (Graphics) fg;
                            fg.dibujar(g);
                        }
                        try {
                            Thread.sleep(1000);
                            System.out.println("Ja! Que te lo crees tu.");
                        } catch (InterruptedException ex) {
                            System.out.println("Error: " + ex.getMessage());
                        }
                    }if(dibujar==2){
                        System.out.println("Ja! Que te lo crees tu.");
                    }else{
                        System.out.println("Por favor introduzca un valor adecuado");
                    }
                    
                    break;
                default:
                  // code block
              }
        }
    }
}
