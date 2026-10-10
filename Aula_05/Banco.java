public class Banco {
    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria();
        c.titular = "Carlos Silva";
        c.numero = 1024;
        c.saldo = 500.0;

        c.exibirExtrato();

        // 1. Saque valido
        c.sacar(200.0);
        c.exibirExtrato();

        // 2. Saque sem saldo
        c.sacar(400.0);
        c.exibirExtrato();
    }
}
