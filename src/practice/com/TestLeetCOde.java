package practice.com;

import java.util.Arrays;

public class TestLeetCOde {

    public static void main(String[] args) {
        int arr[] = {3, 5, 4, 1, 9};
        System.out.println(Arrays.toString(testM(arr)));
    }

    public static int[] testM(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i : arr) {
            if (i >= max) {
                max = i;
            } else {
                min = i;
            }
        }

        return new int[]{min, max};
    }
}
