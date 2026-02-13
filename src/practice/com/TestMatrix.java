package practice.com;

import static java.sql.Types.INTEGER;

public class TestMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                { 32, 23, 3},
                { 23,  7, 5}
        };

        System.out.println(averageRowMinimum(matrix));
        System.out.println(averageColumnMinimum(matrix));

    }

    public static int averageRowMinimum(int[][] matrix) {
        int[] arr = new int[matrix.length];
        for (int r = 0; r < matrix.length;  r++) {
            int rSmall = Integer.MAX_VALUE;
            for (int c = 0; c < matrix[0].length;  c++) {
                if (rSmall > matrix[r][c]) {
                    rSmall = matrix[r][c];
                }
            }
            arr[r] = rSmall;
        }
        return average(arr);
    }

    public static int averageColumnMinimum(int[][] matrix) {
        int[] arr = new int[matrix[0].length];
        for (int c = 0; c < matrix[0].length;  c++) {
            int cSmall = Integer.MAX_VALUE;
            for (int r = 0; r < matrix.length;  r++) {
                if (cSmall > matrix[r][c]) {
                    cSmall = matrix[r][c];
                }
            }
            arr[c] = cSmall;
        }
        return average(arr);
    }

    public static int average(int[] avg) {
        int i = 0;
        for (int a : avg) {
            i += a;
        }
        return (i / avg.length);
    }

}
