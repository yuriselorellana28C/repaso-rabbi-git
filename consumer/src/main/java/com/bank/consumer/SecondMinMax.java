package com.bank.consumer;

public class SecondMinMax {

    public static void main(String[] args) {

        int[] numbers = {7, 2, 9, 4, 6, 1, 8};

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int n : numbers) {

            // mínimos
            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n != min1 && n < min2) {
                min2 = n;
            }

            // máximos
            if (n > max1) {
                max2 = max1;
                max1 = n;
            } else if (n != max1 && n > max2) {
                max2 = n;
            }
        }

        System.out.println("Segundo menor: " + min2);
        System.out.println("Segundo mayor: " + max2);
    }
}