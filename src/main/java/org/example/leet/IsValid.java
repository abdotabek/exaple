package org.example.leet;

import java.util.Stack;

/**
 *
 * Вам дана строка s, состоящая из следующих символов: '(', ')', '{', '}', '[' и ']'.
 * Входная строка s является допустимой тогда и только тогда, когда:
 * Каждая открывающая скобка закрывается закрывающей скобкой того же типа.
 * Открывающие скобки закрываются в правильном порядке.
 * Каждая закрывающая скобка имеет соответствующую открывающую скобку того же типа.
 * Верните true, если s является допустимой строкой, и false в противном случае.
 * */


public class IsValid {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        //    проходим по каждому символу в строке
        for (char c : s.toCharArray()) {
            //  если это открывающая скобка, добавляем в стек
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } // если это закрывающая скобка
            else {
                // Если стек пуст (нет открывающих скобок) или
                //  текущая закрывающая не соответствует последний открывающей
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        // строка валидна только если все скобки закрыты (стек пуст)
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        IsValid isValid = new IsValid();
        boolean x = isValid.isValid("[(])");
        System.out.println(x);
    }
}
