package org.example.part2;

public class Array {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 76, 4, 1, 75, 3, 5, 2};

        int temp = -1;
        int tem = 0;

        for (int i : array) {
            if (i == 1) {
                temp = 1;
            } else if (temp != -1 && i == 2) {
                tem++;
            }
        }
        System.out.println("count : " + tem);
    }
}
