package dominio;

public abstract class Figura {
    protected Punto2D centro;

    public Figura(Punto2D centro) {
        this.centro = centro;
    }

    public abstract double area();
    public abstract double perimetro();

    public Punto2D getCentro() {
        return centro;
    }
}