package org.example.part2;

/**
 * Определить k – количество нечетных элементов массива в нем
 * содержащихся. Далее максимальный элемент массива умножить на
 * k и снова вывести.
 */
public class Count {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 1};
        int max = array[0];
        int countOddElement = 0;

        for (int num : array) {
            if (num % 2 != 0) {
                countOddElement++;
            }
            if (num > max) {
                max = num;
            }
        }
        int item = max * countOddElement;
        System.out.println("count : " + countOddElement);
        System.out.println("max : " + max);
        System.out.println("item : " + item);
    }
}
