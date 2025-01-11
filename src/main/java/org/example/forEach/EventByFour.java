package org.example.forEach;

/**
 * Определить с помощью метода в нем количество элементов
 * кратных четырем
 */
public class EventByFour {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 4, 3, 9, 16};
        int count = countElementsPerformanceByFour(array);
        System.out.println("count : " + count);

    }

    public static int countElementsPerformanceByFour(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 4 == 0) {
                count++;
            }
        }
        return count;
    }
}
