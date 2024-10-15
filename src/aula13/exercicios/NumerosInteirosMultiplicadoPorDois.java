package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumerosInteirosMultiplicadoPorDois {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> resultado = numeros.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());

        System.out.println(resultado);
    }


}
