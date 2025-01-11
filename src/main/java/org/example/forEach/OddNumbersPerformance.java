package org.example.forEach;

/**
 * Определить в нем произведение нечетных значений элементов.
 */
public class OddNumbersPerformance {
    public static void main(String[] args) {
        int[] array = {1, 5, 4, 2, 7};
        int performanceOddNumbers = 1;
        boolean found = false;
        for (int num : array) {
            if (num % 2 == 1) {
                performanceOddNumbers *= num;
                System.out.println("performance number " + num);
                found = true;
            }
        }
        if (found) {
            System.out.println("performance odd numbers : " + performanceOddNumbers);
        } else {
            System.out.println("element from array does not exist!");
        }
    }
}
