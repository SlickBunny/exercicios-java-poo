Aqui está o código limpo, sem firulas, sem banners decorativos, sem sintaxes exageradas e com comentários simples e naturais de aluno:

Java
import java.util.Scanner;

public class ExerciciosPraticos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Tabuada");
            System.out.println("2 - Estatisticas");
            System.out.println("3 - Menu com Historico");
            System.out.println("4 - Refatorar");
            System.out.println("5 - Desafio Boletim");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    exercicio1Tabuada(scanner);
                    break;
                case 2:
                    exercicio2Estatisticas();
                    break;
                case 3:
                    exercicio3MenuHistorico(scanner);
                    break;
                case 4:
                    exercicio4Refatorar();
                    break;
                case 5:
                    exercicio5Boletim(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void exercicio1Tabuada(Scanner scanner) {
        System.out.print("Digite um numero: ");
        int n = scanner.nextInt();

        System.out.println("Tabuada do " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, (n * i));
        }

        System.out.println("\nTodas as tabuadas:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, (i * j));
            }
        }
    }

    public static void exercicio2Estatisticas() {
        double[] notas = {8.5, 6.0, 9.5, 7.0, 4.5};

        System.out.printf("Maior: %.1f\n", calcularMaior(notas));
        System.out.printf("Menor: %.1f\n", calcularMenor(notas));
        System.out.printf("Soma: %.1f\n", calcularSoma(notas));
        System.out.printf("Media: %.1f\n", calcularMedia(notas));
    }

    public static double calcularMaior(double[] arr) {
        double maior = arr[0];
        for (double v : arr) {
            if (v > maior) {
                maior = v;
            }
        }
        return maior;
    }

    public static double calcularMenor(double[] arr) {
        double menor = arr[0];
        for (double v : arr) {
            if (v < menor) {
                menor = v;
            }
        }
        return menor;
    }

    public static double calcularSoma(double[] arr) {
        double soma = 0;
        for (double v : arr) {
            soma += v;
        }
        return soma;
    }

    public static double calcularMedia(double[] arr) {
        return calcularSoma(arr) / arr.length;
    }

    public static void exercicio3MenuHistorico(Scanner scanner) {
        double[] historico = new double[10];
        int count = 0;
        int opt;

        do {
            System.out.println("\n1 - Somar");
            System.out.println("2 - Ver historico");
            System.out.println("0 - Voltar");
            System.out.print("Opcao: ");
            opt = scanner.nextInt();

            if (opt == 1) {
                System.out.print("Numero 1: ");
                double a = scanner.nextDouble();
                System.out.print("Numero 2: ");
                double b = scanner.nextDouble();
                double res = a + b;
                System.out.println("Resultado: " + res);

                if (count < historico.length) {
                    historico[count] = res;
                    count++;
                } else {
                    System.out.println("Historico cheio!");
                }
            } else if (opt == 2) {
                if (count == 0) {
                    System.out.println("Historico vazio.");
                } else {
                    for (int i = 0; i < count; i++) {
                        System.out.printf("[%d] %.2f\n", (i + 1), historico[i]);
                    }
                }
            }
        } while (opt != 0);
    }

    public static void exercicio4Refatorar() {
        int[] valores = {4, 7, 2, 9, 3};
        int soma = somar(valores);
        int maior = pegarMaior(valores);
        int pares = contarPares(valores);
        imprimir(soma, maior, pares);
    }

    public static int somar(int[] valores) {
        int soma = 0;
        for (int v : valores) soma += v;
        return soma;
    }

    public static int pegarMaior(int[] valores) {
        int maior = valores[0];
        for (int v : valores) if (v > maior) maior = v;
        return maior;
    }

    public static int contarPares(int[] valores) {
        int pares = 0;
        for (int v : valores) if (v % 2 == 0) pares++;
        return pares;
    }

    public static void imprimir(int soma, int maior, int pares) {
        System.out.println(soma + " " + maior + " " + pares);
    }

    public static void exercicio5Boletim(Scanner scanner) {
        String[] nomes = new String[3];
        double[][] notas = new double[3][3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.next();

            for (int j = 0; j < 3; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\n----------------- BOLETIM -----------------");
        System.out.printf("%-10s %-8s %-8s %-8s %-8s\n", "Nome", "N1", "N2", "N3", "Media");

        for (int i = 0; i < 3; i++) {
            double soma = 0;
            for (int j = 0; j < 3; j++) {
                soma += notas[i][j];
            }
            double media = soma / 3;

            System.out.printf("%-10s %-8.1f %-8.1f %-8.1f %-8.1f\n", 
                    nomes[i], notas[i][0], notas[i][1], notas[i][2], media);
        }

        // O mais chato foi controlar dois arrays separados com o mesmo indice i.
        // Se mexer na ordem de um e esquecer do outro, mistura a nota de todo mundo.
    }
}
