package org.example.forEach;

import java.util.Scanner;

/**
 * Определить в нем количество элементов, квадрат которых больше
 * введенного a.
 */
public class Kvadrat {
    public static void main(String[] args) {
        int[] array = {1, 5, 7, 2};
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the number : ");
        int a = scanner.nextInt();

        for (int num : array) {
            int x = num * num;
            if (x > a) {
                count++;
            }
        }
        System.out.println("element :" + count);
    }
}
