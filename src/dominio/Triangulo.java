package dominio;
import java.awt.Color;
import java.awt.Graphics;

public class Triangulo extends Figura {
    protected Punto2D p1, p2, p3;

    public Triangulo(Punto2D centro, Punto2D p1, Punto2D p2, Punto2D p3, Color fondo, Color trazo) {
        super(centro, fondo, trazo);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    public Triangulo() {
        super(new Punto2D(0, 0), Color.RED, Color.RED);
        p1 = new Punto2D();
        p2 = new Punto2D();
        p3 = new Punto2D();
    }

    @Override
    public void dibujar(Graphics g) {
        int [] lx = {p1.getX(), p2.getX(), p3.getX()};
        int [] ly = {p1.getY(), p2.getY(), p3.getY()};
        g.setColor(fondo);
        g.fillPolygon(lx, ly, 3); // relleno
        g.setColor(trazo);
        g.drawPolygon(lx, ly, 3); // borde
    }

    public Punto2D getP1() {
        return p1;
    }

    public void setP1(Punto2D p1) {
        this.p1 = p1;
    }

    public Punto2D getP2() {
        return p2;
    }

    public void setP2(Punto2D p2) {
        this.p2 = p2;
    }

    public Punto2D getP3() {
        return p3;
    }

    public void setP3(Punto2D p3) {
        this.p3 = p3;
    }

    protected double distancia1() {
        return p1.distancia(p2);
    }

    protected double distancia2() {
        return p2.distancia(p3);
    }

    protected double distancia3() {
        return p3.distancia(p1);
    }

    @Override
    public double area() {
        return 0.5 * Math.abs(
            p1.getX() * (p2.getY() - p3.getY()) +
            p2.getX() * (p3.getY() - p1.getY()) +
            p3.getX() * (p1.getY() - p2.getY())
        );
    }

    @Override
    public double perimetro() {
        return distancia1() + distancia2() + distancia3();
    }

    @Override
    public String toString() {
        return "Triángulo: [centro: " + centro + ", punto 1: " + p1 + ", punto 2: " + p2 + ", punto 3:" + p3 + ", distancia entre p1 y p2: " + distancia1() + ", distancia entre p2 y p3: " + distancia2() + ", distancia entre p3 y p1: " + distancia3() + "\nÁrea del triángulo: " + area() + "\nPerímetro del triángulo: " + perimetro();
    }
}