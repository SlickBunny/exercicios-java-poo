public class Livro {
    String titulo;
    String autor;
    int paginas;
    boolean disponivel = true;

    void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro '" + titulo + "' emprestado com sucesso.");
        } else {
            System.out.println("Livro '" + titulo + "' ja esta emprestado.");
        }
    }

    void devolver() {
        disponivel = true;
        System.out.println("Livro '" + titulo + "' devolvido.");
    }

    void exibirFicha() {
        System.out.println("---------------------------");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
        System.out.println("Status: " + (disponivel ? "Disponivel" : "Emprestado"));
    }
}
