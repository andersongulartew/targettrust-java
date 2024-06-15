package org.example.Exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static String inverterPalavra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor digite uma palavra:");
        String palavra = sc.nextLine();
        sc.close();

        StringBuilder str = new StringBuilder(palavra);
        return str.reverse().toString();

    }

    public static void main(String[] args) {
        String palavra = inverterPalavra();

        System.out.println("A palavra invertida é : " + palavra);

    }


}
