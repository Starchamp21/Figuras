package dominio;

public class Circulo extends Figura{
    protected double radio;

    public Circulo(Punto2D centro, double radio) {
        super(centro);
        this.radio = radio;
    }

    public Circulo() {
        super(new Punto2D(0, 0));
        this.radio = 0;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio >= 0) {
            this.radio = radio;
        }
    }
    
    @Override
    public double area() {
        return Math.PI * radio * radio;  
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Círculo: [centro: " + centro + ", radio: " + radio +  "]\nÁrea del circulo: " + area() + "\nPerímetro del circulo: " + perimetro();
    }
}