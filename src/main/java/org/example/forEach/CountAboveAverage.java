package org.example.forEach;

/**
 * . Найти среднее арифметическое значение массива и вернуть в
 * качестве возвращаемого значения количество элементов,
 * превышающих среднее арифметическое.
 */
public class CountAboveAverage {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int count = countAboveAverage(array);
        System.out.println("количество элементов, превыщающих среднее: " + count);
    }

    public static int countAboveAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int num : arr) {
            sum = sum + num;
        }
        double average = sum / arr.length;
        System.out.println("среднее значения : " + average);

        int count = 0;
        for (int num : arr) {
            if (num > average) {
                count++;
            }
        }
        return count;
    }
}
