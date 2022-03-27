package com.pkg;

import java.util.Stack;

public class brackets {
    public boolean validate_brackets(String input) {
        boolean answer;
        Stack<Character> startbracket = new Stack<Character>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '{' ||
                input.charAt(i) == '[' ||
                input.charAt(i) == '(') {
                startbracket.push(input.charAt(i));
            }
            else
            {

            if (startbracket.isEmpty()) {
                answer=false;
                return answer;
            }
            if (input.charAt(i) == '}' && startbracket.peek() == '{' ||
                input.charAt(i) == ']' && startbracket.peek() == '[' ||
                input.charAt(i) == ')' && startbracket.peek() == '(') {
                startbracket.pop();

                }
            }
        }
        //if something still it will return false
        answer=startbracket.isEmpty();
        return answer;
    }
}
