package org.example.forEach;

import java.util.Scanner;

/**
 * Определить в нем произведение элементов, значения которых
 * лежат вне диапазона [a; b]
 */
public class ElementNotFromIndex {
    public static void main(String[] args) {
        int[] array = {2, 5, 1};
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the lower bound (a) : ");
        int a = scanner.nextInt();

        System.out.print("enter the upper bound (b) : ");
        int b = scanner.nextInt();

        int notBound = 1;
        boolean found = false;

        for (int num : array) {
            if (num < a || num > b) {
                notBound *= num;
                found = true;
            }
        }
        if (found) {
            System.out.println("product elements outside the range [" + a + "; " + b + "] : " + notBound);
        } else {
            System.out.println("No elements outside the range [" + a + "; " + b + "].");
        }
    }
}
