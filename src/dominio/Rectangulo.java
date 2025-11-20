package dominio;

public class Rectangulo extends Figura {
    protected double base;
    protected double altura;

    public Rectangulo(Punto2D centro, double base, double altura) {
        super(centro);
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
        super(new Punto2D(0, 0));
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