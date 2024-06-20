package exercicios;

import java.util.Scanner;

public class VerificacaoEspacoEmBranco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = sc.nextLine().toUpperCase();
        System.out.println("Olá " + nome + ", Você deve escrever um caractere.");
        String caractere = sc.nextLine();

        char result = caractere.charAt(0);

        if (Character.isWhitespace(result)) {
            System.out.println("o caractere digitado foi um espaço em branco");
        } else {
            System.out.println("O caractere digitado não foi um espaço em branco");
        }

        sc.close();


    }
}
