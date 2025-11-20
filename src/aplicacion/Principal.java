package aplicacion;
import dominio.Punto2D;
// import dominio.Circulo;
// import dominio.Cuadrado;
import dominio.Rectangulo;
// import dominio.Triangulo;
// import dominio.Trapecio;

public class Principal {
    public static void main(String[] args) {

        // Creo puntos.
        Punto2D p1 = new Punto2D(3, 4);
        Punto2D p2 = new Punto2D(10, 7);

        // Distancia entre puntos.
        System.out.println("Distancia entre " + p1 + " y " + p2 + ": " + p1.distancia(p2));

        // Creo un rectángulo.
        Rectangulo r = new Rectangulo(p1, 5, 8);

        // Muestro el rectángulo.
        System.out.println("\nRectángulo creado:");
        System.out.println(r);

        // Cambio valores.
        r.setBase(12);
        r.setAltura(6);

        // Muestro resultados actualizados.
        System.out.println("\nRectángulo actualizado:");
        System.out.println("Área: " + r.area());
        System.out.println("Perímetro: " + r.perimetro());
        System.out.println("Centro: " + r.getCentro());
    }
}