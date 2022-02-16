package com.arena.old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackEx {

    private final List<Character> leftBrackets = Arrays.asList('<','{','[','(');
    private final List<Character> rightBrackets = Arrays.asList('>','}',']',')');
    private int[] items;
    private int count = 0;

    public StackEx(int length) {
        items = new int[length];
    }

    public void push(int item){
        if(items.length == count)
            throw new StackOverflowError();

            items[count++] = item;
    }

    public int pop(){
        if(count == 0)
            throw new IllegalStateException();
       return items[--count];
    }

    public int peek(){
        if(count == 0)
            throw new IllegalStateException();
        return items[count - 1];
    }

    public boolean isEmpty(){
        return (count == 0);
    }

    @Override
    public String toString(){
        int[] content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }

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
        Stack<Character> charStack = new Stack<>();

        for(char ch : input.toCharArray()) {
            if(isLeftBracket(ch))
                charStack.push(ch);

            if(isRightBracket(ch)) {
                if(charStack.empty()) return false;
                char top = charStack.pop();
                if(isBracketMatched(ch, top)) return false;
            }
        }

        return charStack.empty();
    }

    private boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch){
        return rightBrackets.contains(ch);
    }

    private boolean isBracketMatched(char left, char right){
        return  leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }

}
