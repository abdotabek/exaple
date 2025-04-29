package org.example.need.part2;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharFinder {
    public static Character findFirstUniqueChar(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // 1. Подсчёт количества каждого символа
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // 2. Поиск первого символа с count == 1
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;

    }
}
