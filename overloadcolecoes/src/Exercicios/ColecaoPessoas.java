package Exercicios;

public class ColecaoPessoas {
    public static void main(String[] args) {

        java.util.List<String> pessoas = new java.util.ArrayList<>();
        pessoas.add("Bryana");
        pessoas.add("Kiersten");
        pessoas.add("Zaneta");
        pessoas.add("Frank");
        pessoas.add("Bryana");
        pessoas.add("Tedi");
        pessoas.add("Marigold");
        pessoas.add("Devan");
        pessoas.add("Jerrilyn");
        pessoas.add("Isac");
        pessoas.add("Kathrine");

        for (String pessoa : pessoas) {
            System.out.println("PESSOA: " + pessoa);
        }



    }
}
