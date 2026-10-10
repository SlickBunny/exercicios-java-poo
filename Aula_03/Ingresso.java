import java.util.Scanner;

public class Ingresso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double INTEIRA = 40.0;

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("E estudante? (s/n): ");
        char estudante = scanner.next().toLowerCase().charAt(0);

        System.out.print("Dia da semana (ex: terca, quarta, sabado): ");
        String dia = scanner.next().toLowerCase();

        double preco = INTEIRA;
        boolean teveMeia = false;
        boolean teveDescontoTerca = false;

        if (idade < 18 || idade >= 60 || estudante == 's') {
            preco = INTEIRA / 2.0;
            teveMeia = true;
        }

        if (dia.contains("terca") || dia.contains("terça")) {
            preco = preco * 0.8;
            teveDescontoTerca = true;
        }

        System.out.printf("Valor final do ingresso: R$ %.2f\n", preco);

        String resumo = "Descontos aplicados: ";
        if (teveMeia && teveDescontoTerca) {
            resumo += "Meia-entrada (50%) + Promocao de terca-feira (20% adicional).";
        } else if (teveMeia) {
            resumo += "Apenas meia-entrada (50%).";
        } else if (teveDescontoTerca) {
            resumo += "Apenas promocao de terca-feira (20%).";
        } else {
            resumo += "Nenhum desconto (tarifa inteira).";
        }

        System.out.println(resumo);

        scanner.close();
    }
}
