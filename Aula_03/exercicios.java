import java.util.Scanner;

public class Aula03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- AULA 03 ---");
            System.out.println("1 - Faixa Etaria");
            System.out.println("2 - Calculadora");
            System.out.println("3 - Igualdade de Strings");
            System.out.println("4 - Ano Bissexto");
            System.out.println("5 - Desafio Ingresso");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> faixaEtaria(scanner);
                case 2 -> calculadora(scanner);
                case 3 -> igualdade(scanner);
                case 4 -> bissexto(scanner);
                case 5 -> desafioIngresso(scanner);
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void faixaEtaria(Scanner scanner) {
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
    }

    public static void calculadora(Scanner scanner) {
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
    }

    public static void igualdade(Scanner scanner) {
        System.out.print("Digite uma palavra: ");
        String entrada = scanner.next();

        boolean compOperador = (entrada == "java");
        boolean compEquals = entrada.equals("java");
        boolean compIgnoreCase = entrada.equalsIgnoreCase("java");

        System.out.println("Usando == : " + compOperador);
        System.out.println("Usando .equals() : " + compEquals);
        System.out.println("Usando .equalsIgnoreCase() : " + compIgnoreCase);

        // O '==' compara a referencia de memoria e nao o texto em si. Como a String
        // lida pelo teclado foi criada em tempo de execucao e "java" esta no pool de
        // strings, eles apontam para enderecos diferentes na memoria, dando false.
    }

    public static void bissexto(Scanner scanner) {
        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        boolean ehBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (ehBissexto) {
            System.out.println(ano + " e bissexto.");
        } else {
            System.out.println(ano + " nao e bissexto.");
        }
    }

    public static void desafioIngresso(Scanner scanner) {
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
    }
}
