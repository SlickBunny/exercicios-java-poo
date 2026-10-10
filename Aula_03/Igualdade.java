import java.util.Scanner;

public class Igualdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        scanner.close();
    }
}
