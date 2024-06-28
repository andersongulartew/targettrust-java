package exercicios;

public class ColecaoPrimeiros {
    public static void main(String[] args) {
        listaSet();

    }

    private static void listaSet() {
        java.util.List<String> primeiros = new java.util.ArrayList<>();
        System.out.println("Primeiros Nomes:");
        primeiros.add("Bryana");
        primeiros.add("Kiersten");
        primeiros.add("Zaneta");
        primeiros.add("Frank");
        primeiros.add("Bryana");
        for (String primeiro : primeiros) {
            System.out.println(primeiro);
        }

    }
}
