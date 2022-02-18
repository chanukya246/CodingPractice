package com.arena.old;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Hello {

    public static void main(String[] args) {
        Hello h = new Hello();
        int[] a = {1,2,3, -1,44, -99, -5,0};
        h.addZero(a);
    }
     public void addZero(int[] a) {
         List<Integer> list = Arrays.stream(a)        // IntStream
                                    .boxed()          // Stream<Integer>
                                    .collect(Collectors.toList());
         Collections.sort(list);
         System.out.println(list);
        // O(n^2)
//        for (int i = 0; i < a.length; i++) {
//            for (int j = a.length - 1; j <= 0 && j != i; j--) {
//                if (a[i] + a[j] == 0)
//                    System.out.println(a[i] + a[j] );
//            }
//        }

     }

}
