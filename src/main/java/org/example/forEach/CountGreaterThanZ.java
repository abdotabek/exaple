package org.example.forEach;

import java.util.Scanner;

/**
 * Выяснить сколько из значений массива превышает число z
 */
public class CountGreaterThanZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter DEFAULT_CAPACITY:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.print("enter item from array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("enter element for z: ");
        int z = scanner.nextInt();

        int count = 0;
        for (int num : array) {
            if (num > z) {
                count++;
            }
        }
        System.out.println("amount count > z " + z + ":" + count);
    }
}
