package org.example.forEach;

/**
 * Найти среднее арифметическое наибольшего и наименьшего из
 * значений массива.
 */
public class AverageDifferentMaxAndMin {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 0};
        int max = array[0];
        int min = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        double average = (double) (max + min) / 2;
        System.out.println("max: " + max);
        System.out.println("min : " + min);
        System.out.println("average : " + average);
    }
}
