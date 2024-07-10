package br.com.targettrust.snack;

import java.util.Scanner;

public class PagamentoCartao extends FormaPagamento{
    @Override
    public void realizarPagamento(Float valor) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero do cartão");
        Integer numero = sc.nextInt();
        System.out.println("Informe a validade do cartao");
        Integer validade = sc.nextInt();
        System.out.println("Informe a CVV");
        Integer CVV = sc.nextInt();
    }
}
