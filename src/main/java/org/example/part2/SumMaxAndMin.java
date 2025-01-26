package org.example.part2;

/**
 * Вычислить разность между суммой элементов массива, стоящих на
 * четных местах, и суммой элементов, стоящих на нечетных местах.
 */
public class SumMaxAndMin {
    public static void main(String[] args) {
        int[] array = {3, 5, 6, 8, 3};
        int event = 0;
        int odd = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                event += array[i];
            } else {
                odd += array[i];
            }
        }
        int difference = event - odd;
        System.out.println("difference : " + difference);

    }
}
