package dominio;

public class Trapecio extends Figura {
    protected Punto2D a1, a2, a3, a4;

    public Trapecio(Punto2D centro, Punto2D a1, Punto2D a2, Punto2D a3, Punto2D a4) {
        super(centro);
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
    }

    public Trapecio() {
        super(new Punto2D(0, 0));
        a1 = new Punto2D();
        a2 = new Punto2D();
        a3 = new Punto2D();
        a4 = new Punto2D();
    }

    // Distancias de los lados.
    protected double baseMenor() {
        return a1.distancia(a2); 
    }
    protected double baseMayor() { 
        return a3.distancia(a4); 
    }
    protected double lado1() { 
        return a1.distancia(a3); 
    }
    protected double lado2() { 
        return a2.distancia(a4); 
    }

    // Altura = distancia del punto A3 a la recta A1-A2
    protected double altura() {
        double x1 = a1.getX(), y1 = a1.getY();
        double x2 = a2.getX(), y2 = a2.getY();
        double x3 = a3.getX(), y3 = a3.getY();

        double numerador = Math.abs((y2 - y1) * x3 - (x2 - x1) * y3 + x2 * y1 - y2 * x1);
        double denominador = Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));

        if (denominador == 0) return 0; // Evita la división por 0.
        return numerador / denominador;
    }

    @Override
    public double area() {
        return (baseMenor() + baseMayor()) * altura() / 2.0;
    }

    @Override
    public double perimetro() {
        return baseMenor() + baseMayor() + lado1() + lado2();
    }

    @Override
    public String toString() {
        return "Trapecio: [centro: " + centro + "\nBase menor: " + baseMenor() + "\nBase mayor: " + baseMayor() + "\nLado 1: " + lado1() + "\nLado 2: " + lado2() + "\nAltura: " + altura() + "Área del trapecio: " + area() + "\nPerímetro del trapecio: " + perimetro();
    }
}