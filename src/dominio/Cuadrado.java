package dominio;
import java.awt.Color;
import java.awt.Graphics;

public class Cuadrado extends Figura {
    protected double lado;
    
    public Cuadrado(Punto2D centro, double lado, Color fondo, Color trazo) {
        super(centro, fondo, trazo);
        this.lado = lado;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(fondo);
        g.fillRect(centro.getX(), centro.getY(), (int)lado, (int)lado); // relleno
        g.setColor(trazo);
        g.drawRect(centro.getX(), centro.getY(), (int)lado, (int)lado); // borde
    }


    public Cuadrado() {
        super(new Punto2D(0, 0), Color.PINK, Color.PINK);
        this.lado = 0;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado > 0) {
            this.lado = lado;
        }
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public String toString() {
        return "Cuadrado: [centro: " + centro + ", lado: " + lado +  "]\nÁrea del cuadrado: " + area() + "\nPerímetro del cuadrado: " + perimetro();
    }
}