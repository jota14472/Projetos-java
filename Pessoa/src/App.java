public class App {
    public static void main(String[] args) throws Exception {
         //criação dos objetoso
        
         Pessoa pai = new Pessoa("Joao Paulo Santos", 1973, 7, 23);
         Pessoa mae = new Pessoa("Liliana Martins", 1977, 10, 16);
         Pessoa filho = new Pessoa("Joao Pedro Santos", 2008, 8, 3);
         
         //mostra descendencia
         System.out.println(filho);
         System.out.println(pai);
         System.out.println(mae);
    }
}
