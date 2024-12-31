package practice.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {
    public static void main(String[] args) {
        String s = "Marge, let's \"[went].\" I await {news} telegram.";
        char[] ch = s.trim().toLowerCase().replaceAll(" ", "").toCharArray();
        List<Character> list = new ArrayList<>();


        for(char c : ch) {
            if ((c > 96 && c <= 123) || (c > 47 && c <= 57)) {
                list.add(c);
            }
        }


        int left = 0, right = list.size() - 1;
        while (left < (list.size() / 2) && right >= (list.size() / 2)) {
            if (list.get(left) == list.get(right)){
                left++;
                right--;
            }
        }

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }


}
