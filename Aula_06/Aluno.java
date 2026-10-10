public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private static int totalMatriculados = 0;

    public Aluno(String nome) {
        this.nome = nome;
        totalMatriculados++;
    }

    public static int getTotalMatriculados() {
        return totalMatriculados;
    }

    public void setNota1(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota1 = nota;
        } else {
            System.out.println("Nota 1 invalida: " + nota + " (deve ser entre 0 e 10)");
        }
    }

    public void setNota2(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota2 = nota;
        } else {
            System.out.println("Nota 2 invalida: " + nota + " (deve ser entre 0 e 10)");
        }
    }

    public double getMedia() {
        return (nota1 + nota2) / 2.0;
    }

    public String getSituacao() {
        return getMedia() >= 6.0 ? "Aprovado" : "Reprovado";
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " | Media: " + getMedia() + " | Situacao: " + getSituacao();
    }
}
