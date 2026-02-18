package practice.com;

public class BinarySearchMetaQ1 {

    public static void main(String[] args) {
        int[] ip = {-1, 2, 4, 5, 6, 7, 8, 9, 22, 23, 25, 45, 56, 67, 77};
        int k = -2;
        int first = 0, last = ip.length - 1, result = -1;

        while (first <= last) {
            // avoid int overflow
            int mid = first + (last - first)/2;

            if (ip[mid] > k) {
                last = mid - 1;
                result = mid;
            } else {
                first = mid + 1;
            }
        }
        System.out.println("result : " + result);
        System.out.println("index : " + ip[result]);
    }

}
