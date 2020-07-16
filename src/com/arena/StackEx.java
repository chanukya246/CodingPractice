package com.arena;

import java.util.Stack;

public class StackEx {

    public String reversedString(String input){
        if(input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack();
        for(char ch : input.toCharArray())
            stack.push(ch);

        StringBuffer revStr = new StringBuffer();
        while(!stack.empty())
            revStr.append(stack.pop());

        return revStr.toString();
    }

    public boolean isBalanced(String input){
        if(input == null)
            throw new IllegalArgumentException();

        Stack<Character> charStack = new Stack<>();
        for(char ch : input.toCharArray()) {
            if(ch == '<' || ch == '{' || ch == '[' || ch == '(')
                charStack.push(ch);
            if(ch == '>' || ch == '}' || ch == ']' || ch == ')') {
                if(charStack.empty()) return false;
                charStack.pop();
            }
        }
        return charStack.empty();
    }
}
