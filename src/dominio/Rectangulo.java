public abstract class Rectangulo {
    protected double base;
    protected double altura;
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    protected double areaRect = base * altura;
    protected double perimetroRect = (2 * base) + (2 * altura);
}