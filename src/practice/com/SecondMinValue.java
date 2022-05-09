package practice.com;

public class SecondMinValue {
    public static void main(String[] args) {
        int arr[] = {0,-9,8,77,-54,-79,90,66,4};
        int least = Integer.MAX_VALUE;
        int sleast = Integer.MAX_VALUE;

        for(int i : arr) {
            if (i < least) {
                sleast = least;
                least = i;
            } else if (i < sleast) {
                sleast = i;
            }
        }
        System.out.println("s: " + sleast);
    }
}
