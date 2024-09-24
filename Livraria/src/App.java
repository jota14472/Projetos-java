

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("EU QUERO AS FERIAS DE VERAO AGOOOOOOORA!");

          Livraria oBogalho = new Livraria( "O Bogalho", "rua azenha de cima Nº58, 4700-001 Lantemil", "Trofa", 961907218, "joao3santos@gmail.com");
          //System.out.println("Nome Da Livraria: " + oBogalho.getNome());
          //System.out.println("Nome Da Livraria: " + oBogalho.getMorada());

          Estante oBogalhoEstante = new Estante("C4", "3");
          System.out.println(oBogalhoEstante);

          Livro oBogalhoLivro = new Livro(  );
          System.out.println(oBogalhoLivro);

          Leitor oBogalhoLeitor = new Leitor(14472, "Joao Santos", "rua azenha de cima", 961907218, "joao3snatos8@gmail.com", "gay");
          System.out.println(oBogalhoLeitor);

          System.out.println("As iniciais sao: " + oBogalhoLeitor.getIniciais());
          

    }     
}
