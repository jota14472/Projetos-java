public class Autor {
   private String nome;
   private String sobrenome;

public String getNome() {
    return nome;
}


public Autor(String nome) {
    this.nome = nome;
}

public String getSobrenome() {
    return sobrenome;
}

public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
}


public Autor(String nome, String sobrenome) {
    this.nome = nome;
    this.sobrenome = sobrenome;
}


@Override
public String toString() {
    return "Autor [nome=" + nome + ", sobrenome=" + sobrenome + "]";
}

   
}
