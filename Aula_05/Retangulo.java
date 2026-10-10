public class Retangulo {
    double base;
    double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return base * altura;
    }

    double calcularPerimetro() {
        return 2 * (base + altura);
    }

    boolean ehQuadrado() {
        return base == altura;
    }
}
