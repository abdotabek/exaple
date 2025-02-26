package org.example.leet;

public class Palindrome {
    public boolean isPalindrome(String s) {
        // приводим строку к нижнему регистру и убираем все не буквенно-цифровые символы
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(c);
            }
        }
        //  Преобразуем строку с ее перевёрнутой версией
        String cleanedStr = cleaned.toString();

        // сравниваем строку с её перевернутой версии
        int left = 0;
        int right = cleanedStr.length() - 1;

        // сравниваем строку с ее перевёрнутой версией
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // test
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(palindrome.isPalindrome("race a car"));
        System.out.println(palindrome.isPalindrome(""));
        System.out.println(palindrome.isPalindrome("0P"));
    }
}
