package org.example.leet;

/**
 * Вам дан массив различных целых чисел nums, отсортированный по возрастанию, и целевое число target.
 Реализуйте функцию для поиска target в nums. Если он существует, то верните его индекс, в противном случае верните -1.
 */
public class Search {
    public int isValid(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                target = i;
                return target;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Search search = new Search();
        int[] x = {-1, 0, 2, 4, 6, 8};
        int y = 3;
        int valid = search.isValid(x, y);
        System.out.println(valid);
    }
}
