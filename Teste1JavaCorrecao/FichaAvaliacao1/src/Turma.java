public class Turma {
    private String codigo;
    private String nomeCurso;
    private int anoInicio;
    private int anoFim;

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public int getAnoInicio() {
        return anoInicio;
    }
    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }
    public int getAnoFim() {
        return anoFim;
    }
    public void setAnoFim(int anoFim) {
        this.anoFim = anoFim;
    }

    public Turma() {
        this.codigo = "";
        this.nomeCurso = "";
        this.anoInicio = 0;
        this.anoFim = 0;
    }

    public Turma(String codigo, String nomeCurso, int anoInicio, int anoFim) {
        this.codigo = codigo;
        this.nomeCurso = nomeCurso;
        this.anoInicio = anoInicio;
        this.anoFim = anoFim;
    }

    public void getInfoTurma() {
        System.out.println("Código = " + this.codigo.toUpperCase());
        System.out.println("Nome do Curso = " + this.nomeCurso.toUpperCase());
        System.out.println("Inicio do Ano = " + this.anoInicio);
        System.out.println("Fim do Ano = " + this.anoFim);

    }
    
    @Override
    public String toString() {
        return "Codigo = " + codigo + ", nomeCurso = " + nomeCurso + ", anoInicio = " + anoInicio + ", anoFim = "
                + anoFim;
    }
    
}
