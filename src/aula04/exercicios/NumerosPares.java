package aula04.exercicios;

public class NumerosPares {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("Numero " + i);
        }
    }
}
