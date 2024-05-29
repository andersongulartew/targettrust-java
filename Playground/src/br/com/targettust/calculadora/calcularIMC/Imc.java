package br.com.targettust.calculadora.calcularIMC;

import java.util.Scanner;

public class Imc {

    static Scanner sc = new Scanner(System.in);
public static double Peso() {

    System.out.print("Digite seu peso : ");
    double peso = sc.nextDouble();
    return peso;
}
public static double Altura() {
    System.out.println("Digite sua altura");
    double altura = sc.nextDouble();
    return altura;
}

public static void main(String[] args) {
        double peso = Peso();
        double altura = Altura();

        sc.close();
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);


   }

}

