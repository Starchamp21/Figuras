public abstract class Circulo {
    protected double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }
    protected double areaC = 3.14 * (radio * radio); 
    protected double perimetroC = 2 * 3.14 * radio; 
}