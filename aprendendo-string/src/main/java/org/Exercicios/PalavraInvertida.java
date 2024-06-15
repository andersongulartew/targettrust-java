package org.Exercicios;

import java.util.Scanner;

public class PalavraInvertida {

    public static String inverterPalavra() {
//        Scanner sc = new Scanner(System.in);
//
//        String palavra;
//        System.out.println("Por favor digite uma palavra:");
//        palavra = sc.nextLine();
//        sc.close();

//        return palavra;
        String palavra = "abacate";
        StringBuilder str = new StringBuilder(palavra);
        return str.reverse().toString();


    }

    public static void main(String[] args) {
        String palavra = inverterPalavra();
//        StringBuilder str = new StringBuilder(palavra);
//        String result = str.reverse().toString();

//        System.out.println("A palavra invertida fica : " + result);
        System.out.println("A palavra invertida fica : " + palavra);

    }


}
