public abstract class Cuadrado {
    protected double lado;
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    protected double areaCuad = lado * lado;
    protected double perimetroCuad = 4 * lado;
}