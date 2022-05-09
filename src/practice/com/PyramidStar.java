package practice.com;

import java.util.Scanner;

public class PyramidStar {

        public static void main(String[] args) {
            // YOUR CODE GOES HERE
            // Please take input and print output to standard input/output (stdin/stdout)
            // DO NOT USE ARGUMENTS FOR INPUTS
            // E.g. 'Scanner' for input & 'System.out' for output
            Scanner scan = new Scanner(System.in);
            int ip = scan.nextInt();
            printStar(ip);
        }
        static void printStar(int ip) {
            // rows
            for (int i = 1; i <= ip; i++) {
                // spaces
                for (int j = ip - i; j >= 1; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }

}
