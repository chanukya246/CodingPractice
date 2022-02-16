package com.arena.old;

import java.util.ArrayDeque;
import java.util.Deque;


public class NewTest {

        /*
         * Complete the 'getMin' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts STRING s as parameter.
         */

        public static int getMin(String s) {
            // Write your code here
            if(s.isEmpty()){
                return 0;
            }
            Deque<Character> stack = new ArrayDeque<>();
            int counter = 0;
            // Traversing the Expression
            for (int i = 0; i < s.length(); i++) {
                char x = s.charAt(i);
                if (x == '(') {
                    stack.push(x);
                    continue;
                }

                char check;
                switch (x) {
                    case ')':
                        check = stack.pop();
                        break;
                }
            }
            return 0;
        }
    }

