import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        //define o padram da data de nascimento
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        // Atributos 
        String dnPaiPai = "1950/01/01";
        String dnPaiMae = "1953/01/01";
        String dnMaePai = "1956/01/01";
        String dnMaeMae = "1958/01/01";
        String dnPai = "1973/01/01";
        String dnMae = "1977/01/01";
        String dnEu = "1977/01/01";

        // objetos que me permitem mostrar as datas de nascimento e o resto da familia
        Pessoa paiPai = new Pessoa("Josef", "Carvaio", LocalDate.parse(dnPaiPai, formato) , null, null);
        Pessoa maePai = new Pessoa("Jacinta", "Comapinta", LocalDate.parse(dnMaePai, formato) , null, null);
        Pessoa paiMae = new Pessoa("Leibrego", "Churmante", LocalDate.parse(dnPaiMae, formato) , null, null);
        Pessoa maeMae = new Pessoa("Farnella", "Smith", LocalDate.parse(dnMaeMae, formato) , null, null);
        Pessoa pai = new Pessoa("Pedro", "Costelas", LocalDate.parse(dnPai, formato) , paiPai, maePai);
        Pessoa mae = new Pessoa("Maria", "Carbeças", LocalDate.parse(dnMae, formato) , paiMae, maeMae);
        Pessoa eu = new Pessoa("Joao", "Santos", LocalDate.parse(dnEu, formato) , pai, mae);

       
        System.out.println(eu);
        

    }
}