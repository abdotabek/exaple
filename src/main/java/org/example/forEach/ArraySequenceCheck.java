package org.example.forEach;

/**
 * Проверить образует ли массив возрастающую или убывающую последовательность.
 */
public class ArraySequenceCheck {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        if (isAscending(array)) {
            System.out.println("Массив образует возрастающую последовательность.");
        } else if (isDescending(array)) {
            System.out.println("Массив образует убывающую последовательность.");
        } else {
            System.out.println("Массив не образует ни возрастающую, ни убывающую последовательность.");
        }
    }

    public static boolean isAscending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDescending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
