public class Livro {
    private String titulo;
    private String autor;
    private int paginas;


    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getInfoLivro() {
        String aux = "";
        aux += "Titulo do Livro: " + this.getTitulo();
        aux += "\nAutor do Livro: " + this.getAutor();
        aux += "\nO Livro tem: " + this.getPaginas() + "pags";

        return aux;
    }

   
    
    public Livro() {
        this.titulo = "";
        this.autor = "";
        this.paginas = 0;
    }
    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
    }
    
    
    
}
