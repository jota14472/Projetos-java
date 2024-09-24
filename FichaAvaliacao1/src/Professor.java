public class Professor {
    private int numero;  //(ex: 12345)
    private String nomeProprio;  //(ex: Luis)
    private String nomeApelido;  //(ex: Santos)
    private int anoNascimento;  //(ex: 1999)
    private String area;  //(ex: Programação)

    //getters dos atributos
    public int getNumero() {
        return numero;
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
    public String getArea() {
        return area;
    }

    //setters dos atributos
    public void setNumero(int numero) {
        this.numero = numero;
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
    public void setArea(String area) {
        this.area = area;
    }

    //construtor que devolve tudo do professor
    public Professor(int numero, String nomeProprio, String nomeApelido, int anoNascimento, String area) {
        this.numero = numero;
        this.nomeProprio = nomeProprio;
        this.nomeApelido = nomeApelido;
        this.anoNascimento = anoNascimento;
        this.area = area;
    }
   // construtor que devolve null os atributos do professor
    public Professor() {
        this.numero = 0;
        this.nomeProprio = null;
        this.nomeApelido = null;
        this.anoNascimento = 0;
        this.area = null;
    }

    // ToString do professor
    @Override
    public String toString() {
        return "Professor [numero=" + numero + ", nomeProprio=" + nomeProprio + ", nomeApelido=" + nomeApelido
                + ", anoNascimento=" + anoNascimento + ", area=" + area + "]";
    }

    // devolve o nome completo do professor
    Public  getNomeCompleto() {

        this.nomeProprio = "";
        this.nomeApelido = "";

    }
    

    
}
