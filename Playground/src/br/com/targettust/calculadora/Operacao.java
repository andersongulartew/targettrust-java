package br.com.targettust.calculadora;

import com.exemplo.playground.Metodos;

public class Operacao {
    public int somar(int a, int b) {
        return a + b;
    }
    public int subtracao(int a, int b) {
        return a - b;
    }

    public int divisao(int a, int b) {
        return a / b;
    }
     public int multiplicacao(int a, int b) {
        return a * b;
    }

//    public int soma(int a, int b) {
//        return a + b;
//    }
//
//
//    //*********************************************
//    public int subtracao(int a, int b) {
//        return a - b;
//    }
//
//
//    //*********************************************
//    public int divisao(int a, int b) {
//        return a / b;
//    }
//
//
//    //*********************************************
//    public int multiplicacao(int a, int b) {
//        return a * b;
//    }

//     public static void main (String[] args){
//            Operacao operacao = new Operacao();
//            int resultado = operacao.soma(3, 4);
//            System.out.println(resultado);
//     }

    public void imprime() {
        System.out.println(this.somar(5, 7));
        System.out.println(this.subtracao(5, 7));
        System.out.println(this.divisao(5, 7));
        System.out.println(this.multiplicacao(5, 7));
    }


}



