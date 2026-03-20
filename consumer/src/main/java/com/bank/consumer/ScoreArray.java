package com.bank.consumer;

public class ScoreArray {

    public static int score(int[] numbers) {
        int total = 0;

        for (int num : numbers) {
            if (num == 5) {
                total += 5;
            } else if (num % 2 == 0) {
                total += 1;
            } else {
                total += 3;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        int[] ejemplo1 = {1, 2, 3, 4, 5};
        System.out.println(score(ejemplo1)); // 13

        int[] ejemplo2 = {17, 19, 21};
        System.out.println(score(ejemplo2)); // 9

        int[] ejemplo3 = {5, 5, 5};
        System.out.println(score(ejemplo3)); // 15
    }
}