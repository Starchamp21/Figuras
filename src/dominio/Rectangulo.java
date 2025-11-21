package dominio;
import java.awt.Color;
import java.awt.Graphics;

public class Rectangulo extends Figura {
    protected double base;
    protected double altura;

    public Rectangulo(Punto2D centro, double base, double altura, Color fondo, Color trazo) {
        super(centro, fondo, trazo);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(fondo);
        g.fillRect(centro.getX(), centro.getY(), (int)base, (int)altura); // relleno
        g.setColor(trazo);
        g.drawRect(centro.getX(), centro.getY(), (int)base, (int)altura); // borde
    }


    public Rectangulo() {
        super(new Punto2D(0, 0), Color.BLUE, Color.BLUE);
        this.base = 0;
        this.altura = 0;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return (2 * base) + (2 * altura);
    }

    @Override
    public String toString() {
        return "Rectángulo: [centro: " + centro + ", base: " + base + ", altura: " + altura + "]\nÁrea del rectángulo: " + area() + "\nPerímetro del rectángulo: " + perimetro();
    }
}