import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (double): ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número (double): ");
        double num2 = scanner.nextDouble();

        System.out.printf("Soma: %.2f%n", (num1 + num2));
        System.out.printf("Subtração: %.2f%n", (num1 - num2));
        System.out.printf("Multiplicação: %.2f%n", (num1 * num2));
        System.out.printf("Divisão: %.2f%n", (num1 / num2));
        System.out.printf("Resto da divisão: %.2f%n", (num1 % num2));

        scanner.close();
    }
}
