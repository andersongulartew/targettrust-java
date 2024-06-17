package org.Exercicios;

public class FormatacaoNome {
    public static void main(String[] args) {

        String nome = "Anderson Gularte Wodnoff";
        String[] nomeArray = nome.split(" ");
        nome = nomeArray[2] + "," + nomeArray[0] + " " + nomeArray[1];

        System.out.println(nome);


    }
}
