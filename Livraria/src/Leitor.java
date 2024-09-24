public class Leitor {
    private int numero;
    private String nome;
    private String morada;
    private int telefone;
    private String email;
    private String genero;
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMorada() {
        return morada;
    }
    public void setMorada(String morada) {
        this.morada = morada;
    }
    public int getTelefone() {
        return telefone;
    }
    
    public String getTelefoneString() {
        String aux = String.valueOf(telefone);
        String res = "";
        res += aux.substring(0, 3);
        res += "";
        res += aux.substring(3, 6);
        res += "";
        res += aux.substring(6, 9);
        return res;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIniciais() {
        String res = "";
        String[] aux = nome.split(" ");

        for (String ch : aux){
        res += ch.substring(0,1); 
        }
        return res;

    }

    public String getNomeConta(){
       String nomeproprio = "";
       String nomeapelido = "";
       String[] aux = nome.split(" ");
       for(String ch : aux) {
        if (nomeproprio != "") {
            nomeapelido = ch;
        }
        if (nomeproprio == "") {
            nomeproprio = ch.substring(0,1);
        }
       }
       return ;
    }
    
    public Leitor(int numero, String nome, String morada, int telefone, String email, String genero) {
        this.numero = numero;
        this.nome = nome;
        this.morada = morada;
        this.telefone = telefone;
        this.email = email;
        this.genero = genero;
    }

    public Leitor() {
        this.numero = 0;
        this.nome = "";
        this.morada = "";
        this.telefone = 0;
        this.email = "";
        this.genero = "";

        
    }
    @Override
    public String toString() {
        return "Leitor [numero=" + numero + ", nome=" + nome + ", morada=" + morada + ", telefone=" + telefone
                + ", email=" + email + ", genero=" + genero + "]";
    }
}
