package com.targettrust.loop.whileDoWhile;

public class MultiplicarArray {
    public static void main(String[] args) {
        int[] id = {1, 2, 3, 4};

        int i = 0;
        while (i < id.length) {
            id[i] *= 2;
            i++;
        }

        System.out.println("Array Com Valores Atualizados:");
        for (int numero : id) {
            System.out.print(numero + " ");
        }




    }

}

