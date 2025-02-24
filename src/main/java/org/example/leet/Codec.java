package org.example.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Codec {
    public String encode(List<String> args) {
        StringBuilder encodeString = new StringBuilder();
        for (String str : args) {
            // Добавляем длину строки, разделитель и саму строку
            encodeString.append(str.length()).append("#").append(str);
        }
        return encodeString.toString();
    }

    public List<String> decode(String s) {
        List<String> decodedString = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int delimiterIndex = s.indexOf("#", i);
            int length = Integer.parseInt(s.substring(i, delimiterIndex));
            i = delimiterIndex + 1;
            String str = s.substring(i, i + length);
            decodedString.add(str);
            i += length;
        }
        return decodedString;
    }

    public static void main(String[] args) {
        Codec codec = new Codec();
        List<String> originalStrings = Arrays.asList("hello", "world", "encode");

        String encodedString = codec.encode(originalStrings);
        System.out.println("encode: " + encodedString);

        List<String> decodedString = codec.decode(encodedString);
        System.out.println("decode: " + decodedString);
    }
}
