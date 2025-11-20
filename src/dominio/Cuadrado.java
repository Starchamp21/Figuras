package dominio;

public class Cuadrado extends Figura {
    protected double lado;
    
    public Cuadrado(Punto2D centro, double lado) {
        super(centro);
        this.lado = lado;
    }

    public Cuadrado() {
        super(new Punto2D(0, 0));
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