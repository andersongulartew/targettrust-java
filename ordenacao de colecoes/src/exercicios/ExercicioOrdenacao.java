package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExercicioOrdenacao {
    public static void main(String[] args) {
//        List<Produto> produtos = new ArrayList<>();
//        produtos.add(new Produto("creme dental", 2.49, 2.99));
//        produtos.add(new Produto("sabonete em barra", 2.90, 3.90));
//        produtos.add(new Produto("protetor solar", 37.39, 39.12));
//        produtos.add(new Produto("fralda P", 44.90, 44.90));
//        produtos.add(new Produto("Condicionador", 19.80, 19.50));


        Produto cremeDental = new Produto();
        cremeDental.setNome("Creme Dental 90g");
        cremeDental.setCustoAquisicao(2.49);
        cremeDental.setValorVenda(2.99);
        System.out.println(cremeDental);

        Produto sabonete = new Produto();
        sabonete.setNome("Sabonete em Barra Corporal 90g");
        sabonete.setCustoAquisicao(2.99);
        sabonete.setValorVenda(3.30);
        System.out.println(sabonete);

        Produto protetorSolar = new Produto();
        protetorSolar.setNome("Protetor Solar 30 FPS 200ml");
        protetorSolar.setCustoAquisicao(37.39);
        protetorSolar.setValorVenda(39.12);
        System.out.println(protetorSolar);

        Produto fralda = new Produto();
        fralda.setNome("Fralda P Confort- 50 Unidades");
        fralda.setCustoAquisicao(44.90);
        fralda.setValorVenda(44.90);
        System.out.println(fralda);

        Produto condicionador = new Produto();
        condicionador.setNome("Condicionador 200ml");
        condicionador.setCustoAquisicao(18.90);
        condicionador.setValorVenda(19.50);
        System.out.println(condicionador);


    }

}