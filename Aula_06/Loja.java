public class Loja {
    public static void main(String[] args) {
        Produto p1 = new Produto("Teclado", 150.0, 5);
        System.out.println(p1);

        // Teste 1: preco invalido
        p1.setPreco(-50.0);

        // Teste 2: venda maior que estoque
        p1.vender(10);

        // Teste 3: venda valida
        p1.vender(3);

        System.out.println("Apos operacoes: " + p1);
    }
}
