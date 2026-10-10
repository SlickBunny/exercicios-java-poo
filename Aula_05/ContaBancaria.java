public class ContaBancaria {
    String titular;
    int numero;
    double saldo;

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Deposito de R$ %.2f realizado.\n", valor);
        }
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado.\n", valor);
        } else {
            System.out.println("Saldo insuficiente para sacar R$ " + valor + ". Saldo atual: R$ " + saldo);
        }
    }

    void exibirExtrato() {
        System.out.println("--- EXTRATO ---");
        System.out.println("Conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f\n", saldo);
    }
}
