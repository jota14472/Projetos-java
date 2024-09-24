public class App {
    public static void main(String[] args) throws Exception {
        Professor prof1 = new Professor(12345, "Luís", "Santos", 1999, "Programação");
        Turma turma1 = new Turma("cx12345", "Programador", 2023, 2026);
        Aluno aluno1 = new Aluno("a14473", "Ângelo", "Ferreira", 2008, turma1);
        Aluno aluno2 = new Aluno("a14474", "Daniel", "Brás", 2008, turma1);
        Aluno aluno3 = new Aluno("a14475", "Dinis", "Neves", 2008, turma1);
    
        System.out.println(prof1);
        System.out.println(turma1);
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
        System.out.println(prof1.getNomeCompleto());
        turma1.getInfoTurma();
        System.out.println(aluno1.getNomeCompleto());
        System.out.println(aluno1.getIdade());
    
    }
}
