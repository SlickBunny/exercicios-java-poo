import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        System.out.print("Digite o segundo numero: ");
        double n2 = scanner.nextDouble();

        switch (op) {
            case '+' -> System.out.println("Resultado: " + (n1 + n2));
            case '-' -> System.out.println("Resultado: " + (n1 - n2));
            case '*' -> System.out.println("Resultado: " + (n1 * n2));
            case '/' -> {
                if (n2 == 0) {
                    System.out.println("Erro: divisao por zero nao permitida.");
                } else {
                    System.out.println("Resultado: " + (n1 / n2));
                }
            }
            default -> System.out.println("Operador invalido!");
        }

        scanner.close();
    }
}
