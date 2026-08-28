
public class Apresentacao {
    public static void main(String[] args) {
        String nome = "Vinicius";
        int idade = 23;
        double altura = 1.75;
        boolean estudaNoite = true;

        System.out.printf("Olá, me chamo %s, tenho %d anos, minha altura é %.2f e estudo à noite: %b.%n", 
                          nome, idade, altura, estudaNoite);
    }
}
