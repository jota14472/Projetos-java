public class Professor {
    private int numero;
    private String nomeProprio;
    private String nomeApelido;
    private int anoNascimento;
    private String area;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeProprio() {
        return nomeProprio;
    }

    public void setNomeProprio(String nomeProprio) {
        this.nomeProprio = nomeProprio;
    }

    public String getNomeApelido() {
        return nomeApelido;
    }

    public void setNomeApelido(String nomeApelido) {
        this.nomeApelido = nomeApelido;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Professor() {
        this.numero = 0;
        this.nomeProprio = "";
        this.nomeApelido = "";
        this.anoNascimento = 0;
        this.area = "";
    }

    public Professor(int numero, String nomeProprio, String nomeApelido, int anoNascimento, String area) {
        this.numero = numero;
        this.nomeProprio = nomeProprio;
        this.nomeApelido = nomeApelido;
        this.anoNascimento = anoNascimento;
        this.area = area;
    }

    public String getNomeCompleto() {
        String nomeInteiro = "";

        nomeInteiro += this.nomeProprio;
        nomeInteiro += " ";
        nomeInteiro += this.nomeApelido;

        return nomeInteiro;
    }

    @Override
    public String toString() {
        return "Numero = " + numero + ", nomeProprio = " + nomeProprio + ", nomeApelido = " + nomeApelido
                + ", anoNascimento = " + anoNascimento + ", area = " + area;
    }

}
