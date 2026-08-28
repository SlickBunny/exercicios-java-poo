public class Conversor {
    public static void main(String[] args) {
        final double COTACAO = 5.42;
        double valorEmDolar = 15.50;
        double valorEmReal = valorEmDolar * COTACAO;
        
        System.out.printf("Valor convertido: R$ %.2f%n", valorEmReal);

        double celsius = 28.0;
      
        double fahrenheit = celsius * (9.0 / 5.0) + 32;
        
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
    }
}
