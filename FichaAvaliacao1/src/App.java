public class App {
    public static void main(String[] args) throws Exception {
        Professor prof = new Professor(14465, "Luiz", "Santos", 1989, "progracao");
        Aluno aluno = new Aluno(14472, "Joao", "Santos", 2008, null);
        Turma turma = new Turma(14473, "programacao", 2023, 2026);

        System.out.println(prof);
        System.out.println(aluno);
        System.out.println(turma);

        
    }
}
