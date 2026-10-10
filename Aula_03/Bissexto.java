import java.util.Scanner;

public class Bissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        boolean ehBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (ehBissexto) {
            System.out.println(ano + " e bissexto.");
        } else {
            System.out.println(ano + " nao e bissexto.");
        }

        scanner.close();
    }
}
