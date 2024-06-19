package exercicios;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("favor digitar um numero inteiro :");
        Integer num = sc.nextInt();
        if(num%2==0){
            System.out.println("O número é par");
        }else{
            System.out.println("o número é par");
        }


    }
}
