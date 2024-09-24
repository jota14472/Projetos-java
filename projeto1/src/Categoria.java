public class Categoria {
    
    /*
     * slug da categoria
     * nome da categoria
     * nome da categoria PAI * Se tiver 
     */

    private String nome;
    private String slug;
    private Categoria pai;


    //get do pai
    public Categoria getPai() {
        return pai;
    }

    // set do pai
    public void setPai(Categoria pai) {
        this.pai = pai;
    }
    // get do slug
    public String getSlug() {
        return slug;
    }
    // set do slug
    public void setSlug(String slug) {
        this.slug = slug;
    }
    // get do nome
    public String getNome() {
        return nome;
    }
    // set do nome
    public void setNome(String nome) {
        this.nome = nome;
    }

   // construtor sem nada para nao dar erro
    public Categoria() {
        this.slug = "";
        this.nome = "";
        this.pai = null;
    }

    // construtor do slug, do nome e do pai
    public Categoria(String nome, String slug, Categoria pai) {
        this.nome = nome;
        this.slug = slug;
        this.pai = pai;
    }

    // to string do slug, do nome e do pai
    @Override
    public String toString() {
        return "Categoria [nome=" + nome + ", slug=" + slug + ", pai=" + pai + "]";
    }


   

}
