public class Referencia {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        c1.titular = "Ana";
        c1.numero = 101;
        c1.saldo = 100.0;

        ContaBancaria c2 = c1;
        c2.depositar(150.0);

        System.out.println("Saldo de c1 apos deposito via c2: " + c1.saldo);

        // O saldo de c1 mudou porque c1 e c2 nao guardam objetos separados,
        // apenas copiam a referencia de memoria. Ambas as variaveis apontam
        // para a mesmissima instancia no Heap.

        // Provocando NullPointerException:
        ContaBancaria c3 = null;
        c3.exibirExtrato();

        // Mensagem de erro capturada no console:
        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "ContaBancaria.exibirExtrato()" because "c3" is null
        //     at Referencia.main(Referencia.java:19)
    }
}
