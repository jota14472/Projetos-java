import java.time.LocalDate;

public class ArtigoWeb extends Artigo {

    private String tipoArtigo;

    public String getTipoArtigo() {
        return tipoArtigo;
    }

    public void setTipoArtigo(String tipoArtigo) {
        this.tipoArtigo = tipoArtigo;
    }

    public ArtigoWeb(String titulo, Autor autor, LocalDate dataPublicacao, Categoria categoria) {
        super(titulo, autor, dataPublicacao, categoria);
        this.tipoArtigo = "Artigo web";
    }

    @Override
    public String toString() {
        return "ArtigoWeb [tipoArtigo=" + tipoArtigo + ", toString()=" + super.toString() + "]";
    }

    

}
