package br.com.targettrust.snack;

import java.util.Scanner;

public class FluxoAtendimento {

    public void executar() {

        System.out.println("## Fluxo de atendimento:");
        System.out.println("Informe o código do produto");

        Scanner scanner = new Scanner(System.in);
        Integer codigo = scanner.nextInt();

        System.out.println("Qual será a forma de pagamento?");
        System.out.println("Se for cartão de crédito/débito, informe 1");
        System.out.println("Se for dinheiro, informe 2");
        int formaPagamento = scanner.nextInt();

    }
}
