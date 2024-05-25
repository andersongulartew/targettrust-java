package br.com.targettust.calculadora;

public class Main {
    public static void main(String[] args) {
        Operacao operacao = new Operacao();
            int resultadoSoma = operacao.soma(3, 4);
            int resultadoSubtracao = operacao.subtracao(3, 4);
            int resultadoDivisao = operacao.divisao(3, 4);
            int resultadoMultiplicacao = operacao.multiplicacao(3, 4);
        System.out.println();
    }
}
