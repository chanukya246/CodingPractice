package com.arena.old;

import java.util.*;
import java.util.stream.Collectors;

public class Hello {

    public static void main(String[] args) {
        Hello h = new Hello();
        int[] a = {1,2,3, -1,44, -99, -5,0};
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        A.add(-98);
        A.add(54);
        A.add(-52);
        A.add(-97);


        System.out.println(h.solve(A));
        // -98, 54, -52, 15, 23, -97, 12, -64, 52, 85
//        h.addZero(Arrays.stream(a).boxed().collect(Collectors.toList()));
    }
    ArrayList<Integer> A1 = new ArrayList<>();

    public int solve(ArrayList<Integer> A) {
        int eMax = Integer.MIN_VALUE;
        int oMin = Integer.MAX_VALUE;

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) % 2 == 0 ) {
                eMax = Math.max(A.get(i), eMax);
            } else {
                oMin = Math.min(A.get(i), oMin);
            }
        }

        return eMax - oMin;
             }



}
