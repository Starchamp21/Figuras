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
        panel.agregarFigura(new Circulo(new Punto2D(50, 50), 40, Color.YELLOW, Color.RED));
        panel.agregarFigura(new Rectangulo(new Punto2D(150, 100), 80, 50, Color.GREEN, Color.BLUE));
        panel.agregarFigura(new Cuadrado(new Punto2D(250, 220), 90, Color.GREEN, Color.BLUE));
        panel.agregarFigura(new Triangulo(new Punto2D(500, 300), new Punto2D(350, 200), new Punto2D(650, 200), new Punto2D(500, 500),  Color.GREEN, Color.BLUE));
        panel.agregarFigura(new Trapecio(new Punto2D(100, 500), new Punto2D(40, 700), new Punto2D(170, 700), new Punto2D(60, 400), new Punto2D(150, 400), Color.GREEN, Color.BLUE));

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