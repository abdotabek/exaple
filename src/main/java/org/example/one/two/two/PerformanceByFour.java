package org.example.one.two.two;

/**
 * Каждый элемент, дающий в остатке двойку при делении на 4
 * увеличить на единицу
 */
public class PerformanceByFour {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 5, 7, 10, 14};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 4 == 2) {
                array[i] += 1;

            }
        }
        System.out.println("update array :");
        for (int num : array) {
            System.out.println("num : " + num);
        }
    }
}
