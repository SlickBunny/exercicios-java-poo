public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        setPreco(preco);
        if (estoque >= 0) {
            this.estoque = estoque;
        } else {
            this.estoque = 0;
            System.out.println("Estoque inicial invalido, definido como 0.");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Preco invalido para o produto " + nome);
        }
    }

    public void vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade de venda deve ser maior que zero.");
        } else if (quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println("Venda de " + quantidade + " unidade(s) de " + nome + " realizada.");
        } else {
            System.out.println("Estoque insuficiente de " + nome + " para vender " + quantidade + " (disponivel: " + estoque + ").");
        }
    }

    @Override
    public String toString() {
        return nome + " | Preco: R$ " + preco + " | Estoque: " + estoque;
    }
}
