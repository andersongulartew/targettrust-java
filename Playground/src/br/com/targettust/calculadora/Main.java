package br.com.targettust.calculadora;
import br.com.targettust.calculadora.Operacao;
import br.com.targettust.calculadora.Tela;

public class Main {
    public static void main(String[] args) {
        Operacao operacao = new Operacao();

        operacao.imprime();

        Tela tela = new Tela();
        tela.print();



            // ALTERNATIVA 01
//        int resultadoSoma = operacao.soma(3, 4);
//        int resultadoSubtracao = operacao.subtracao(3, 4);
//        int resultadoDivisao = operacao.divisao(3, 4);
//        int resultadoMultiplicacao = operacao.multiplicacao(3, 4);
//
//        System.out.println("Resultado da soma: " + resultadoSoma);
//        System.out.println("Resultado da subtração: " + resultadoSubtracao);
//        System.out.println("Resultado da divisão: " + resultadoDivisao);
//        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);


    }
}
