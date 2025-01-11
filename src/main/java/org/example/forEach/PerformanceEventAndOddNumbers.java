package org.example.forEach;

/**
 * Определить произведение элементов, которые при делении на 2
 * дают такой же остаток, как и при делении на 3
 */
public class PerformanceEventAndOddNumbers {
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 1, 7, 19};
        int performance = 1;
        boolean found = false;
        for (int num : array) {
            if (num % 2 == num % 3) {
                performance *= num;
                found = true;
            }
        }
        if (found) {
            System.out.println("performance : " + performance);
        } else {
            System.out.println("element from array does not exist!");
        }
    }
}
