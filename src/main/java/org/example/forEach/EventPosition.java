package org.example.forEach;

public class EventPosition {
    public static void main(String[] args) {
        int[] array = {2, 1, 5, 8, 4, 4};
        int count = 0;
        int sumElement = 1;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                count++;
                sumElement *= array[i];
            }
        }
        if (count > 1) {
            double geometric = Math.pow(sumElement, (double) 1.0 / count);
            System.out.println("geometric mean : " + geometric);
        } else {
            System.out.println("elements from array does not exist!");
        }
    }
}
