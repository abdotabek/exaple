package org.example.part2;

import java.util.Arrays;

/**
 * Определить упорядочены ли элементы массива по возрастанию.
 * Если не упорядочены, то поменять в массиве второй и последний
 * элементы массива, иначе эти элементы возвести в куб.
 */
public class Cub {
    public static void main(String[] args) {
        int[] array = {5, 3, 7, 4, 2};
        System.out.println(Arrays.toString(array));

        boolean isSorted = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (!isSorted) {

            int temp = array[1];
            array[1] = array[array.length - 1];
            array[array.length - 1] = temp;

        } else {

            array[1] = array[1] * array[1] * array[1];
            array[array.length - 1] = array[array.length - 1] * array[array.length - 1] * array[array.length - 1];
        }

        System.out.println(Arrays.toString(array));
    }
}
