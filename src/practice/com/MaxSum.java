package practice.com;

import java.util.ArrayList;
import java.util.List;

public class MaxSum {
    // Kadane's Algorithm - InterviewBit
    public static void main(String[] args) {
        MaxSum m = new MaxSum();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-2);
        arrayList.add(1);
        arrayList.add(-3);
        arrayList.add(4);
        arrayList.add(-2);
        arrayList.add(3);
        arrayList.add(-2);
        arrayList.add(12);
        arrayList.add(-5);
        arrayList.add(4);
        m.maxSubArray(arrayList);
    }
    public int maxSubArray(final List<Integer> A) {

        int sum = Integer.MIN_VALUE;
        int last = 0;

        for (int num : A) {
            last += num;
            sum = Math.max(sum, last);
            if (last < 0)
                last = 0;
        }
        return sum;
    }
}
