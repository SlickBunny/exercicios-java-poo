public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mes invalido (" + mes + "), padronizado para 1.");
            this.mes = 1;
        }

        if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            this.dia = 1;
        }

        this.ano = ano;
    }

    public Data(int dia, int mes) {
        this(dia, mes, 2026);
    }

    public Data() {
        this(1, 1, 2026);
    }

    public void exibir() {
        System.out.printf("%02d/%02d/%04d\n", dia, mes, ano);
    }

    public static void main(String[] args) {
        Data d1 = new Data(15, 8, 2024);
        Data d2 = new Data(9, 10);
        Data d3 = new Data();
        Data d4 = new Data(5, 15, 2026); // Mes invalido

        d1.exibir();
        d2.exibir();
        d3.exibir();
        d4.exibir();
    }
}
