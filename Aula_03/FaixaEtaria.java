import java.util.Scanner;

public class FaixaEtaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        if (idade < 0) {
            System.out.println("Idade invalida (nao pode ser negativa).");
        } else if (idade <= 12) {
            System.out.println("Crianca");
        } else if (idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

        scanner.close();
    }
}
