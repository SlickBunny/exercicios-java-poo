public class CofrePorcos {
    private double total;
    private int qtd05;
    private int qtd10;
    private int qtd25;
    private int qtd50;
    private int qtd100;

    public void inserirMoeda(double valor) {
        // Arredondamento simples para evitar problemas de precisao de ponto flutuante
        long centavos = Math.round(valor * 100);

        if (centavos == 5) {
            qtd05++;
            total += 0.05;
            System.out.println("Moeda de R$ 0,05 inserida.");
        } else if (centavos == 10) {
            qtd10++;
            total += 0.10;
            System.out.println("Moeda de R$ 0,10 inserida.");
        } else if (centavos == 25) {
            qtd25++;
            total += 0.25;
            System.out.println("Moeda de R$ 0,25 inserida.");
        } else if (centavos == 50) {
            qtd50++;
            total += 0.50;
            System.out.println("Moeda de R$ 0,50 inserida.");
        } else if (centavos == 100) {
            qtd100++;
            total += 1.00;
            System.out.println("Moeda de R$ 1,00 inserida.");
        } else {
            System.out.printf("Valor invalido: R$ %.2f. O cofre aceita apenas 0.05, 0.10, 0.25, 0.50 ou 1.00.\n", valor);
        }
    }

    public double quebrar() {
        if (total > 20.0) {
            double valorDevolvido = total;
            System.out.printf("\nCofre quebrado com sucesso! Total recuperado: R$ %.2f\n", valorDevolvido);
            System.out.println("Moedas de R$ 0,05: " + qtd05);
            System.out.println("Moedas de R$ 0,10: " + qtd10);
            System.out.println("Moedas de R$ 0,25: " + qtd25);
            System.out.println("Moedas de R$ 0,50: " + qtd50);
            System.out.println("Moedas de R$ 1,00: " + qtd100);

            total = 0;
            qtd05 = 0;
            qtd10 = 0;
            qtd25 = 0;
            qtd50 = 0;
            qtd100 = 0;

            return valorDevolvido;
        } else {
            System.out.printf("Nao e possivel quebrar. O cofre tem R$ %.2f (minimo R$ 20.00).\n", total);
            return 0.0;
        }
    }

    public static void main(String[] args) {
        CofrePorcos cofre = new CofrePorcos();

        cofre.inserirMoeda(0.05);
        cofre.inserirMoeda(0.50);
        cofre.inserirMoeda(0.30); // Invalida

        // Tentando quebrar antes do limite
        cofre.quebrar();

        // Enchendo ate passar de 20 reais
        for (int i = 0; i < 20; i++) {
            cofre.inserirMoeda(1.00);
        }

        // Agora passa de 20 reais (20.55)
        cofre.quebrar();
    }
}
