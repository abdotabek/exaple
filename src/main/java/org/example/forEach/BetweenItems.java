package org.example.forEach;

/**
 * В массиве найти разность между наибольшим и наименьшим
 * значением.
 */
public class BetweenItems {
    public static void main(String[] args) {
        int[] array = {1, 5, 4, 5, 2, 4};
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
        int difference = max - min;
        System.out.println("max : " + max);
        System.out.println("min : " + min);
        System.out.println("between : " + difference);
    }
}
