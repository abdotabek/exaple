package org.example;

/**
 * Найти количество значений массива, которые меньше своего левого соседа.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 2, 7, 1, 4, 1};
        int count = countLessThanLeftNeighbor(array);
        System.out.println("Количество значений, которые меньше своего левого соседа: " + count);
    }

    public static int countLessThanLeftNeighbor(int[] array) {
        if (array.length < 2) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                count++;
            }
        }
        return count;
    }
}
