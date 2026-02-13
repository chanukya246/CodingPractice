package com.java.demo;

import java.util.HashSet;
import java.util.Set;

public class BoyOrGirl {

    public static void findBoyGirl(String ip) {
        char[] ipArray = ip.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : ipArray) {
            set.add(c);
        }
        if (set.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }

}
