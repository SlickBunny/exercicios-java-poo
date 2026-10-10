import java.util.Scanner;

public class Turma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno[] alunos = new Aluno[3];

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            String nome = scanner.next();

            double[] notas = new double[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[j] = scanner.nextDouble();
            }

            alunos[i] = new Aluno(nome, notas);
        }

        System.out.println("\n----------------- BOLETIM -----------------");
        System.out.printf("%-10s %-8s %-8s %-8s %-8s\n", "Nome", "N1", "N2", "N3", "Media");

        for (Aluno a : alunos) {
            System.out.printf("%-10s %-8.1f %-8.1f %-8.1f %-8.1f\n",
                    a.nome, a.notas[0], a.notas[1], a.notas[2], a.calcularMedia());
        }

        scanner.close();

    }
}
