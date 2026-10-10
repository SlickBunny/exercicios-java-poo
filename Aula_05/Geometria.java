public class Geometria {
    public static void main(String[] args) {
        Retangulo[] retangulos = {
            new Retangulo(10.0, 5.0),
            new Retangulo(4.0, 4.0),
            new Retangulo(8.0, 3.5)
        };

        int i = 1;
        for (Retangulo r : retangulos) {
            System.out.printf("Retangulo %d: Area = %.2f | Quadrado? %s\n", 
                    i, r.calcularArea(), (r.ehQuadrado() ? "Sim" : "Nao"));
            i++;
        }
    }
}
