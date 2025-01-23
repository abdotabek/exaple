package org.example.part2;

/**
 * Определить максимальный или минимальный элемент в массиве
 * встречается раньше. Если максимальный, то заменить минимумом
 * второй элемент массива, если встречается раньше минимальный, то
 * заменить максимумом предпоследний элемент массива
 */
public class MaxAndMin {
    public static void main(String[] args) {
        int[] array = {2, 6, 8, 4};
        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        if (maxIndex < minIndex) {
            array[1] = min;
        } else {
            array[array.length - 2] = max;
        }

        System.out.println("modified array : ");
        for (int num : array) {
            System.out.println(num + " ");
        }

    }
}
