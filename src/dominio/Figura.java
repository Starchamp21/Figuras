package dominio;
import java.awt.*;

public abstract class Figura {
    protected Punto2D centro;
    protected Color fondo;
    protected Color trazo;

    public Figura(Punto2D centro, Color fondo, Color trazo) {
        this.centro = centro;
        this.fondo = fondo;
        this.trazo = trazo;
    }

    public abstract double area();
    public abstract double perimetro();

    public Punto2D getCentro() {
        return centro;
    }

    public abstract void dibujar(Graphics g);
    
    public Color getFondo() {
        return fondo;
    }

    public Color getTrazo() {
        return trazo;
    }

    public void setFondo(Color fondo) {
        this.fondo = fondo;
    }

    public void setTrazo(Color trazo) {
        this.trazo = trazo;
    }
}