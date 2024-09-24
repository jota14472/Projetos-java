import java.time.LocalDate;
import java.util.*;
public class App {
    
    public static void main(String[] args) throws Exception {
        
        List<Artigo> livros = new ArrayList<Artigo>();
        Scanner txtEntrada = new Scanner(System.in);

        Categoria acao = new Categoria("acao", "Açcao", null);
        //System.out.println(acao);
        Categoria animacao = new Categoria("animacao", "animação", acao);
        //System.out.println(animacao);

        int op = 1;
        while (op != 0){
            System.out.println("Quer inserir livro? (0 - Nao / 1 - Sim) Re: " );
            op = txtEntrada.nextInt();
            /*
             como é um inteiro e damos enter entao forçamos este nextLine que nao faz nd a nivel de guardar mas deixa o \n fora da memória
             */
            txtEntrada.nextLine();

            if (op != 0){
                System.out.println("Nome livro? " );
                String nomeLivro = txtEntrada.nextLine();

                System.out.println("Nome autor? " );
                String autor1nomeLivro = txtEntrada.nextLine();

                System.out.println("sobrenome do autor? " );
                String autor2nomeLivro = txtEntrada.nextLine();

                System.out.println("Data da publicacao? " );
                String dataLivro = txtEntrada.nextLine();

                livros.add( new Artigo(nomeLivro, new Autor(autor1nomeLivro, autor2nomeLivro),LocalDate.parse(dataLivro), animacao));
            }
        }




        //Autor autor = new Autor("Joao", "Santos");
       
        ArtigoWeb livroWeb1 = new ArtigoWeb("Robin em Collants",
                                    new Autor("Joao", "Santos"), 
                                    LocalDate.of(2024, 05, 07), 
                                    animacao);
        System.out.println(livroWeb1);
       
    }
}
