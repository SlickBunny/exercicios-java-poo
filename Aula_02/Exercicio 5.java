import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        scanner.nextLine(); 

        double imc = peso / (altura * altura);

        System.out.printf("%s, seu IMC é %.2f.%n", nome, imc);

        scanner.close();
    }
}
