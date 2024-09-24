
import java.util.Calendar;

public class Aluno {
    //atributos
    private int codigo;  //(ex: a12345)
    private String nomeProprio;  //(ex: Filipe)
    private String nomeApelido; //(ex: Duarte)
    private int anoNascimento;  //(ex: 1999)
    private String turma;  //(ex: objeto da classe Turma)

    // getters dos atributos
    public int getCodigo() {
        return codigo;
    }
    public String getNomeProprio() {
        return nomeProprio;
    }
    public String getNomeApelido() {
        return nomeApelido;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public String getTurma() {
        return turma;
    }

    //setteres dos atributos
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNomeProprio(String nomeProprio) {
        this.nomeProprio = nomeProprio;
    }
    public void setNomeApelido(String nomeApelido) {
        this.nomeApelido = nomeApelido;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }

    // construtor que devolve todos os dados que o aluno tem
    public Aluno(int codigo, String nomeProprio, String nomeApelido, int anoNascimento, String turma) {
        this.codigo = codigo;
        this.nomeProprio = nomeProprio;
        this.nomeApelido = nomeApelido;
        this.anoNascimento = anoNascimento;
        this.turma = turma;
    }

    // construtor que devolve tudo nulo do aluno
    public Aluno() {
        this.codigo = 0;
        this.nomeProprio = null;
        this.nomeApelido = null;
        this.anoNascimento = 0;
        this.turma = null;
    }

    //ToString do aluno
    @Override
    public String toString() {
        return "Aluno [codigo=" + codigo + ", nomeProprio=" + nomeProprio + ", nomeApelido=" + nomeApelido
                + ", anoNascimento=" + anoNascimento + ", turma=" + turma + "]";
    }

    // devolve o nome completo de aluno
    public getNomeCompleto() {

    }

    // devolve a idade do aluno
    public int getIdade() {

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

    }

    

    

}
