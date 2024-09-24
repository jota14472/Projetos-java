public class Estante {
    private String codigo;// E 1 E1
    private String andar;// 1 2 3 0 / cave


    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo.toUpperCase();
    }
    public String getAndar() {
        return andar;
    }
    public void setAndar(String andar) {
        this.andar = andar;
    }
    
    public Estante(String codigo, String andar) {
        this.codigo = codigo.toUpperCase();
        this.andar = andar;
    }
    public Estante() {
        this.codigo = "";
        this.andar = "";
    }
    @Override
    public String toString() {
        return "Estante [codigo=" + codigo + ", andar=" + andar + "]";
    }
    
    
}
