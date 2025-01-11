package org.example.forEach;

/**
 * Определить в нем сумму остатков от деления на 4 тех элементов,
 * которые не кратны 3
 */
public class NotPerformanceBy4 {
    public static void main(String[] args) {
        int[] array = {2, 4, 1, 3, 5};
        int sumRemainder = 0;
        for (int num : array) {
            if (num % 3 != 0) {
                sumRemainder += num % 4;
            }
        }
        System.out.println("sum of remainders : " + sumRemainder);
    }
}
