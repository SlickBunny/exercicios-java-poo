public class Banco {
    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria("Carlos", 101, 500.0);

        c.depositar(150.0);
        c.sacar(200.0);
        c.sacar(800.0);

        System.out.println("Saldo via getter: " + c.getSaldo());
        System.out.println(c);

    }
}
