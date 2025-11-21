package aplicacion;

import java.awt.Color;
import javax.swing.JFrame;
import dominio.Circulo;
import dominio.Punto2D;
import dominio.Cuadrado;
import dominio.Rectangulo;
import dominio.Triangulo;
import dominio.Trapecio;
import interfaz.PanelFiguras;

public class Principal {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dibujar Figuras con Colores");
        PanelFiguras panel = new PanelFiguras();

        // Añadimos algunas figuras con colores
        panel.agregarFigura(new Circulo(new Punto2D(250, 35), 160, Color.GRAY, Color.GREEN));
        panel.agregarFigura(new Rectangulo(new Punto2D(150, 100), 140, 100, Color.GREEN, Color.BLUE));
        panel.agregarFigura(new Cuadrado(new Punto2D(500, 60), 90, Color.CYAN, Color.ORANGE));
        panel.agregarFigura(new Triangulo(new Punto2D(300, 300), new Punto2D(200, 200), new Punto2D(400, 200), new Punto2D(300, 400),  Color.PINK, Color.RED));
        panel.agregarFigura(new Trapecio(new Punto2D(100, 500), new Punto2D(300, 500), new Punto2D(150, 350), new Punto2D(250, 350), new Punto2D(150, 400), Color.MAGENTA, Color.BLACK));

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    /* public static void main(String[] args) {

        // Creo puntos.
        Punto2D p1 = new Punto2D(3, 4);
        Punto2D p2 = new Punto2D(10, 7);

        // Distancia entre puntos.
        System.out.println("Distancia entre " + p1 + " y " + p2 + ": " + p1.distancia(p2));

        // Creo un rectángulo.
        Rectangulo r = new Rectangulo(p1, 5, 8);

        // Muestro el rectángulo.
        System.out.println("\nRectángulo creado:");
        System.out.println(r);

        // Cambio valores.
        r.setBase(12);
        r.setAltura(6);

        // Muestro resultados actualizados.
        System.out.println("\nRectángulo actualizado:");
        System.out.println("Área: " + r.area());
        System.out.println("Perímetro: " + r.perimetro());
        System.out.println("Centro: " + r.getCentro()); */
}