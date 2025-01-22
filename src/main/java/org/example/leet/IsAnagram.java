package org.example.leet;

public class IsAnagram {
    public static void main(String[] args) {
        isAnagram("racecar", "carrace");
    }

    public static void isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) {
                return;
            }
        }
    }
}
