public abstract class Triangulo {
    protected double p1;
    protected double p2;
    protected double p3;
    public Triangulo(double p1, double p2, double p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public abstract double areaTrian();
    public abstract double perimetroTrian();
 }