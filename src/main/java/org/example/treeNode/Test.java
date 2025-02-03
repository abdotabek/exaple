package org.example.treeNode;

public class Test {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 2, 9};
        int target = 5;

        int temp = 0;

        for (int i = 0; i < array.length-1; i++) {
            temp = array[i] + array[i + 1];
            if (temp == target) {
                System.out.println(temp);
            }
        }
        System.out.println("temp : " + temp);

    }
}
