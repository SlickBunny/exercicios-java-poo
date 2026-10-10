public class Turma {
    public static void main(String[] args) {
        System.out.println("Matriculados antes: " + Aluno.getTotalMatriculados());

        Aluno a1 = new Aluno("Ana");
        a1.setNota1(8.0);
        a1.setNota2(7.0);

        Aluno a2 = new Aluno("Bruno");
        a2.setNota1(5.0);
        a2.setNota2(12.0); // Rejeita e mantem 0
        a2.setNota2(4.0);

        Aluno a3 = new Aluno("Carla");
        a3.setNota1(9.0);
        a3.setNota2(9.5);

        System.out.println("\nLista de Alunos:");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("\nMatriculados no total: " + Aluno.getTotalMatriculados());
    }
}
