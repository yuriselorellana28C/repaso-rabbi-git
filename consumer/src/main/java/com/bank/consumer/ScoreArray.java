package com.bank.consumer;

public class ScoreArray {

    /**
     * Calcula el puntaje de un arreglo según las reglas:
     * +1 por cada número par
     * +3 por cada número impar (excepto 5)
     * +5 por cada número igual a 5
     * El 0 se considera par
     *
     * Complejidad temporal: O(n)
     * Se recorre el arreglo una sola vez.
     *
     * Complejidad espacial: O(1)
     * No se utilizan estructuras adicionales.
     */
    public static int score(int[] numbers) {
        int total = 0;

        for (int n : numbers) {
            if (n == 5) {
                total += 5;
            } else if (n % 2 == 0) {
                total += 1;
            } else {
                total += 3;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        // Arreglo de prueba
        int[] arr = {1, 2, 3, 4, 5};

        // Mostrar resultado
        System.out.println("Resultado: " + score(arr));
    }
}