public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Cavalo!");

        String primeirapalavra = "GWA GWA";
        String segundapalavra = "Floppa";

        String Coisa = cavalo(primeirapalavra, segundapalavra);

        System.out.println(Coisa);
    }

    public static String cavalo(String primeiraPalavra, String segundaPalavra) {
        return primeiraPalavra.concat(" e ").concat(segundaPalavra);
    }
}