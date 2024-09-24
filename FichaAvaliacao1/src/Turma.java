public class Turma {
    //atributos
    private int codigo;  //(ex: CX12345)
    private String nomeCurso; //(ex: Programador de Informática)
    private int anoInicio; //(ex: 2023)
    private int anoFim; //(ex: 2026)

    //getters dos atributos
    public int getCodigo() {
        return codigo;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public int getAnoInicio() {
        return anoInicio;
    }
    public int getAnoFim() {
        return anoFim;
    }

    //setteres dos atributos
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }
    public void setAnoFim(int anoFim) {
        this.anoFim = anoFim;
    }

    //construtor que devolve tudo da turma
    public Turma(int codigo, String nomeCurso, int anoInicio, int anoFim) {
        this.codigo = codigo;
        this.nomeCurso = nomeCurso;
        this.anoInicio = anoInicio;
        this.anoFim = anoFim;
    }

    // construtor que devolve tudo nullo da turma
    public Turma() {
        this.codigo = 0;
        this.nomeCurso = null;
        this.anoInicio = 0;
        this.anoFim = 0;
    }

    //ToString da turma
    @Override
    public String toString() {
        return "Turma [codigo=" + codigo + ", nomeCurso=" + nomeCurso + ", anoInicio=" + anoInicio + ", anoFim="
                + anoFim + "]";
    }

    //Mostra os dados da turma
    public  getInfoTurma() {
        
        System.out.print("O nome do curso: ");

        System.out.println(this.getNomeCurso());

        System.out.print("O inicio do ano: ");

        System.out.println(this.getAnoInicio());

        System.out.print("O fim do ano: ");

        System.out.println(this.getAnoFim());

        System.out.print("O codigo: ");

        System.out.println(this.getCodigo());

       

       

    }

    

   

    

    
    

    
}
