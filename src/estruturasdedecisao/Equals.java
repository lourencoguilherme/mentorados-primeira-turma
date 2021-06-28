package estruturasdedecisao;

public class Equals {

    public static void main(String[] args) {
        String primeiraPalavra = "Teste1";
        String segundaPalavra = "Teste1";

        System.out.println(primeiraPalavra.equals(segundaPalavra));

        primeiraPalavra = "Teste1MudeiOValor";

        System.out.println(primeiraPalavra.equals(segundaPalavra));

    }
}
