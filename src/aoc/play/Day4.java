package aoc.play;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day4 {
    static long startTime;
    public static void main(String[] args) {
        startTime = System.currentTimeMillis();
        String input = "src/aoc/input/files/day4_ip.txt";
        day4part1(input);
    }

    private static void day4part1(String input) {
        char[][] twoDarr = new char[140][140];

        try (BufferedReader br = new BufferedReader(new FileReader(input))) {
            loaded2dArray(br, twoDarr);
            int i = 0, result = 0;
            while (i >= 0 && i < 140) {
                int j = 0;
                while (j >= 0 && j < 140) {
                    if (twoDarr[i][j] == 'X') {
                        int incDecBy1 = 1;
                        int incDecBy2 = 2;
                        int incDecBy3 = 3;
                        if ((coordinatesSafe(i + incDecBy1, j) && twoDarr[i + incDecBy1][j] =='M')
                                && (coordinatesSafe(i + incDecBy2, j) && twoDarr[i + incDecBy2][j] =='A')
                                && (coordinatesSafe(i + incDecBy3, j) && twoDarr[i + incDecBy3][j] =='S')) {
                            result++;
                        }
                        if ((coordinatesSafe(i, j + incDecBy1) && twoDarr[i][j + incDecBy1] =='M')
                                && (coordinatesSafe(i, j + incDecBy2) && twoDarr[i][j + incDecBy2] =='A')
                                && (coordinatesSafe(i, j + incDecBy3) && twoDarr[i][j + incDecBy3] =='S')) {
                            result++;
                        }
                        if ((coordinatesSafe(i - incDecBy1, j) && twoDarr[i - incDecBy1][j] =='M')
                                && (coordinatesSafe(i - incDecBy2, j) && twoDarr[i - incDecBy2][j] =='A')
                                && (coordinatesSafe(i - incDecBy3, j) && twoDarr[i - incDecBy3][j] =='S')) {
                            result++;
                        }
                        if ((coordinatesSafe(i, j - incDecBy1) && twoDarr[i][j - incDecBy1] =='M')
                                && (coordinatesSafe(i, j - incDecBy2) && twoDarr[i][j - incDecBy2] =='A')
                                && (coordinatesSafe(i, j - incDecBy3) && twoDarr[i][j - incDecBy3] =='S')) {
                            result++;
                        }
                        if ((coordinatesSafe(i + incDecBy1, j + incDecBy1) && twoDarr[i + incDecBy1][j + incDecBy1] =='M')
                                && (coordinatesSafe(i + incDecBy2, j + incDecBy2) && twoDarr[i + incDecBy2][j + incDecBy2] =='A')
                                && (coordinatesSafe(i + incDecBy3, j + incDecBy3) && twoDarr[i + incDecBy3][j + incDecBy3] =='S')) {
                            result++;
                        }
                        if ((coordinatesSafe(i + incDecBy1, j - incDecBy1) && twoDarr[i + incDecBy1][j - incDecBy1] =='M')
                                && (coordinatesSafe(i + incDecBy2, j - incDecBy2) && twoDarr[i + incDecBy2][j - incDecBy2] =='A')
                                && (coordinatesSafe(i + incDecBy3, j - incDecBy3) && twoDarr[i + incDecBy3][j - incDecBy3] =='S')) {
                            result++;
                        }
                        if ((coordinatesSafe(i - incDecBy1, j + incDecBy1) && twoDarr[i - incDecBy1][j + incDecBy1] =='M')
                                && (coordinatesSafe(i - incDecBy2, j + incDecBy2) && twoDarr[i - incDecBy2][j + incDecBy2] =='A')
                                && (coordinatesSafe(i - incDecBy3, j + incDecBy3) && twoDarr[i - incDecBy3][j + incDecBy3] =='S')) {
                            result++;
                        }
                        if ((coordinatesSafe(i - incDecBy1, j - incDecBy1) && twoDarr[i - incDecBy1][j - incDecBy1] =='M')
                                && (coordinatesSafe(i - incDecBy2, j - incDecBy2) && twoDarr[i - incDecBy2][j - incDecBy2] =='A')
                                && (coordinatesSafe(i - incDecBy3, j - incDecBy3) && twoDarr[i - incDecBy3][j - incDecBy3] =='S')) {
                            result++;
                        }
                    }
                    j++;
                }
                i++;
            }
            System.out.println("result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean coordinatesSafe(int x, int y) {
        return (x >= 0 && y >= 0 && x < 140 && y < 140);
    }

    private static void loaded2dArray(BufferedReader br, char[][] twoDarr) throws IOException {
        String line;
        int i = 0;
        while ((line = br.readLine()) != null && i < 140) {
            for (int j = 0; j < 140; j++) {
                twoDarr[i][j] = line.charAt(j);
            }
            i++;
        }
    }

}
