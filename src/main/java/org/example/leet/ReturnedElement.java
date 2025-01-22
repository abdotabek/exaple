package org.example.leet;

public class ReturnedElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        boolean hasDuplicate = checkForDuplicates(array);
        if (hasDuplicate) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean checkForDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
