package com.arena.old;

public class Fibanocci {

    // Using DP => Recursive

    public static void main(String[] args) {
        System.out.println(java.time.LocalDateTime.now());
        System.out.println(fib(55));
        System.out.println(java.time.LocalDateTime.now());
    }

    public static long fib(int n) {
        long f[] = new long[n];
        if (n <= 2) return 1;

        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i < n; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n - 1];
    }

}
