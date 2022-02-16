package com.arena.old;

public class RevInteger {

    public static void main(String[] args) {
        int num = 123456;
        String str = String.valueOf(num);
        char[] ch = str.toCharArray();

        for (int i = str.length(); i > 0;  i--) {
            System.out.print(ch[i-1]);
        }
    }
}
