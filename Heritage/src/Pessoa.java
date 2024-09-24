import java.time.LocalDate;
import java.util.Calendar;

public class Pessoa {
    private String nomeProprio;
    private String sobreNome;
    private LocalDate dataNascimento;
    private Pessoa pai;
    private Pessoa mae;

    //getters dos atributos
    public String getNomeProprio() {
        return nomeProprio;
    }
    public String getSobreNome() {
        return sobreNome;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public Pessoa getPai() {
        return pai;
    }
    public Pessoa getMae() {
        return mae;
    }

    //stters dos atributos
    public void setNomeProprio(String nomeProprio) {
        this.nomeProprio = nomeProprio;
    }
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setPai(Pessoa pai) {
        this.pai = pai;
    }
    public void setMae(Pessoa mae) {
        this.mae = mae;
    }

    //construtor com todos os atributos
    public Pessoa(String nomeProprio, String sobreNome, LocalDate dataNascimento, Pessoa pai, Pessoa mae) {
        this.nomeProprio = nomeProprio;
        this.sobreNome = sobreNome;
        this.dataNascimento = dataNascimento;
        this.pai = pai;
        this.mae = mae;
    }

    // construtore sem nada
    public Pessoa() {
        this.nomeProprio = "";
        this.sobreNome = "";
        this.dataNascimento = null;
        this.pai = null;
        this.mae = null;
    }

    public int getDescendencia() {
        int idade = 0;
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

        idade = anoAtual - dataNascimento;

        return idade;
    }


    //Tostring dos atributos
    @Override
    public String toString() {
        /*return "Pessoa [nomeProprio=" + nomeProprio + ", sobreNome=" + sobreNome + ", dataNascimento="
                + dataNascimento + ", pai=" + pai + ", mae=" + mae + "]";*/
                String aux = "";
                aux += "Pessoa [nomeProprio=" + nomeProprio + ", "; 
                aux += "sobreNome=" + sobreNome + ", ";
                aux +="datacimento=" + dataNascimento + "";
                
                aux += "\n\t Pais de (" + nomeProprio + " " +sobreNome +")";
                aux += "\n\t pai=" + pai + "\t mae=" + mae + "\n";

                return aux;
    }

    

    
    
}
