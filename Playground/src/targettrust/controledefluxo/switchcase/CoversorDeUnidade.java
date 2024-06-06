package targettrust.controledefluxo.switchcase;

import java.util.Scanner;

public class CoversorDeUnidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de Unidade :");
        System.out.println("Converte de Celsius para Fahrenheit _ Digite 1");
        System.out.println("Converter KM em Milhas _ Digite 2");
        int opcao = sc.nextInt();


        if (opcao == 1) {
            System.out.println("Digite os graus Celsius: ");
        }else{
            System.out.println("Digite os KMs: ");
        }
        double inf = sc.nextDouble();

        double conversao;

        switch (opcao) {
            case 1: {
                conversao = (inf * 9 / 5) + 32;
                System.out.println("A conversão de Celsiu em Fahrenheit é: " + String.format("%.2f" , conversao) + " Fahrenheit");
                break;
            }
            case 2: {
                conversao = (inf * 0.621371);
                System.out.println("A conversão de Quilomêtros em Milhas é: " + String.format("%.2f" , conversao) + " Milhas");
                break;
            }
            default:{
                System.out.println("Informção Inválida");
            }


        }
        sc.close();
    }
}
