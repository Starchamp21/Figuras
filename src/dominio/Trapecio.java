public abstract class Trapecio {
    protected double basem;
    protected double baseM;
    public Trapecio(double basem, double baseM) {
        this.basem = basem;
        this.baseM = baseM;
    }
    public abstract double areaTrap();
    public abstract double perimetroTrap();
}