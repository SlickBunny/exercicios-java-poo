public class Estante {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.titulo = "O Hobbit";
        l1.autor = "J.R.R. Tolkien";
        l1.paginas = 310;

        Livro l2 = new Livro();
        l2.titulo = "1984";
        l2.autor = "George Orwell";
        l2.paginas = 328;

        Livro l3 = new Livro();
        l3.titulo = "Dom Casmurro";
        l3.autor = "Machado de Assis";
        l3.paginas = 256;

        l2.emprestar();

        l1.exibirFicha();
        l2.exibirFicha();
        l3.exibirFicha();
    }
}
