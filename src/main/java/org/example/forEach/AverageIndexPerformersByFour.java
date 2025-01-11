package org.example.forEach;

public class AverageIndexPerformersByFour {
    public static void main(String[] args) {
        int[] array = {2, 4, 1, 2, 3, 6};
        int countElement = 0;
        int sumElement = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 4 == 2) {
                countElement++;
                sumElement += array[i] * array[i];
            }
        }
        if (countElement > 0) {

            int average = sumElement / countElement;
            System.out.println("Average of squares of elements : " + average);
        } else {
            System.out.println("element from array does not exist!");
        }
    }
}
