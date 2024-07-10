package exercicios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o primeiro valor inteiro: ");
            Integer num1 = sc.nextInt();

            System.out.println("Digite o segundo valor inteiro: ");
            Integer num2 = sc.nextInt();

            System.out.println("divisão" + divisao(num1, num2));

            sc.close();

        } catch (Exception e) {
            System.out.println("divisão por 0 nao é permitido");
        }
    }

    public static Integer divisao(Integer num1, Integer num2) {


        if (num2 == 0) {
            throw new ArithmeticException("divisão por 0 nao é permitido");
        }
        return divisao(num1, num2);


    }
}

